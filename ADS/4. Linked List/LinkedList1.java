import java.util.Scanner;
class LinkedList1{
	
	//Structure of node
	static class Node{
		int data;                                //data you want to store in node of LL
		Node next;                           //store address of next node
		Node(int data){             //constructor
			this.data = data;
			this.next = null;
		}
	}
	Node head = null;                   //head point which will contain address of first node
	//creating nodes in LL
	public void creation(){
		int data, n;
		Scanner sc= new Scanner(System.in);
		do{
			System.out.println("Enter data: ");
			data = sc.nextInt();
			Node new_Node = new Node(data);
			
			if(head==null){
				head = new_Node;
			}
			else{
				new_Node.next = head;
				head = new_Node;
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
			while(temp!=null){
				System.out.print (temp.data+" ");
				temp=temp.next;
			}
		}
	}
	
	public static void main(String args[]){
		LinkedList1 ll1 = new LinkedList1();
		ll1.creation();
		ll1.traverse();
	}
}