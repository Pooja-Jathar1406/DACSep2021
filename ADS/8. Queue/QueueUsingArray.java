import java.util.*;
/*
- need to define a size 
- insertion (enque) will be from rear only
- deletion (dequeue)will also be from front only
------------------ Time complexities -----------------------
TODO
enque()		: Best case-->    &  Worst case -->  
dequeue()		: Best case-->    &  Worst case -->  
display()       : Best  &  Worst case -->  )

Applicatons:

*/
class Queue{
	int F = -1;
	int R = -1;
	int size = 10;
	int q[ ] = new int[size];
	Scanner sc= new Scanner(System.in);
	
	//-----------------------------------------------------------------------------------------------
	//---- enqueue method
	public void enqueue(){
		//check if overflow
		if(isFull()){           // size is size of array
			System.out.println("Overflow");
		}
		else{
			System.out.println("Enter the data: ");
			int i = sc.nextInt();
			if(F == -1 && R == -1){    // queue is empty
				F = 0;
				R = 0;
				q[R] = i;
				System.out.println("Item enqueued: ");
			}
			else{           // queue has some elements
				R = R+1;
				q[R] = i;
				System.out.println("Item enqueued: ");
			}
		}
	} 

    //-----------------------------------------------------------------------------------------------
	//---- dequeue method
	public void dequeue(){
		//check if underflow   
		if(isEmpty()){          
			System.out.println("Underflow");
		}
		else{
			F = F+1;
			System.out.println("item dequeued");
		}
	}
    //-----------------------------------------------------------------------------------------------
	//print queue
	public void display( ){
		System.out.println("Items in queue are: ");
		for(int i = F; i<=R; i++){
			System.out.print( q[ i ] +"  ");
		}
		System.out.println();
	}
	//-----------------------------------------------------------------------------------------------
	//---------  isEmpty method  ---------
	boolean isEmpty() {
		if(F==-1 && R==-1)
			return true;
		else 
			return false ;
	} 
	//---------  isFull method  ---------
	boolean isFull() {
		if(R == (size-1))
			return true;
		else 
			return false ;
	} 
	
	//-----------------------------------------------------------------------------------------------
}
class QueueUsingArray{
	
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		Queue q1 = new Queue();
		int choice;
		do{
			System.out.println("-------------------------------------");
			System.out.println("Choose what you want to do!!");
			System.out.println(" 1. Enqueue \n 2. Dequeue  \n 3. Display the queue \n 4. Exit");
			choice=sc.nextInt();
			switch(choice){
				case 1: 
					q1.enqueue();
					break;
				case 2: 
					q1.dequeue();
					break;
				case 3: 
					q1.display();
					break;
				case 4: 
					break;
				default:
					System.out.println("Invalid choice!");
			} 
		}
		while(choice != 4 );
		System.out.println("Exit successfully");
	}
}