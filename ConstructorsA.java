package practicebeginner.Concepts;

public class ConstructorsA {
int x;

public ConstructorsA(){
	x=5;
	 System.out.println("x = " + x);
}

public void nonconstructmethod() {
	int x=10;
	System.out.println("x = " + x);
}
public static void main(String args[]) {
	ConstructorsA obj1=new ConstructorsA(); //call is made to the ConstructorsA() method
	obj1.nonconstructmethod(); //	call is made to the instance method name
}
}