/*
- no need to define a size
- cannot add element at specific position
- head will be named top
- insertion (push) will be at the begining only
- deletion (pop)will also be from begining only
- time complexity : 
   push()   :  best & worst case: O(1 )
   pop()     :  best & worst case: O(1 )
   display():  best & worst case: O(n )  
*/
import java.util.*;
class Stack1{
	//--------------------------------------------------------
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	Node top = null;
	//--------------------------------------------------------
	void push(Scanner sc){
		System.out.println("Enter data: ");
		int data = sc.nextInt();
		Node newNode = new Node(data);
		if(top==null){
			top = newNode;
		}
		else{
			newNode.next = top;
			top = newNode;
		}
	}
	//--------------------------------------------------------
	public void pop(){  
		if(top == null){
			System.out.println("Stack is empty!");
		}
		else{
			top = top.next;
		}
	}
	//--------------------------------------------------------
	public void display(){  
		Node temp = top;
		while(temp!=null){
			System.out.println(temp.data+"  ");
			temp = temp.next;
		}
	}
}

//-------------------------------------------------------------------------------------------
class StackUsingLinkedList{
	
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		Stack1 s1 = new Stack1();
		int m;
		do{
			System.out.println("-------------------------------------");
			System.out.println(" Choose what you want to do!!");
			System.out.println(" 1. Push the element \n 2. Pop the element  \n 3. Display the stack \n 4. Exit");
			int choice=sc.nextInt();
			switch(choice){
				case 1: 
					s1.push(sc);
					break;
				case 2: 
					s1.pop();
					break;
				case 3: 
					s1.display();
					break;
				case 4: 
					break;
				default:
					System.out.println("Invalid choice!");
			}
			System.out.println("Enter 1 to go back to the menu or press any key to exit!");
			m=sc.nextInt();
		}
		while(m==1);
		System.out.println("Exit successfully");
	}
}