//******  Accessing Private data of parent in child  **********
//*******  1-Using Get and set method  *******

class Parent{
	private int a;
	
	Parent(){
		System.out.println("Parent's 0-arg Constructor.");
	}
	Parent(int a){
		System.out.println("Parent's 1-arg Constructor.");
		this.a=a;
	}
	void setA(int a){
		this.a=a;
	}
	int getA(){
		return this.a;
	}
}
class Child1 extends Parent{
	int b;
	Child1(){
		System.out.println("Child1's 0-arg Constructor.");
	}
	Child1(int a){
		System.out.println("Child1's 1-arg Constructor.");
	}
}
class Child2 extends Child1{
	int c;
	Child2(){                    //default constructor
	    System.out.println("Child2's 0-arg Constructor.");
	}
	Child2(int a, int b, int c){
		System.out.println("Child2's 3-arg Constructor.");
		setA(a);                  //calling setA method
		this.b=b;
		this.c=c;
	}
	public void fun(){
		System.out.println(getA());           //calling getA method
		System.out.println(b);
		System.out.println(c);
	}
}
class AccessPrivateDataFromParent{
	public static void main(String args[]){
		
		Child2 obj=new Child2(5,10,15);
		obj.fun();
	}
}

/*
Parent's 0-arg Constructor.
Child1's 0-arg Constructor.
Child2's 3-arg Constructor.
5
10
15
*/

//*******   2 - Using super  *******
 