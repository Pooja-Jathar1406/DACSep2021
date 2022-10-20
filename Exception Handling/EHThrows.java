class EHThrows{ 
	
	public static void myFun() throws ArithmeticException{
		//code
	}
	public static void main(String args[]){
		System.out.println("Execution started"); 
		int a=-1;
		try{
			myFun();
	    }
		catch(ArithmeticException e){ 
			System.out.println("Exception message: "+e.getMessage());  
		}
		finally{
			System.out.println("Finally block executed.");
		}  
		System.out.println("Program executed successfuly");
	}
}