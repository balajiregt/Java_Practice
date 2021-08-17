package practicebeginner.Concepts;

public class Forloop {

	 public static void main(String args[]) 
	 {
		 for(int i=1; i<=10; i++)
			 System.out.println("The value of i "+i);
		
		 int arr[]= {2,11,9,25};
		 for(int j:arr)  //enhanced for loop
			 System.out.println(j);
		 
		 
		 int arr2[]= {5,10,15,20, 23}; //looping the array elements excluding first and last element
		 for(int k=1; k<arr2.length-1; k++)
			 System.out.println(arr2[k]);
	 
	 }
}