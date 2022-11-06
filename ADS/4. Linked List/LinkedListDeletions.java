import java.util.Scanner;
class LinkedListDeletions{
	
	int i,p,m, n ;
	//Structure of node
	static class Node{
		int data;                              //data you want to store in node of LL
		Node next;                          //store address of next node
		Node(int data){             //constructor
			this.data = data;
			this.next = null;
		}
	}
	Node head = null;                   //head point which will contain address of first node
	//---------------------------------------------------------------------------------------------------
	//inserting nodes in LL
	public void creation(){
		int data, n;
		Scanner sc= new Scanner(System.in);
		do{
			System.out.println("Enter data: ");
			data = sc.nextInt();
			Node new_Node = new Node(data);
			
			if(head == null){
				head = new_Node;
			}
			else{
				System.out.println(" -------------  Choose where you want to insert item ----------------");
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
						System.out.println("Enter position where you want to insert new item: ");
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
			System.out.println("Do you want to insert more items? If yes, press 1");
			n=sc.nextInt();
		}
		while(n==1);
	}
	//---------------------------------------------------------------------------------------------------
	//deleting nodes in LL
	public void delete(){
		int data, m, n,p ;
		Scanner sc= new Scanner(System.in);
		do{
			if(head==null){
				System.out.println("Linked List is empty");
			}
			else{
				System.out.println(" -------------  Choose from where you want to delete item ----------------");
				System.out.println(" 1. Delete from begining \n 2. Delete from the end  \n 3. Delete from a specific position \n 4. Exit");
				m=sc.nextInt();
				switch(m){
					case 1: 
						Node temp = head;
						temp = temp.next; 
						head = temp;
						break;
					case 2: 
						Node temp1 = head;
						Node ptr = temp1.next;
						while(ptr.next != null){
							temp1 = ptr;
							ptr = ptr.next;
						}
						temp1.next = null;
						break;
					case 3:                                        //deletion at specific position
						System.out.println("Enter position from where you want to delete the item: ");
						p=sc.nextInt();
						Node temp2=head;
						Node ptr1 =temp2.next;
						for(i=0; i<p-2; i++){              //p= position from where we want to delete a item
							temp2= ptr1;
							ptr1 = ptr1.next;
						}
						temp2.next = ptr1.next;
						break;
					case 4:
						break;
					default:
					    System.out.println("Invalid choice");
				}
			}
			System.out.println("Do you want to delete more items? If yes, press 1");
			n=sc.nextInt();
		}
		while(n==1);
	}
	//---------------------------------------------------------------------------------------------------
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
		System.out.println();
	}
	
	public static void main(String args[]){
		LinkedListDeletions ll1 = new LinkedListDeletions();
		ll1.creation();
		ll1.traverse();
		ll1.delete();
		ll1.traverse();
	}
}