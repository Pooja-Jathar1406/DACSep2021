import java.util.Scanner;
class MyException extends Exception{                         

	public MyException(){
		super("You are not eligible for voting");
	}
}
class ValidVoteAge{
	public static void main(String args[]){
		System.out.println("Enter age : ");
		Scanner sc= new Scanner(System.in);
		int age=sc.nextInt();
		
		try{
			if(age<18)
				throw new MyException( );
			else
				System.out.println("You are eligible for voting"); 
		}
		catch(MyException e){
			System.out.println("MyException caught : "+e.getMessage()); 
		} 
	}	
}