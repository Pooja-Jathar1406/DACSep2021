class Demo{
	int a;
	void fun1(){
		System.out.println("fun1 of Demo");
	}
	Demo(){
		
	}
	Demo(int a){
		this.a=a;
	}
	
}
class ObjClassMethods{
	public static void main(String args[]){
		Demo d1= new Demo(5);
		Demo d2 = new Demo(5);
		
		System.out.println("d1.hashCode(): "+d1.hashCode());
		System.out.println("d2.hashCode(): "+d2.hashCode());
		
		System.out.println("d2.toString: "+d2.toString());
		
		System.out.println("d1.equals(d2): "+d1.equals(d2));
	}
}

/*
o/p:
d1.hashCode(): 918221580
d2.hashCode(): 468121027
d2.toString: Demo@1be6f5c3
d1.equals(d2): false
*/