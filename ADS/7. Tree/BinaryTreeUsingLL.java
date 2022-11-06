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
class BinaryTreeUsingLL{
	
	//---------------------------------------------------------------------------------------
	//creation of Binary tree
	static Node createTree(){
		Scanner sc = new Scanner(System.in);
		Node root = null; 
		System.out.println("Enter data : ");
		int data = sc.nextInt();
		if(data == -1)          // if  user don't want to enter value of nodes then he will enter -1 
			return null;
		root = new Node(data);     //if not -1 then new node will be created for that data
		System.out.println("Enter left child of "+root.data);
		root.left = createTree();           //recursive call
		System.out.println("Enter right child of "+root.data);
		root.right = createTree();       //recursive call 
		return root;
	}
	//---------------------------------------------------------------------------------------
	//          Traversal of Binary tree
	//---------------     In order   ---------------
	static void  inorder(Node root){      //LNR
	    if (root == null)
		    return;
		inorder(root.left);                         //recursive call 
		System.out.print(root.data+" ");
		inorder(root.right);                       //recursive call 
	}
	//---------------     Pre order   ---------------
	static void  preorder(Node root){     //NLR
	    if (root == null)
		    return;
		System.out.print(root.data+" ");
		preorder(root.left);                         //recursive call 
		preorder(root.right);                       //recursive call 
	}
	//---------------     Post order   ---------------
	static void  postorder(Node root){    //LRN
	    if (root == null)
		    return;
		postorder(root.left);                         //recursive call 
		postorder(root.right);                       //recursive call 
		System.out.print(root.data+" ");
	}
	
	//---------------------------------------------------------------------------------------
	public static void main(String args[]){
		Node root = createTree();      
		
		System.out.println("Printing in Pre Order.. : ");
		preorder(root);
		System.out.println();
		
        System.out.println("Printing in In Order.. : ");		
		inorder(root);
		System.out.println();
	
		System.out.println("Printing in Post Order.. : ");
		postorder(root);
		System.out.println();
	}
}