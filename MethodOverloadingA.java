package practicebeginner.Concepts;

public class MethodOverloadingA {
	static int plusMethod(int x, int y) 

	 { 
	  return x + y; 
	 } 
	 
	 static double plusMethod(double x, double y)  

	{ 
	 return x + y; 
	} 

	public static void main(String[] args)  

	{ 
	  int myNum1 = plusMethod(8, 5); 
	  double myNum2 = plusMethod(4.3, 6.26); 
	  System.out.println("Call the PlusMethod with 'int' as parameter: " + myNum1); 
	  System.out.println("call the PlusMethod with 'double' as parameter: " + myNum2); 
	} 

	 
}
