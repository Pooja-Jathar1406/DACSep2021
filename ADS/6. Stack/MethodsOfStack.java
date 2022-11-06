import java.util.*;
class MethodsOfStack{
	//-----------------------------------------------------------------------------------------------
    //                                       Methods Of Stack  
	//-----------------------------------------------------------------------------------------------
	public void underFlow(){
		if(top == -1){
			System.out.println("Stack underflow!");
		}
	}
	//-----------------------------------------------------------------------------------------------
	public void overFlow(){
		if(top == (n-1)){
			System.out.println("Stack overflow!");
		}
	}
	//-----------------------------------------------------------------------------------------------
	public void push(){                 //top value increases in pop  --> top++
		if(top == (n-1)){
			System.out.println("Stack overflow!");
		}
		else{
			System.out.println("Enter data");
			int i = sc.nextInt();
			top = top+1;
			a[top] = i;
		}
	}
	//-----------------------------------------------------------------------------------------------
	public void pop(){                   //top value decreases in pop  --> top--
		if(top == -1){
			System.out.println("Stack underflow!");
		}
		else{  
			top = top-1; 
		}
	}
	//-----------------------------------------------------------------------------------------------
	public static void main(String args[]){
		inputArray();
		
	}
}