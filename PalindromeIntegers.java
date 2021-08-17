package practicebeginner.ExercisePrograms;

import java.util.Scanner;

public class PalindromeIntegers { //using for loop
	public static void main(String[] args) {
	    Scanner inp= new Scanner(System.in);
	    System.out.print("Enter the number: ");
	    int num= inp.nextInt();
	  
	    int reverse=0, element, remainder; 
	    element = num;
	  
	    for( ;num!=0;num/=10){
	      remainder= num % 10;
	      reverse = (reverse * 10) + remainder;
	    }
	  
	    if (element == reverse){
	      System.out.println("Yes, it is palindrome");
	    }
	    else{
	      System.out.println("No, it is not palindrome");
	    }
	  }
}


/*For example, num = 252

Reminder=num%10	                        252 % 10 = 2	        25 % 10 = 5	                2 % 10 = 2
reverse = (reverse * 10) + remainder	(0 * 10) + 2 = 2	    (2 * 10) + 5 = 25	        (25 * 10) + 2 = 252
num = num / 10	                        252 / 10 = 25	        25 /10 = 2	                2 / 10 = 0
num!=0	                                25! = 0  [continue]	    2! = 0 [continue]	        0 = 0 [stop]

*/