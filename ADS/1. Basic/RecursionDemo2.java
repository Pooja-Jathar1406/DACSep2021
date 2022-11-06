class RecursionDemo2{
	static int i=0;
	static int fun1(int n){                    //recursive function
		if(n==5){                                 //base condition
			return n;                                    //recursive call
		}
		else{
			return 2*fun1(n+1);
		}
	}
	
	public static void main (String args[]){
		System.out.println(fun1(3));                //20
	}
}