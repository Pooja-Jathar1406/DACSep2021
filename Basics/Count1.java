import java.util.Scanner;
class Count1
{
	public static void main(String args[])
	{ int count=0;
	    Count1 s=new Count1();
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		
		while(temp!=0)
	  {
			temp=temp/10;
			count++;
		}
		//System.out.println(count);
		
	//reverse the number
		int rev=s.Rev(num);
		//System.out.println("The reverse is"+rev);
		for(int i=count-1;i>=0;i--)
		{
			int j=rev%10; //to find digit
			int z=(int)Math.pow(10,i);//find the power of 10
			System.out.print((z*j));
			if(i>0)
				System.out.print(" + ");
			rev=rev/10;
		}
		
	}
	int Rev(int temp1)
	{int rev=0;
		while(temp1!=0)
	  {
			int rem=temp1%10;
			rev=rev*10+rem;
			temp1=temp1/10;
		}
		return rev;
	}
}
