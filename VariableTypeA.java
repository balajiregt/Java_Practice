package practicebeginner.Concepts;
//Static variable: Static variables are also known as class variable 
//because they are associated with the class and common for all the instances of class.
public class VariableTypeA { 
 public static String myClassvar="class or static variable"; //'static' means the method belongs to the main class.
 
 public static void main(String args[]) {
	  VariableTypeA obj1=new VariableTypeA();
	  VariableTypeA obj2=new VariableTypeA();
	  VariableTypeA obj3=new VariableTypeA();
	  
	//All three will display "class or static variable"
	  System.out.println(obj1.myClassvar);
	  System.out.println(obj2.myClassvar);
	  System.out.println(obj3.myClassvar);
	  
	  obj2.myClassvar="changed text";
	  
	//All three will display "Changed Text"
      System.out.println(obj1.myClassvar);
      System.out.println(obj2.myClassvar);
      System.out.println(obj3.myClassvar);
	  
 }
}
