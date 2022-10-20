class TwoNumbers<T extends Number>{             //T extends Number: indicates that the T is child type of Number class so the types which T can take are either members of Number of child of number: int , float, byte, short, long, double            
	T a;
	T b;
	TwoNumbers(T a , T b){
		this.a=a;
		this.b=b;
	}
	double sum(){
		double res=a.doubleValue()+b.doubleValue();
		return res;
	}
}
class Generics1{
	public static void main(String args[]){
		
		TwoNumbers <Integer> tn1= new TwoNumbers <Integer>(5,10);
		//TwoNumbers <Integer> tn1= new TwoNumbers <>(5,10);                //It also works same as above line
		double res = tn1.sum();
		System.out.println("Sum = "+res);                         // Sum= 15.0
		
		TwoNumbers <Double> tn2= new TwoNumbers <Double>(15.5,10.8);
		res = tn2.sum();
		System.out.println("Sum = "+res);                           //Sum= 26.3
		
	}
}