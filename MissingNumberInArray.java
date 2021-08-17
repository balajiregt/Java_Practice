package practicebeginner.ExercisePrograms;

public class MissingNumberInArray {
	
	//Calculate A = n (n+1)/2 where n is largest number in series 1…N.
	//Calculate B = Sum of all numbers in given series
			//Missing number = A – B
	
	public static void main(String[] args) {
		 
        int[] arr1={7,5,6,1,4,2};
       
   
        int n=arr1.length+1;
        int sum=n*(n+1)/2;
        System.out.println("The total sum of array elements: "+sum);
        
        int restSum=0;
        
        for (int i = 0; i < arr1.length; i++) {
            restSum+=arr1[i];
        }
        System.out.println("The total sum of restsum array elements: "+restSum);
        
        int missingNumber=sum-restSum;
        System.out.println("Missing number from array arr1: "+missingNumber);
      
    }
}
