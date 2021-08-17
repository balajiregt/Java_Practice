//Class, Objects and Methods
package practicebeginner.ExercisePrograms;

import java.util.Scanner;


public class Calculator {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan1=new Scanner(System.in);
       System.out.println("Enter the first number");
       int num1=scan1.nextInt();
      
       
       System.out.println("Enter the second number");
       int num2=scan1.nextInt();
      
       
       System.out.print("Enter an operator (+, -, *, /): ");
       char operator = scan1.next().charAt(0);
       scan1.close();
       
       float Result = 0;
       switch(operator)
		{
			case '+':
				Result=num1+num2;
				break;
				
			case '-':
				Result=num1-num2;
				break;
				
			case '/':
				Result=num1/num2;
				break;
			case '*':
				Result=num1*num2;
				break;
				
			default:
				System.out.println("Please enter valid operator");
				return;
		}
       System.out.println(num1+" "+operator+" "+num2+"= "+Result);
	}

}
