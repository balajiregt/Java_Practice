package practicebeginner.ExercisePrograms;
import java.util.Scanner;


public class StringReverse {  
	public static void main (String args[]) {
	       
		//To print the entered string reversely
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String text = scan.next(); //converting the scanner object to string
        int n = text.length();
        System.out.println(n);
        String rev="";
        for (int i=n-1;i>=0;i--)
         rev = rev + text.charAt(i);
        System.out.println(rev);

      }
}
