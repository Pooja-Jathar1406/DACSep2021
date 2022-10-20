class TryCatchFinally{ 

	public static void main(String args[]){
		
		int a=10;
		int b=0;
		int res=0;  
		int arr[]={2, 34 , 5 , 3, 7};
		
		//*****************  try with multiple catch and finally *******************
		try{
			res=a/b;                   // It might cause / by zero exception so put in try block
	    }
		catch(ArithmeticException e){
			System.out.println("Arithmetic exception caught");
			System.out.println("Exception message: "+e.getMessage());  
		}
		finally{
			System.out.println("Finally block- 1 executed.");
		}
		
		try{
		    System.out.println("Arr[]:  "+arr[5]);          //It might cause ArrayIndexOutOfBoundsException if index is not match so we have kept it inside try block
	    }
		catch(ArrayIndexOutOfBoundsException ab){
			System.out.println("ArrayIndexOutOfBoundsException caught");
			System.out.println(ab.getMessage());  
		}
		finally{
			System.out.println("Finally block- 2 executed.");
		}
		
		System.out.println("Result =: "+res);
		System.out.println("Program executed successfuly");
		
	}
}