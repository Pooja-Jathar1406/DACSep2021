class FibbonacciUsingRecursion{
	
	static int fib(int n){
		
		if(n<=1)
			return n;
		else
			return fib(n-1)+fib(n-2);
	}
	public static void main (String args[]){
		
		//TODo compleete it till 10 numbers
		double tNow= System.currentTimeSeconds();
		
		for(int i=0;i<=10;i++){
			System.out.println(fib(i));    
		}
		System.out.println("Time taken: "+(System.currentTimeSeconds()-tNow));
	}
}
/*HomeWork
Important ctach
n=10 time =?
n=50 
n=100
*/