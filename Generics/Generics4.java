//*****************using 2 generics T1, T2*******************

class Demo<T1, T2>{
	T1 a;
	T2 b;
	double d;
	Demo(){}
	Demo(T1 a, T2 b , double d){
		this.a=a;
		this.b=b;
	}
}
class Generics4{
	public static void main(String args[]){
		Demo<Integer,Double> d1= new Demo<Integer,Double>(10, 25.5, 15.0);
	}
}











