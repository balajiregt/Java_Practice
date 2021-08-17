package practicebeginner.Concepts;

public class NestedIfelse {
 
	public static void main(String args[]) {
		int num1=150, num2=250, num3=100;
		
		if(num1 >= num2) {
			if(num1 >= num3) {
				System.out.println(num1+ "is the largest number");
			}
			else {
				System.out.println(num3+ "is the largest number");
			}
		}
		else {
			if(num2 >=num3) {
				System.out.println(num2+ "is the largest number");
			}
			else {
				System.out.println(num3+ "is the largest number");
			}
		}
		
	}
}
