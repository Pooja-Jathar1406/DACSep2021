/*
Circular queue:
In linear queue  if queue is filed and if we deque some data from front then those spaces will be vacant but 
we can only insert data from rare end  so the space which was vacant but still we cant use it so this is disadv of queue
to overcome this problem circular is introduces
Circular queue:
Linear queue:

*/
import java.util.*;
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
				R = (R+1)%size;
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
			if(F == R){
				System.out.println("Underflow");
				F = -1;
				R = -1;
			}
			else{
				F = (F+1)%size;
			}
		}
	}
    //-----------------------------------------------------------------------------------------------
	//print queue
	public void display( ){
		System.out.println("Items in queue are: ");
		int i;
		for(i = F; i !=R; i=(i+1)%size){
			System.out.print( q[ i ] +"  ");
		}
		System.out.println(q[ i ] +"  ");
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
		if(F == (R+1)%size)
			return true;
		else 
			return false ;
	} 
}
//-----------------------------------------------------------------------------------------------
class CircularQueueUsingArray{
	
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		Queue q1 = new Queue();
		int choice;
		do{
			System.out.println("------------  Circular Queue  ------------");
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