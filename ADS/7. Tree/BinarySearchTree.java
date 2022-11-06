import java.util.*;

//---------------------------------------------------------------------------------------
//creation of Node
class Node{
	Node left, right;
	int data;
	public Node(int data){
		this.data = data;
		left = null;
		right = null;
	}
}
//---------------------------------------------------------------------------------------

class BinarySearchTree{
	Node root;
	
	// Insert method
	public void  insert(int data){
	    root = insert(root, data);
	}
	
	public Node insert(Node root , int data ){
		if(root == null){
			root = new Node(data);
			return root;
		}
		if(data < root.data){
			root.left = insert(root.left, data);
		}
		else{
			root.right = insert(root.right, data);
		}
		return root;
	}
   ///---------------------------------------------------------------------------------------
   //---------------     In order   ---------------
	public void inorder(){
		inorder(root);
	} 
	// inoreder traversal of BST is sorted order
	
	public void  inorder(Node root){      //LNR
	    if (root == null)
		    return;
		inorder(root.left);                         //recursive call 
		System.out.print(root.data+" ");
		inorder(root.right);                       //recursive call 
	}
	/*
	o/p:  inorder : 1 4 5 7
	        preorder : 5 4 1 7
	*/
	//---------------------------------------------------------------------------------------
	public Node search(int key){
		return search(root , key);
	}
	public Node search(Node root , int key){
		if((root == null) || (root.data == key ))       // if key is matched with root it will return root and if key is not present in tree then it will return null
			return root;
		if(key < root.data){
			return search(root.left , key);
		}
		else{
			return search(root.right, key);
		}
	}
	//---------------------------------------------------------------------------------------
	public static void main(String args[]){
		BinarySearchTree bst1= new BinarySearchTree();
		bst1.insert(5);
		bst1.insert(4);
		bst1.insert(7);
		bst1.insert(1);    
		bst1.insert(21);    
		
		bst1.inorder();
		System.out.println();
		if(null != bst1.search(10)){
			System.out.println("Key found !!! ");
		}
		else{
			System.out.println("Key not found !!! ");
		}
	}
}