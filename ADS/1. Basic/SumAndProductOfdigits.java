class SumAndProductOfdigits{
	
	static int sumOfDigits(int n){
		if(n==0)           //base condition
			return 0;
		else
			return (n%10)+ sumOfDigits(n/10);
	}
	
	static int productOfDigits(int n){
		if(n%10 == n)           //base condition
			return n;
		else
			return (n%10)* productOfDigits(n/10);
	}
	
	public static void main (String args[]){ 
		int sum=sumOfDigits(4546);
		System.out.println("sumOfDigits : "+sum );   
		
		int prod=productOfDigits(4542);
		System.out.println("productOfDigits : "+prod );   		
	}
}