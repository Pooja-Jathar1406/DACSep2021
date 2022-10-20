class Demo<T>{
	 
	//******************** generic method *****************
	void myFun1(Demo<T> d ){                // here Demo<T> can take any of the Demo<Integer>, Demo<Double>,Demo<First>,Demo<String>, etc
		                                                            // type of object  i.e. the object whose reference is getting stored in d shd be same as calling object type
		System.out.println("Fun1 d = "+d);
	}
	//************* Wildcard Arguments ***********************
	void myFun2(Demo<?> d ){               // type of object  i.e. the object whose reference is getting stored in d  can be any valid type of Demo
		System.out.println("Fun2 d = "+d);
	}
	
	//************* Wildcard Arguments extends Number ***********************
	void myFun3(Demo<? extends Number> d ){               // type of object  i.e. the object whose reference is getting stored in d  can be any valid type of Demo whose type parameter is either Number of child class of Number... ex Byte, Short , Integer, Float, Double
		System.out.println("Fun3 d = "+d);
	}
	
	//************* Wildcard Arguments super Number ***********************
	void myFun4(Demo<? super Number> d ){               // type of object  i.e. the object whose reference is getting stored in d  can be parent class of Number 
		System.out.println("Fun4 d = "+d);
	}
}
class Generics6WildCardArgs{
	public static void main(String args[]){
		
		Demo<Integer> d1=new Demo<Integer>();
		Demo<Double> d2=new Demo<Double>();
		Demo<String> d3=new Demo<String>();
		Demo<Integer> d4=new Demo<Integer>();
		
		//******************** calling myFun1 *****************
		//d1.myFun1(d2);             // Error bcz calling object d1's type is - Demo<Integer>  wheras passing object d2's type is Demo<Double>
		//d1.myFun1(d3);             // Error bcz calling object d1's type is - Demo<Integer>  wheras passing object d2's type is Demo<String>
		d1.myFun1(d4);               //Fun1 d = Demo@f6f4d33
		//d2.myFun1(d3);             //Error bcz calling object d1's type is - Demo<Double> wheras passing object d2's type is Demo<String>
		
		//******************** calling myFun2 *****************
		d1.myFun2(d2);             //Fun2 d = Demo@23fc625e
		d1.myFun2(d3);             //Fun2 d = Demo@3f99bd52
		d1.myFun2(d4);             //Fun2 d = Demo@f6f4d33
		d2.myFun2(d3);             //Fun2 d = Demo@3f99bd52
		
		//******************** calling myFun3 *****************
		d1.myFun3(d2);             //Fun3 d = Demo@23fc625e
		//d1.myFun3(d3);           //Error
		d1.myFun3(d4);             //Fun3 d = Demo@f6f4d33
		//d2.myFun3(d3);           //Error
	 
	}
}
 
