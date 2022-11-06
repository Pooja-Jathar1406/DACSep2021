import java.util.Scanner;
class CircularLinkedList{
	
	//Structure of node
	static class Node{
		int data;                                //data you want to store in node of LL
		Node next;                           //store address of next node
		Node(int data){              //constructor
			this.data = data;
			this.next = null;
		}
	}
	Node head = null;                   //head point which will contain address of first node
	Node tail = null; 
	//creating nodes in LL
	public void create(){
		int data, n;
		Scanner sc= new Scanner(System.in);
		do{
			System.out.println("Enter data: ");
			data = sc.nextInt();
			Node new_Node = new Node(data);
			
			if(head==null){
				head = new_Node;
				tail = new_Node;
				new_Node.next= head;
			}
			else{
				new_Node.next = head;
				head = new_Node;
				tail.next= head; 
			}
			System.out.println("Do you want to continue? If yes, press 1");
			n=sc.nextInt();
		}
		while(n==1);
	}
	// traversing the LL
	public void traverse(){
		
		Node temp = head;
		if(head == null){
			System.out.println("Linked list does not exist");
		}
		else{
			System.out.println("Linked List: ");
			do{
				System.out.print (temp.data+" ");
				temp=temp.next;
			}while(temp!=head);
		}
	}
	
	public static void main(String args[]){
		CircularLinkedList ll1 = new CircularLinkedList();
		ll1.create();
		ll1.traverse();
	}
}