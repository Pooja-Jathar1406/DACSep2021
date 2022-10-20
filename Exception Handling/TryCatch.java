class TryCatch{ 

	public static void main(String args[]){
		
		//***************** ArithmeticException try-catch *******************
		
		System.out.println("Program started execution");
		int a=10;
		int b=0;		//here we are taking b=0 so a/b  will create  exception  '/ by zero ' and next lines will not execute so we will put this line in try block
		int res=0;         
		
		try{                //try block
			res=a/b;
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic exception caught");
			System.out.println(e.getMessage());       //getMessage is  amethod of exception object  which gives what the exception was
		}
	    System.out.println("result =: "+res);
		System.out.println("Program executed successfuly");
		
		//***************** ArrayIndexOutOfBoundsException try - catch *******************
		
		int arr[]={2, 34 , 5 , 3};
		try{
		    System.out.println("Arr[]:  "+arr[5]);            //It might cause ArrayIndexOutOfBoundsException if index is not match so we have kept it inside try block
	    }
		catch(ArrayIndexOutOfBoundsException ab){
			System.out.println("ArrayIndexOutOfBoundsException caught");
			System.out.println(ab.getMessage());  
		}	
	}
}