import java.util.*;
class SelectionSort{
	/*Complexity
	   Worst case: O(n^2)
	   Best case: O(n^2)
	*/
	//print the array
	public static void printArray(int arr[]){
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  " );
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		int n, a[],i, loc,j, temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("How many elements do you want to enter: ");
		n=sc.nextInt();
		a= new int [n];
		System.out.println("Enter array elements: ");
		for(i=0; i<n ; i++){
			a[i] = sc.nextInt();
		}
		System.out.println("Entered array: ");
		printArray(a);
		for(i = 0; i<n; i++){
			loc = i;
			for(j = i+1;j<n; j++){
				if(a[j] < a[loc]){
					loc = j;
				}
			}
			temp = a[i];               //swapping minimum element
			a[i] = a[loc];
			a[loc] = temp;
		}
		System.out.println("Array after selection sort : ");
		printArray(a);
	}
	
}