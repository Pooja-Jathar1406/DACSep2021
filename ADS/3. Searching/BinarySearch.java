import java.util.*;
/*
Array should be sorted for Binary search
Time complexity: 
Best case : O(1) 
Worst case: O(log2 N)
*/
class BinarySearch{

	public static void main (String args[]){
		
		int i,begin,mid=0,end, count=0;
		
		//a1= new int[100]; 
		Scanner sc  =  new Scanner(System.in);
		System.out.println("How many elements do you want to enter in array: ");
		int size = sc.nextInt();
		
		int a1[] = new int[size];
		
		System.out.println("Enter array elements: ");
		for (i=0; i<size;i++){
			a1[i]=sc.nextInt();
		}
		
		System.out.println("Entered array: ");
		for( i=0; i<size; i++){
			System.out.print(a1[i]+"  ");
		}
		System.out.println();
		
		//sort the array
		Arrays.sort(a1);
		System.out.println("Sorted array: ");
		for(int a : a1){
			System.out.print(a+" ");
		}
		System.out.println();
		
		//search
		System.out.println("Enter element to search: ");
		int item = sc.nextInt(); 
		
		begin=0;
		end =size-1;
		
		while(begin <= end){
			mid = (begin+end)/2;
			if(item==a1[mid]){ 
				count++;
				break;
			}
			else if(item>a1[mid]){
				begin=mid+1;
			}
			else if(item<a1[mid]){
				end=mid-1;
			}
		}
		if(count>0){
			System.out.println("Item found at "+mid);
		}
		else{
			System.out.println("Item not found ");
		}
	}
}