import java.util.*;
class LLOperations{
	
	class Node{
		int data;
		Node next;
		Node(int data ){
			this.data=data;
			this.next=null;
		}
	}
	Node head = null;
	//--------------------------------------------------------------------
	public void create(){
		int data,i, m,n=0,p;
		Scanner sc= new Scanner(System.in);
		do{
			System.out.println("Enter data: ");
			data = sc.nextInt();
			Node newNode=new Node(data);
			
			if(head == null){
				head = newNode;
			}
			else{
				System.out.println(" --------  Choose where you want to insert item --------");
				System.out.println(" 1. Insert at begining \n 2. Insert at the end  \n 3. Insert at a specific position \n 4. Exit");
				m=sc.nextInt();
				switch(m){
					case 1:
						newNode.next=head;
						head=newNode;
						break;
					case 2:
						Node temp = head ;
						while(temp.next != null){
							temp = temp.next;
						}
						temp.next = newNode;
					    break;
					case 3:
						System.out.println(" Enter the position where you want to insert: ");
						p = sc.nextInt();
						Node temp1 = head;
						for(i=1; i < p; i++){
							temp1 = temp1.next;
						}
						newNode.next = temp1.next;
						temp1.next = newNode;
					    break;
					case 4:
					    break;	
					default:
						System.out.println("Invalid choice");
				}
			}
			System.out.println("do you want to insert more items? if yes press 1: ");
			n = sc.nextInt();
		}while(n == 1);
	}
	//--------------------------------------------------------------------
	public void reverse(Node n){
		Node prev = null;
		Node current = head;
		Node next = null;
		
		while(next!=null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
        return head;
	}
	//--------------------------------------------------------------------
	public void findNthNode(){
		System.out.println(" Enter the position of node which you want : ");
		p=sc.nextInt();
		Node temp5= head;
		Node ptr5= temp5.next;
		for(i=1; i< p-1 ;i++){
			temp5 = ptr5;
			ptr5 = ptr5.next;
		}
		return ptr5;
	}
	
	//--------------------------------------------------------------------
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
							break;
						case 2:
							Node temp1 = head;
							Node ptr1 = temp1.next;
							while(ptr1.next != null){
								temp1 = ptr1;
								ptr1 = ptr1.next;
							}
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
	//--------------------------------------------------------------------
	public void traverse(){
		Node temp=head;
		if(head == null){
			System.out.println("LL is empty");
		}
		else{
			System.out.println("--------   LL  --------");
			while(temp != null){
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
		System.out.println();
	}
	//--------------------------------------------------------------------
	public void countNoOfNodes(){
		Node temp=head;
		int count =0;
		if(head == null){
			System.out.println("LL is empty");
		}
		else{
			System.out.println("--------   LL  --------");
			while(temp != null){ 
				temp=temp.next;
				count++;
			}
		}
		System.out.println("No. of nodes in LL: " +count);
		System.out.println();
	}
	//--------------------------------------------------------------------
	public void maxElementofLL(){
		int max=0;
		Node temp = head;
		while(temp!=null){
			if(temp.data>max){
				max=temp.data;
			}
			temp=temp.next;
		}
		System.out.println("Max element of LL: " +max);
		System.out.println();
	}
	//--------------------------------------------------------------------
	public void sortLL(){
		int count=0;
		//counting no of elements
		if(head!=null){
			Node temp = head;
			while(temp!=null){
				temp=temp.next;
				count++;
			}
		}
		System.out.println("No. of nodes in LL: " +count);
		//sorting
		for(int i = 0; i<count; i++){
				Node temp1 =head;
				Node temp2 =temp1.next;
				int d;
			for(int j=0; j<count-i-1;j++){
				if(temp1.data > temp2.data){
					d=temp1.data;
					temp1.data = temp2.data;
					temp2.data = d;
				}
				temp1 = temp2;
				temp2= temp2.next;
			}
		}
		System.out.println("Sorted LL is: ");
		Node temp3 = head;
		while(temp3 != null){
			System.out.print(temp3.data+"  ");
			temp3=temp3.next;
		}
		System.out.println();
	}
	//--------------------------------------------------------------------
	public static void main(String args[]){
		
		LLOperations ll1= new LLOperations();
		ll1.create();
		ll1.traverse();
		ll1.delete();
		ll1.traverse();	
		ll1.countNoOfNodes(); 
		ll1.maxElementofLL();
		ll1.sortLL();
	}
	
}