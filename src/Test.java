public class Test {
	public static void main(String args[]) {
		Animal ani1 = new Dog();
		// ani1.barked(); 		ERROR
		Dog dog1 = (Dog) ani1; 	// Downcasting animal -> dog
		dog1.barked();			// Valid
		
		/* Note
		Animal ani2 = new Animal();
		Dog dog2 = (Dog) ani2;		// ERROR, Let compare over case.
		*/
		
		Dog dog2 = new Dog();
		Animal ani2 = dog2;				// Upcatting with out a explicit cast
		Animal ani3 = (Animal) dog2;	// Upcatting with a explicit cast
		// ani2.barker();		ERROR
		ani2.eat();
		
		Dog dog3 = (Dog) ani2;	// Downcasting
		dog3.barked();
	}
}

class Animal {
	public void eat() {
		System.out.println("Eating...");
	}
}

class Dog extends Animal {
	public void barked() {
		System.out.println("gau gau");
	}
}