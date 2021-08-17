package practicebeginner.Concepts;
//Local Variable: These variables are declared inside method of the class. Their scope is limited to the method which means
//that You can’t change their values and access them outside of the method.

public class VariableTypeC {
 String myvar="Instance variable_common to the class";
 
 public void myMethod() {
	String myvar="local variable_limited to method only";
	System.out.println(myvar);
 }
 public static void main(String args[]) {
	 VariableTypeC obj1=new VariableTypeC();
	 obj1.myMethod();
	 System.out.println(obj1.myvar);
			 
 }
}
