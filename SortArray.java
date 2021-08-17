package practicebeginner.ExercisePrograms;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
       /* int[] arr={2,9,3,5,4,7,1,8,6};
        Arrays.sort(arr); // sort an Array using function
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }*/
		
		 int [] arr = new int [] {1, 2, 3, 4, 5};  
	        System.out.println("Original array: ");  
	        for (int i = 0; i < arr.length; i++) {  
	            System.out.print(arr[i] + " ");  
	        }  
	        System.out.println();  
	        System.out.println("Array in reverse order: ");  
	        //Loop through the array in reverse order  
	        for (int i = arr.length-1; i >= 0; i--) {  
	            System.out.print(arr[i] + " ");

    }
}
}
