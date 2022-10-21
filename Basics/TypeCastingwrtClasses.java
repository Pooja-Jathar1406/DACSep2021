class First{
	//int a=5;
	void fun(){
		System.out.println("Fun of First");
	}
}
class Second extends First{
	//int a=10;
	void fun(){
		System.out.println("Fun of Second");
	}
}
class Third{
	void fun(){
		System.out.println("Fun of Third");
	}
}
class TypeCastingwrtClasses{
	public static void main(String args[]){
		First f = new First();
		Second s = new Second();
		Third t = new Third();
		
		f=s;                        // f= (First)s;  --> this is also fine;  --> upcasting
		//f.fun();                   // Fun of Second
		//System.out.println(f.a);
		//f=t;                       //error: incompatible types as there is no inheritance relation between first and third
		//f=(First)t;         //error: incompatible types as there is no inheritance relation between first and third
		//t.fun();          
        
		//s=f;                       //error child ref = parent obj;
		//s=(Second) f;             //OK
		((Second)f).fun();
		//s.fun();               // Fun of Second
		
	}
}