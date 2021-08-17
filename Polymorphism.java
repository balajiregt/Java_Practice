package practicebeginner.Concepts;

class Animal {
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}

	class Pig extends Animal {
	  public void animalSound() {
	    System.out.println("The pig says: wee wee");
	  }
	}

	class Dog extends Animal {
	  public void animalSound() {
	    System.out.println("The dog says: bow bow bow");
	  }
	}

	 class Polymorphism {
	  public static void main(String[] args) {
	    Animal myAnimal = new Animal();  // Create a Animal object
	    Pig myPig = new Pig();  // Create a Pig object
	    Dog myDog = new Dog();  // Create a Dog object
	    myAnimal.animalSound();
	    myPig.animalSound();
	    myDog.animalSound();
	  }
	}