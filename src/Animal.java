
class Animal {
	//properties
	private String name;
	private Integer age;
	private String additionalInfo = "I don't know what kind of animal it is :)";
	
	//Constructors
	public Animal() {}
	public Animal(String name, Integer age) {
		setName(name);
		setAge(age);	
	}
	
	//Methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.trim().length()!=0) {
			this.name = name;
		}
		else {
			System.err.println("NAME IS EMPTY!");
		}	
	}
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		if(age > 0) {
			this.age = age;
		}
		else {
			System.err.println("WRONG AGE!");
		}
	}
	
	public void info() {
		info("ANIMAL", additionalInfo);
	}
	public void info(String type, String additionalInfo) {
		System.out.println("######THIS IS " + type +"######");
		System.out.printf("%s (%d years)\nExtra info:\n", name, age);
		System.out.printf("%s\n", additionalInfo);
		System.out.println("#########################\n");
		
	}
}

