
class Dog extends Animal{
	private String toy;
	
	public Dog (String name, Integer age, String toy) {
		super(name, age);
		if(toy.trim().length()!=0) {
			this.toy = toy;
		}
		else {
			System.err.println("WRITE IT'S FAVOURITE TOY!");
		}
	}
	
	//--------------FAVOURITE TOY-------------//
	public String getToy() {
		return toy;
	}

	public void setToy(String toy) {
		if(toy.equals("BALL") || toy.equals("CHEW TOY") || toy.equals("PLUSH TOY")) {
			this.toy = toy;
		}
		else {
			System.err.println("YOU ARE TRYING TO SET A FORBIDDEN TOY!");
		}
	}

	public void info() {
		info("A DOG", "Favourite toy is " + this.toy);
	}
}
