class A{
	private int a;
}
class B extends A{
	int b;
}
class C extends B{
	int c,a;
	C(){                    //default constructor
	}
	C(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void fun(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
class AccessSpecifiers{
	public static void main(String args[]){
		C obj=new C(5,10,15);
		obj.fun();
	}
}