import java.util.*;   
class Stack{
	int n= 100,top=-1;
	char a[ ] = new char[n];
	Scanner sc= new Scanner(System.in);
	//-----------------------------------------------------------------------------------------------
	public void push(char data){                 //top value increases in pop  --> top++
		top = top+1;
		a[top] = data; 
	}
    //-----------------------------------------------------------------------------------------------
	public void pop(char data){                   //top value decreases in pop  --> top-- 
		top = top-1;   
	}
	//-----------------------------------------------------------------------------------------------
	//isEmpty
	public boolean isEmpty(){
		if(top == -1){ 
			return true;
		}
		return false;
	}
	//-----------------------------------------------------------------------------------------------
	boolean isBalanced(String inputStr){
		char charArray[] = inputStr.toCharArray();
		 
		for(char c : charArray ){
			if(c=='{' || c=='[' || c=='('){
				push(c );	
			}
			else{
				if(isEmpty()){
					return false;
				}
				else{
					char temp = charArray[ top ];
				if((c == '}' &&  temp == '{'  ) ||(c == ']' &&  temp == '[' )|| (c == ')' &&  temp == '(' )){
						pop(c);
					}
					else{
						return false;
					}
				}
			}
		}
		return isEmpty();
	}
}
//-----------------------------------------------------------------------------------------------
public class BalancedParenthesis{
	
	public static void main(String[] args) {   
     
	Stack s1 = new Stack();
	
	String inputStr;   
	Scanner sc = new Scanner(System.in);   
	
	System.out.println("Enter input string to check:");   
	inputStr = sc.nextLine();   
	
	boolean res = s1.isBalanced(inputStr);
	System.out.println(res);
	}
}