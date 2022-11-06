import java.util.*;

//Time complexity of linear search:
//Best case : O(1) 
//Worst case:  O(n)

class LinearSearch{
	
	static int i;
	static boolean res;
	
	//display method
	static void display(int size, int a1[]){
		for( i=0; i<size; i++){
			System.out.print(a1[i]+" ");
		}
		System.out.println();
	}
	//linear search method
	static void search(int size, int a1[], int item){
		
		for( i=0;i<size;i++){
			if(a1[i] == item){
				res=true;
				break;
			}
		}
		if(res==true){
			System.out.println("Element found at index "+i);
		}
		else
			System.out.println("Element does not exist");
	}  
	
	public static void main (String args[]){
		
		int a1[];
		a1= new int[100]; 
		Scanner sc  =  new Scanner(System.in);
		System.out.println("How many elements do you want to enter in array: ");
		int size = sc.nextInt();
		System.out.println("Enter array elements: ");
		for (i=0; i<size;i++){
			a1[i]=sc.nextInt();
		}
		
		System.out.println("Entered array: ");
		display(size, a1);
		
		//search
		System.out.println("Enter element to search: ");
		int item = sc.nextInt(); 
		search(size, a1, item);
	}
}
 