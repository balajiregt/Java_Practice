package practicebeginner.Concepts;

public class Break {
	
public static void main(String args[]) {
	int num=0;
	while(num<=100) {
		System.out.println(num);
		
		if(num==2) {
			break;
		}
		num++;
	}
System.out.println("Out of while-loop");


for(int var=100; var>=10; var--) {
	   System.out.println(var);
	    if (var==99)
	    {
	         break;
	    }
}
System.out.println("Out of for-loop");

}

}
