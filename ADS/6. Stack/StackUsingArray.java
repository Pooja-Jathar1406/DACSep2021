import java.util.*;
/*
- need to define a size
- can add element at specific position
- insertion (push) will be at the top only
- deletion (pop)will also be from top only
------------------ Time complexities -----------------------
push()		: Best case--> O(1)  &  Worst case --> O(n)
pop()		: Best case--> O(1)  &  Worst case --> O(n)
display()  : Best  &  Worst case --> O(n)

Applicatons:
- string reversal
- balancing of symbols
- recursion
- expression conversion:
   infix
   prefix
   postfix
*/
class Stack{
	int n= 10,top;
	int a[ ] = new int[n];
	Scanner sc= new Scanner(System.in);
	//-----------------------------------------------------------------------------------------------
	public void push(){                 //top value increases in pop  --> top++
		if(top == (n-1)){
			System.out.println("Stack overflow!");
		}
		else{
			System.out.println("Enter data: ");
			int i = sc.nextInt();
			top = top+1;
			a[top] = i;
			System.out.println("Data inserted on stack ");
		}
	}

    //-----------------------------------------------------------------------------------------------
	public void pop(){                   //top value decreases in pop  --> top--
		if(top == -1){
			System.out.println("Stack underflow!");
		}
		else{  
			top = top-1; 
			System.out.println("Item deleted!");
		}
		System.out.println();
	}
	//-----------------------------------------------------------------------------------------------
	//print stack
	public void display( ){
		System.out.println("Items in stack are: ");
		for(int j=top; j>0; j--){
			System.out.println( a[ j ] );
		}
		System.out.println();
	}
	
	//-----------------------------------------------------------------------------------------------
}
class StackUsingArray{
	
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		Stack s1 = new Stack();
		int m;
		do{
			System.out.println("-------------------------------------");
			System.out.println(" Choose what you want to do!!");
			System.out.println(" 1. Push the element \n 2. Pop the element  \n 3. Display the stack \n 4. Exit");
			int choice=sc.nextInt();
			switch(choice){
				case 1: 
					s1.push();
					break;
				case 2: 
					s1.pop();
					break;
				case 3: 
					s1.display();
					break;
				case 4: 
					break;
				default:
					System.out.println("Invalid choice!");
			}
			System.out.println("Enter 1 to go back to the menu or press any key to exit!");
			m=sc.nextInt();
		}
		while(m==1);
		System.out.println("Exit successfully");
	}
}