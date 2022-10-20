interface MyInterface<T>{
	void myFun(T a);
}
//Implementing class can be generic or ca not be generic:
//	- Class Demo<T> implemnts MyInterface<T>             //class is also generic here
//	- Class Demo implemnts MyInterface<String>             //class is non generic here

class Demo<T> implements MyInterface<T>{
	static void myFun(T a){
		System.out.println(a);
	}
}
class GenericInterface{
	public static void main(String args[]){
		
		Demo.myFun("ascdddv");                        
	}
}