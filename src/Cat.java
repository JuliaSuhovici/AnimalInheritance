
class Cat extends Animal{
	//properties
	private Integer hunger = 10;
	private String color;
	
	//Constructor
	public Cat(String name, Integer age, String color) {
		super(name, age);
		setColor(color);
	}

	//Methods
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if(color.trim().length()!=0) {
			this.color = color;
		}
		else {
			System.err.println("WRITE CAT'S COLOR!");
		}
	}
	
	public void info() {
		info("A CAT", "Color is " + this.color);
	}
	
	//------------------Feeding the CAT------------------//
	public void feedCat(Integer fishQuantity) {
		Integer meal = 2 * fishQuantity;
		hunger -= meal;
		if(hunger > 0) {
			System.out.println("SCRATCH!!! Is not enough. "  + this.getName() + " is still hungry :(");
		}
		else {
			System.out.println("MEOW!" + this.getName() + " is satisfied :)");
		}
	}
	
}
