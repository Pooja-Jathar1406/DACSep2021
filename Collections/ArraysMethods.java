
import java.util.*;

class ArraysMethods{
	public static void main(String args[]){
		
		
		int arr[]={34,76,45,87,10, 21 , 6, 45, 32}; 
		
		Arrays.sort(arr,3,6);
		Arrays.fill(arr, 4,6,56); 
		String s= Arrays.toString(arr); 
		System.out.println(s);
		Arrays.sort(arr);                              //sorts the array
		for(int i : arr){
			System.out.println(i);
		}
		
		int a= Arrays.binarySearch(arr,21);               //for binarSearch array must be sorted first
		System.out.println("21 : "+a);
		
		
	}
}