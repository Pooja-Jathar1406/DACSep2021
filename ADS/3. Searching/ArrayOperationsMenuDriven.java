import java.util.*;

class ArrayOperationsMenuDriven{
	Scanner sc  =  new Scanner(System.in);
	static int i, count=0;
	static boolean res;
	
	//display method
	void display(int size, int a1[]){ 
		System.out.println("Entered array: ");
		for( i=0; i<size; i++){
			System.out.print(a1[i]+" ");
		}
		System.out.println();
	}
	//search method
	void search(int size, int a1[]){ 
		System.out.println("Enter element to search: ");
		int key1 = sc.nextInt(); 
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
	void insert(int size, int a1[]){ 
		System.out.println("Enter index of array where you want to insert the element: ");
		int index = sc.nextInt();  
		System.out.println("Enter element you want to insert: ");
		int key3 = sc.nextInt();  
		
		for( i=size; i>=index; i--){
		a1[i+1] = a1[i]; 
		}
		a1[index]=key3;
		System.out.println();
		size = size++;
	}
	//delete method
	void delete(int size, int a1[]){ 
		System.out.println("Enter element you want to delete: ");
		int key2 = sc.nextInt();  
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
		
		int a1[], choice;
		a1= new int[100]; 
		
	    Scanner sc  =  new Scanner(System.in);
		System.out.println("How many elements do you want to enter in array: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array elements: ");
		for (i=0; i<size;i++){
			a1[i]=sc.nextInt();
		}
		
		LinearSearchMenuDriven obj1= new LinearSearchMenuDriven();
		
	    do {
			System.out.println("-----Menu-----");
			System.out.println(" 1.Display \n 2. Search element in array \n 3. Insert \n 4. Delete \n 5. Exit");
		    System.out.println("Enter your choice: ");
		    choice=sc.nextInt();
			
			switch(choice){
				case 1:
					obj1.display(size, a1);
					break;
				case 2:
					obj1.search(size, a1);
					break;
				case 3:
					obj1.insert(size, a1);
					break;
				case 4:
					obj1.delete(size, a1);
					break;
				case 5:
					break;
				default:
					System.out.println("-----invalid choice-----");
		    }
		}while(choice!=5);
	}
}
 