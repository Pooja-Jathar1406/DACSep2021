class NestedTryCatch{ 

	public static void main(String args[]){
		
		System.out.println("Program started execution");
		int a=10;
		int b=2;	
        int res=0;		
		int arr[]={2, 34 , 5 , 3};
		
		//***************** Nested try-catch *******************
		try{                                  // outer try         
			res=a/b;
			try{                                  // inner try        
				System.out.println("Arr[ ]:  "+arr[5]);           
			}
			catch(ArrayIndexOutOfBoundsException ab){
				System.out.println("ArrayIndexOutOfBoundsException caught");
				System.out.println(ab.getMessage());  
			}	
			finally{
				System.out.println("Finally block inner executed.");
			}
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic exception caught");
			System.out.println(e.getMessage());        
		}
		finally{
			System.out.println("Finally block outer executed.");
		}
	    System.out.println("result =: "+res);
		System.out.println("Program executed successfuly");
	}
	

//***************** nested try catch using method ************
/*
    static int arr[]={2, 34 , 5 , 3};
	
	public static void myfun(){
		try{                                  
			System.out.println("Arr[ ]:  "+arr[5]);           
		}
		catch(ArrayIndexOutOfBoundsException ab){
			System.out.println("ArrayIndexOutOfBoundsException caught");
			System.out.println(ab.getMessage());  
		}	
		finally{
			System.out.println("Finally block inner executed.");
		}
	}
    public static void main(String args[]){
		int a=10;
		int b=2;	
        int res=0;		
			//***************** Nested try-catch using function *******************
		System.out.println("Program started execution");
		try{                                  // outer try         
			res=a/b;
			myfun();
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic exception caught");
			System.out.println(e.getMessage());        
		}
		finally{
			System.out.println("Finally block outer executed.");
		}
	    System.out.println("result =: "+res);
		System.out.println("Program executed successfuly");
    }
	*/
}