//***************************** Non Generic ********************
class MyNonGen {                 
	private Object data;                       //taking type as Object: Object is superclass of all types
	void setdata(Object data){
		this.data=data;
	}
	Object getdata(){
		return data;
	}
}
class Generics3{
	public static void main(String args[]){
		
		MyNonGen mg1=new MyNonGen();                    //auto boxing
		mg1.setdata(5);                                                     // Object data = new Integer(5);
		int a = (Integer)(mg1.getdata());                  //Integer = Object;  child =parent ;
		System.out.println("a= "+a);                                 //a= 5
		
		MyNonGen mg2=new MyNonGen();
		mg2.setdata("Welcome");              	                       // Object data = "Welcome";
		String s = (String)(mg2.getdata());        	   //String = Object;  child =parent 
		System.out.println("s= "+s);                        
		                                
		mg1=mg2;                                                    // no type safety
	}                                      
}                                         
