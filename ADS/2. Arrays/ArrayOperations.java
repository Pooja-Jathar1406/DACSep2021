import java.util.*;

class ArrayOperations{
	static int i, count=0;
	static boolean res;
	
	//display method
	static void display(int size, int a1[]){
		for( i=0; i<size; i++){
			System.out.print(a1[i]+" ");
		}
		System.out.println();
	}
	//search method
	static void search(int size, int a1[], int key1){
		for( i=0;i<10;i++){
			if(a1[i] == key1){
				count++;
				System.out.println("Element found at index"+i);
			}
		} 
		if(count==0){
			System.out.println("Element not found");
		}
	}  
	//insert method
	static void insert(int size, int a1[], int index, int key3){
		for( i=size; i>=index; i--){
		a1[i+1] = a1[i]; 
		}
		a1[index]=key3;
		System.out.println();
	}
	//delete method
	static void delete(int size, int a1[], int key2){
		for( i=0;i<size;i++){
			if(a1[i] == key2){              //element found
				break;
			}
		}
        for(int j = i; j<size; j++)	{
			a1[j] = a1[j+1];                       //replace deleted element with next element
		}
	}
	
	public static void main (String args[]){
		
		int a1[];
		a1= new int[100]; 
		Scanner sc  =  new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		System.out.println("Enter array elements: ");
		for (i=0; i<size;i++){
			a1[i]=sc.nextInt();
		}
		
		System.out.println("Entered array: ");
		display(size, a1);
		
		//search
		System.out.println("Enter element to search: ");
		int key1 = sc.nextInt(); 
		search(size, a1, key1);
		
		//delete an element
		System.out.println("Enter element you want to delete: ");
		int key2 = sc.nextInt();  
		delete(size, a1,key2);
		
		System.out.println("after deleting "+key2+" : ");
		display(size, a1);
		
		//insert an element
		System.out.println("Enter index of array where you want to insert the element: ");
		int index = sc.nextInt();  
		System.out.println("Enter element you want to insert: ");
		int key3 = sc.nextInt();  
		insert(size, a1, index, key3);
		
		System.out.println("after inserting "+key3+" : ");
		display(size+1, a1);
	}
}
 