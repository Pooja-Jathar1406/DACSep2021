class MyGen<T>{                //similar to --> class MyGen<T> extends Object  --> so T can take  any child class of object
	T data;
	void setdata(T data){
		this.data=data;
	}
	T getdata(){
		return data;
	}
}
class First{
	int a;
	int b;
	First(int a, int b){
		this.a = a;
		this.b = b;
	}
	public String toString(){
		return "First [a=  "+a+", b= "+b+" ]";
	}
}
class Generics2{
	public static void main(String args[]){
		MyGen<Integer> mg1=new MyGen<Integer>();
		mg1.setdata(5); 
		int a = mg1.getdata();                      //int=Integer   --> auto unboxing
		System.out.println("a = "+a);                            //a= 5
		
		MyGen<String> mg2=new MyGen<String>();
		mg2.setdata("Welcome");
		String s = mg2.getdata();
		System.out.println("s= "+s);                            //s= Welcome
		
		//First f = new First(14,54);
		MyGen<First> mg3=new MyGen<First>();
		mg3.setdata(new First(14,54));
		First f = mg3.getdata();
		System.out.println("f= "+f);                             //sop(f) works same as f.toString   : f= First [a=  14, b= 54 ]
	
	    mg1=mg2;                             // type safety, compiler shows error
	}
}