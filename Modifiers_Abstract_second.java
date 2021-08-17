package practicebeginner.Concepts;

public class Modifiers_Abstract_second {
	public static void main(String[] args) {
	    // create an object of the Student class (which inherits attributes and methods from Main)
	    students myObj = new students();

	    System.out.println("Name: " + myObj.fname);
	    System.out.println("Age: " + myObj.age);
	    System.out.println("Graduation Year: " + myObj.graduationYear);
	    myObj.study(); // call abstract method
	  }
}
