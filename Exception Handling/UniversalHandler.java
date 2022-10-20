class UniversalHandler{

	public static void main(String args[]){
		
		int a=10;
		int b=3;
		int res=0;  
		
		int arr[]={2, 34 , 5 , 3, 7};
		
		//*****************  Universal Handler *******************
		try{
			res=a/b;                   // It might cause / by zero exception so put in try block
		    System.out.println("Arr[]:  "+arr[8]);          //It might cause ArrayIndexOutOfBoundsException if index is not match so we have kept it inside try block
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
