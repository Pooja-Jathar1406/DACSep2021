import java.util.Scanner;
class LinkedListInsertions{
	
	int i,p,m;
	//Structure of node
	static class Node{
		int data;                      //data you want to store in node of LL
		Node next;                           //store address of next node
		Node(int data){             //constructor
			this.data = data;
			this.next = null;
		}
	}
	Node head = null;                   //head point which will contain address of first node
	//inserting nodes in LL
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
				System.out.println(" --------  Choose where you want to insert item --------");
				System.out.println(" 1. Insert at begining \n 2. Insert at the end  \n 3. Insert at a specific position \n 4. Exit");
				m=sc.nextInt();
				switch(m){
					case 1: 
						new_Node.next = head;
						head = new_Node;
						break;
					case 2: 
						Node temp =head;
						while(temp.next!=null){
							temp=temp.next;
						}
						temp.next=new_Node;
						break;
					case 3:                                        //insertin at specific position
						System.out.println("Enter position where you want to insert new node: ");
						p=sc.nextInt();
						Node temp1=head;
						for(i=0; i<p; i++){              //p= position where we want to insert new node
							temp1=temp1.next;
						}
						new_Node.next = temp1.next;
						temp1.next= new_Node;
						break;
					case 4:
						break;
					default:
					    System.out.println("Invalid choice");
				}
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
		LinkedListInsertions ll1 = new LinkedListInsertions();
		ll1.creation();
		ll1.traverse();
	}
}