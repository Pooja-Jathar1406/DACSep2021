import java.util.Scanner;
class NumBreakdown{
	public static void main(String args[]){
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int t=n,count=0,rem=0;
		
		while(t!=0){
			t=t/10;
			count++;
		}
		t=n;
		System.out.println(count+"  "+t);
		
	}
}