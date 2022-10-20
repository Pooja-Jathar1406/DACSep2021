class Demo<T1>{
	 
	//******************** generic method *****************
	static <T1>void myFun(T1 a){
		System.out.println("a = "+a);
	}
}
class Generics5{
	public static void main(String args[]){
		
		Demo.myFun(45.876);                          //we can pass any type of data here
	}
}