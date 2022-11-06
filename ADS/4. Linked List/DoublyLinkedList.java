import java.util.*;
class DoublyLinkedList{
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
	
	public void create(){
		int  data, m, n, p;
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
				newNode.next=head;
				head.prev = newNode;
				head = newNode;
			}
			System.out.println("Do you want to insert more data? if yes press 1: ");
			n=sc.nextInt();
		}while(n==1);
	}
	public void traverse(){
		Node temp = head;
		if(head == null){
			System.out.println("LL does not exxist");
		}
		else{
			System.out.println("--------  LL  ------");
			while(temp!=null){
				System.out.print(temp.data+"  ");
				temp=temp.next;
			}
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		DoublyLinkedList dll1=new DoublyLinkedList();
		dll1.create();
		dll1.traverse();
	}
}