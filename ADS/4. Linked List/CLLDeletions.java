import java.util.Scanner;
class CLLDeletions{
	
	int i,p,m;
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
	Node tail = null; 
	//---------------------------------------------------------------------------------------------------------------
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
				tail = new_Node;
				tail.next=head;
			}
			else{
				System.out.println(" --------  Choose where you want to insert item -------- ");
				System.out.println(" 1. Insert at begining \n 2. Insert at the end  \n 3. Insert at a specific position \n 4. Exit");
				m=sc.nextInt();
				switch(m){
					case 1: 
						new_Node.next = head;
						head = new_Node;
						tail.next=head;
						break;
					case 2:  
						tail.next=new_Node;
						tail=new_Node;
						new_Node.next = head;
						break;
					case 3:                                        //insertin at specific position
						System.out.println(" Enter the position where you want to insert: ");
						p=sc.nextInt();
						Node temp1=head;
						for(i=1; i < p; i++){
							temp1 = temp1.next;
						}
						new_Node.next=temp1.next;
						temp1.next= new_Node;
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
	//---------------------------------------------------------------------------------------------------------------
	//deletion
	public void delete(){
		int i,m, n=0, p; 
		Scanner sc= new Scanner(System.in);
		do{
			if(head == null){
				System.out.println("LL is empty");
			}
			else{
				System.out.println(" -------------  Choose where you want to Delete item ----------------");
					System.out.println(" 1. Delete from begining \n 2. Delete from the end  \n 3. Delete at a specific position \n 4. Exit");
					m=sc.nextInt();
					switch(m){
						case 1:
							Node temp = head;
							temp = temp.next;
							head = temp;
							tail.next=head;
							break;
						case 2:
							Node temp1 = head;
							Node ptr1 = temp1.next;
							while(ptr1.next != head){
								temp1 = ptr1;
								ptr1 = ptr1.next;
							}
							temp1.next=head;
							tail=temp1;
							break;
						case 3:
							System.out.println(" Enter the position where you want to delete: ");
							p=sc.nextInt();
							Node temp2= head;
							Node ptr2= temp2.next;
							for(i=1; i< p-1 ;i++){
								temp2 = ptr2;
								ptr2 = ptr2.next;
							}
							temp2.next = ptr2.next;
							break;
						case 4:
							break;
						default:
							System.out.println("Invalid choice");
					}
			}
			System.out.println("do you want to delete more items? if yes press 1: ");
			n = sc.nextInt();
	    }while(n==1);
	}
	//---------------------------------------------------------------------------------------------------------------
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
		CLLDeletions ll1 = new CLLDeletions();
		ll1.creation();
		ll1.traverse();
		ll1.delete();
		ll1.traverse();
	}
}