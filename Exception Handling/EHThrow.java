class EHThrow{ 

	public static void main(String args[]){
		
		//*****************  throw *******************
		int a=-1;
		try{
			if(a<0){
				ArithmeticException ae = new ArithmeticException("Value cannot be negative");
			throw ae;
			}
	    }
		catch(ArithmeticException e){
			System.out.println("Arithmetic exception caught"); 
			System.out.println("Exception message: "+e.getMessage());  
		}
		finally{
			System.out.println("Finally block executed.");
		}  
		System.out.println("Program executed successfuly");
		
		//*****************  re- throwing an exception  *******************
		/*
		int a=-1;
		try{
			try{
				if(a<0){
					ArithmeticException ae = new ArithmeticException("Value cannot be negative");
					throw ae;
				}
			}
			catch(ArithmeticException e){
				System.out.println("Arithmetic exception caught: "+e.getMessage()); 
				throw e;
			}
			finally{
				System.out.println("Finally block inner executed.");
			}  
		}
		catch(Exception e){
			System.out.println("Exception caught: "+e.getMessage());  
		}
		finally{
			System.out.println("Finally block outer  executed.");
		}  
		System.out.println("Program executed successfuly");
		*/
	}
}