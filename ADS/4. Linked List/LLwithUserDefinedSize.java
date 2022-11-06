import java.util.*;
class LLwithUserDefinedSize{
	
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	Node head  = null;
	//--------------------------------------------------------------------
	public void create(){
		int data, size, count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of LL :  ");
		size = sc.nextInt();
		do{
			System.out.println("Enter data : ");
			data = sc.nextInt();
			Node newNode = new Node(data);
			
			if(head == null){
				head = newNode;
			}
			else{
				newNode.next=head;
				head=newNode;
			}
			count++;
		}while(count <size);
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
    int p,i;
	//--------------------------------------------------------------------
	public void  findNthNode(){
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter the position of node which you want : ");
		p=sc.nextInt();
		Node temp5= head; 
		for( i=1; i<p ;i++){
			temp5 = temp5.next; 
		} 
		System.out.println("returned node is : "+temp5.data);
	}
	//--------------------------------------------------------------------
	//reverse method
	Node reverse(){
		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null){
			next = current.next;
			current.next =prev;
			prev = current;
			current = next;
		} 
		head = prev;
        return head;
	}
	//--------------------------------------------------------------------
	public void  findNthNodefromEnd(){
		reverse();
		findNthNode();
		reverse();
	}
	//--------------------------------------------------------------------
	/*
	//using  count and calculating mid
	public void  findMiddleOfLL(){
	    int count=0;
		//counting no of elements
		if(head!=null){
			Node temp = head;
			while(temp!=null){
				temp=temp.next;
				count++;
			}
		} 
		System.out.println("Count : "+count);
		int mid = count/2;
		Node temp6= head; 
		for( int i=0; i<mid ;i++){
			temp6 = temp6.next; 
		} 
		System.out.println("Mid node of LL : "+temp6.data);
	}
	*/
	//--------------------------------------------------------------------
	//using slow and fast pointer
	public Node  findMiddleOfLL(){
		Node fastPtr1 = head ;
		Node slowPtr1 = head ;
		while((fastPtr1 != null )&& (fastPtr1.next !=null)){
			slowPtr1 = slowPtr1.next;
			fastPtr1 = fastPtr1.next.next;
		}
		return slowPtr1;
	}
	//--------------------------------------------------------------------
	//using slow and fast pointer
	public void  findLoopInLL(){
		Node fastPtr2 = head ;
		Node slowPtr2 = head ;
		boolean loop = false;
		while((fastPtr2 != null )&& (fastPtr2.next !=null)){
			fastPtr2 = fastPtr2.next;
			slowPtr2 = slowPtr2.next;
			if(slowPtr2 == fastPtr2){
				loop = true;
			}
		}
		if(loop = true){
			System.out.println("Loop detected!");
		}
		else{System.out.println("Loop not detected!");}
	}
	
	//--------------------------------------------------------------------
	public static void main(String args[]){
		
		LLwithUserDefinedSize ll1= new LLwithUserDefinedSize();
		ll1.create();
		ll1.traverse(); 
		ll1.findNthNode();
		ll1.findNthNodefromEnd();
		ll1.traverse();
		System.out.println("Middle of LL: "+ll1.findMiddleOfLL());
		ll1.findLoopInLL();
		//ll1.reverse();
		ll1.traverse();
	}
}