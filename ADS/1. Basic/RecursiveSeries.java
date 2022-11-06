import java.util.*;
class RecursiveSeries{
	
	static double sum(int i){  //1
		return 1/i;    //1
	}
	public static void main(String args[])throws ArithmeticException{
		
	    System.out.println("Enter N: ");
		Scanner sc= new Scanner(System.in);
		double i; 
		int N = sc.nextInt();  //3
		double sum =1;
		for(i=1; i<=N; i++){
			if(i%2 ==0){
				i=(-1)*i;
			}
			sum = sum+sum(i);   //0+
		}
		System.out.println("Sum: "+sum);
	}
}