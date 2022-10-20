/*
****************** new features of java interface ************************
-we can add static and default methods inside interface (from java8 onwards)
-** It is not mandatory to override default method  **
-we can access static method of interface without creating object and withot implementing interface (from java8 onwards)
-interface can have private methods (from java9 onwards)
-interface can have private static methods  (from java9 onwards)
*/

interface MyInterface{
	
	void fun1();                                //abstract method of interface
	static void fun2(){                    //static mehthod of interface -- here access specifier for fun3 is ' public ' only 
		System.out.println("My Interface static method - fun2");
	}
	default void fun3(){            //default is not an access specifier  -- It is not mandatory to override " default " method in Demo 
		System.out.println("My Interface  default method - fun3");
	}
	private void fun4(){
		System.out.println("My Interface  private method - fun4");
	}
	private static void fun5(){
		System.out.println("My Interface  private static method - fun5");
	}
}
class Demo implements MyInterface{
	public void fun1(){                       //overriding fun1 of MyInterface
		System.out.println("fun1 of Demo");
	}
	public void fun3(){
		System.out.println("fun3 of Demo");
	}
}
class InterfaceNewFeatues{
	
	public static void main(String [] args){
		
		MyInterface.fun2();                             // we can access static method of interface without creating object and withot implementing interface
		Demo d= new Demo();                      //creating object of Demo
		d.fun3();                                             //If we are overriding fun3 in Demo then it will be called and if we are not overriding then fun3 of Interface will be called
		
	}
}