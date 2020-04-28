
public class AnimalInheritance {

	public static void main(String[] args) {
		
		//--------new Animal---------//
		Animal a = new Animal("Tuzik", 5);
		a.info();
		a.setAge(10);
		a.setName(" ");   //ERROR: NAME IS EMPTY
		System.out.println("Info about animal after changes:");
		a.info();
		System.out.println("Get name: " + a.getName());
		System.out.println("Get age: " + a.getAge());
		
		//--------new Dog---------//
		// Favorite toy is added//
//		Dog myDog = new Dog("Buddy", -10, "BALL"); //ERROR: WRONG AGE
//		myDog.info();
//		myDog.setAge(10);
//		myDog.setName("King");
//		myDog.setToy("BONE"); // ERROR: FORBIDDEN TOY
//		System.out.println("Info about the dog after changes:");
//		myDog.info();
//		System.out.println("Get name: " + myDog.getName());
//		System.out.println("Get age: " + myDog.getAge());
//		System.out.println("Get toy: " + myDog.getToy());
		
		//--------new Cat---------//
//		//Color is added//
//		Cat myCat = new Cat("Salem", 2, "Black");
//		myCat.info();
//		myCat.setAge(-12);      //ERROR: WRONG AGE
//		myCat.setName(" "); 	//ERROR: NAME IS EMPTY
//		myCat.setColor("White");
//		System.out.println("Info about the cat after changes:");
//		myCat.info();
//		System.out.println("Get name: " + myCat.getName());
//		System.out.println("Get age: " + myCat.getAge());
//		System.out.println("Get toy: " + myCat.getColor());
//		
//		//Feeding cat
//		myCat.feedCat(2); //hungry
//		myCat.feedCat(1); //hungry
//		myCat.feedCat(2); // Ok	
	}

}
