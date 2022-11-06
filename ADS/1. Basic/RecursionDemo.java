
class RecursionDemo{
	static int i=0;
	static void fun1(){                          //recursive function
		++i;
		if(i<=5){                                     //base condition
			System.out.println("Happy diwali!!");
			fun1();                                     //recursive call
		}
	}
	
	public static void main (String args[]){
		fun1();
	}
}
