package practicebeginner.Concepts;
//InstanceVariable: Static variables are also known as class variable because they are associated with the class and 
//common for all the instances of class
public class VariableTypeB {
String myclassvar="InstanceVariable";
// without 'static' it means that, it is an object of the main class
// it is not common to all instances of the main class
// it is common to specific instances which are passing its own values


public static void main(String args[]) {
	VariableTypeB obj1=new VariableTypeB();
	  VariableTypeB obj2=new VariableTypeB();
	  VariableTypeB obj3=new VariableTypeB();
	  
	//All three will display "class or static variable"
	  System.out.println(obj1.myclassvar);
	  System.out.println(obj2.myclassvar);
	  System.out.println(obj3.myclassvar);
	  
	  obj2.myclassvar="changed text";
	  
	//obj2 instance will display "Changed Text"
    System.out.println(obj1.myclassvar);
    System.out.println(obj2.myclassvar);
    System.out.println(obj3.myclassvar);
}
}
