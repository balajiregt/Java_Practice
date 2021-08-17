package practicebeginner.Concepts;

public class ContinueLoop {

	public static void main(String args[]) {
		for(int j=0; j<=6; j++) 
		{
			if(j==4)
			{
				continue;
	        }
		System.out.println(j);	
        }
		
		int counter=10;
		while (counter >=0)
		{
	           if (counter==7)
	           {
		       counter--;
		       continue;
	           }
	           System.out.print(counter+" ");
	           counter--;
		}
}
}
