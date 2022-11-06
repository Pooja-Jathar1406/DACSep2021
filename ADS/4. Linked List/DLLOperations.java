import java.util.*;
class DLLOperations{
	static class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	Node head = null;
	Node tail = null;
	
	public void insert(){
		int  data, m, n, p=0;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Enter data: ");
			data= sc.nextInt();
			Node newNode = new Node(data);
			
			if(head == null){
				head = newNode;
				tail = newNode;
			}
			else{
				System.out.println(" --------  Choose where you want to insert item -------- ");
				System.out.println(" 1. Insert at begining \n 2. Insert at the end  \n 3. Insert at a specific position \n 4. Exit");
				m=sc.nextInt();
				switch(m){
					case 1: 
						newNode.next = head;
						head.prev = newNode;
						head = newNode;
						//tail = newNode;
					    break;
					case 2:
						tail.next = newNode;
						newNode.prev = tail;
						tail = newNode;
					    break;
					case 3:
						System.out.println(" Enter the position where you want to insert: ");
						p=sc.nextInt();
						Node temp1=head;
						Node ptr1= temp1.next;
						for(int i=1; i<p-1; i++){
							temp1 = ptr1;
							ptr1 = ptr1.next;
						}
						newNode.prev = temp1;
						newNode.next=ptr1;
						temp1.next=newNode;
						ptr1.prev=newNode;
					    break;
					case 4:
					    break;
					default:
					    System.out.println(" Invalid choice");
				}
			}
			System.out.println("Do you want to insert more data? if yes press 1: ");
			n=sc.nextInt();
		}while(n==1);
	}
	//-------------------------------------------------------------------------------------------------------
	//delete
	public void delete(){
		int i,m, n=0, p; 
		Scanner sc= new Scanner(System.in);
		do{
			if(head == null){
				System.out.println("LL is empty");
			}
			else{
				System.out.println(" -------------  Choose where you want to delete item ----------------");
					System.out.println(" 1. delete at begining \n 2. delete at the end  \n 3. delete at a specific position \n 4. Exit");
					m=sc.nextInt();
					switch(m){
						case 1:
							Node temp = head;
							temp = temp.next;
							head = temp;
							head.prev = null;     
							break;
						case 2:
							//if tail is given
							Node temp1 = tail;
							temp1=temp1.prev;
							temp1.next = null;
							tail=temp1;
							/*
							//if tail is not given
							Node temp1 = head;
							Node ptr1 = temp1.next;
							while(ptr1.next != null){
								temp1 = ptr1;
								ptr1 = ptr1.next;
							}*/
							temp1.next=null;
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
							ptr2.next.prev = temp2;
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
	//-------------------------------------------------------------------------------------------------------
	//traverse
	public void traverse(){
		Node temp = head;
		if(head == null){
			System.out.println("LL does not exxist");
		}
		else{
			System.out.println("--------  LL  ------");
			while(temp.next!=null){
				System.out.print(temp.data+"  ");
				temp=temp.next;
			}
		}
		System.out.println();
	}
	//-------------------------------------------------------------------------------------------------------
	public static void main(String args[]){
		DLLOperations dll1=new DLLOperations();
		dll1.insert();
		dll1.traverse();
		dll1.delete();
		dll1.traverse();
	}
}