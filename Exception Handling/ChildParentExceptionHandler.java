class ChildParentExceptionHandler{

	public static void main(String args[]){
		
		int a=10;
		int b=0;
		int res=0;  	
		int arr[]={2, 34 , 5 , 3, 7};
		
		//*****************  ChildParentExceptionHandler *******************
		try{
			res=a/b;                   // It might cause / by zero exception so put in try block
		    System.out.println("Arr[]:  "+arr[8]);          //It might cause ArrayIndexOutOfBoundsException if index is not match so we have kept it inside try block
	    }
		catch(ArithmeticException e){
			System.out.println("Arithmetic exception caught");
			System.out.println("Exception message: "+e.getMessage());  
		}
		catch(Exception e){                //UniveralExceptionHandler
			System.out.println("Exception caught");
			System.out.println("Exception message: "+e.getMessage());  
		}
		finally{
			System.out.println("Finally block executed.");
		}
		System.out.println("Result =: "+res);
		System.out.println("Program executed successfuly");
		
	}
}