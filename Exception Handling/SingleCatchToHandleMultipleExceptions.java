class MultiCatchStatementToHandleMultipleExceptions{
	
	public static void main(String args[]){
		System.out.println("Program started execution");
		int a=10;
		int b=3;
		int res=0;  
		int arr[]={2, 34 , 5 , 3, 7};
		
		//*****************  Multi Catch Statement To Handle Multiple Exceptions  *******************
		try{
			res=a/b;                    
		    System.out.println("Arr[]:  "+arr[6]);           
	    }
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
			System.out.println("Arithmetic exception / ArrayIndexOutOfBoundsException caught");
			System.out.println("Exception message: "+e.getMessage());  
		}
		finally{
			System.out.println("Finally block- 1 executed.");
		}
		System.out.println("Result =: "+res);
		System.out.println("Program executed successfuly");
		
	}
}