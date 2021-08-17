package practicebeginner.Concepts;
//abstract class
abstract class Modifiers_Abstract {
	public String fname = "John";
	  public int age = 24;
	  public abstract void study(); // abstract method
}
//Subclass (inherit from Main)
class students extends Modifiers_Abstract  {
public int graduationYear = 2018;
public void study() { // the body of the abstract method is provided here
 System.out.println("Studying all day long");
}
}
//End code from filename: Modifiers_Abstract.java
