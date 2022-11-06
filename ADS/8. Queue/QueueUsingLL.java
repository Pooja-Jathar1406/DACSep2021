/*
- no need to define a size
- cannot add element at specific position
- head will be named top
- insertion (push) will be at the begining only
- deletion (pop)will also be from begining only
------------------ Time complexities -----------------------
TODO
enque()		: Best case-->    &  Worst case -->  
dequeue()		: Best case-->    &  Worst case -->  
display()       : Best  &  Worst case -->  )
  
*/
import java.util.*;
class Queue{
	//--------------------------------------------------------
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	Node F = null;
	Node R = null;
	Scanner sc= new Scanner(System.in);
	
	//--------------------------------------------------------
	//---- enqueue method
	public void enqueue(){
		System.out.println("Enter the data: ");
		int data =sc.nextInt();
		Node newNode= new Node(data);
		if(isEmpty()){   // if queue is empty then insert at 1st position only
			F = newNode;
			R = newNode;
		}
		else{
			R.next = newNode;
			R = newNode;
		}
	}
	//--------------------------------------------------------
	//---- dequeue method
	public void dequeue(){
		//check if underflow   
		if(isEmpty()){          
			System.out.println("Underflow");
		}
		else{
			F=F.next;
		}
	}
	//--------------------------------------------------------
	public void display(){  
		Node temp = F;
		System.out.print("Queue --------------");
		while(temp!=null){
			System.out.print(temp.data+"  ");
			temp = temp.next;
		}
	}
	//--------------------------------------------------------
	boolean isEmpty() {
		if(F == null)
			return true;
		else 
			return false ;
	} 
}
//-------------------------------------------------------------------------------------------
class QueueUsingLL{
	
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