import java.util.*;
class InsertionSort{
	/*Complexity
	   Worst case: O(n)
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
		
		for(i=1; i<=n-1; i++){
			temp=a[i];
			j=i-1;
			while(( j>=0)&& (a[j]>temp)){  //first check value of j , if that condition is true then only it will check next condition bcs its logical &
				a[j+1] = a[j];
				j=j-1;
			}
			a[j+1] = temp;
		}
		System.out.println("Array after insertion sort : ");
		printArray(a);
	}
}