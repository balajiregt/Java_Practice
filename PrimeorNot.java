package practicebeginner.ExercisePrograms;
import java.util.Scanner;
public class PrimeorNot {
	
	//a number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11).
	 public static void main(String args[])
	   {
	   	Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number:");
		//capture the input and convert the scanner object to an integer
		int num=scan.nextInt();
	    scan.close();

		   boolean isPrime = true;
		   for(int i = 2; i<=num/2; i++) //if a number is divisible by 2, then we can confirm the number is not a prime
		{
			int temp = num % i;
			if(temp==0) //if numbers modulus value is 0, then it is not a prime
		      isPrime=false;
		      break;
		}
		//If isPrime is true then the number is prime else not
		if(isPrime==true)
		   System.out.println(num + " is a Prime Number");
		else
		   System.out.println(num + " is not a Prime Number");
	   }
}
