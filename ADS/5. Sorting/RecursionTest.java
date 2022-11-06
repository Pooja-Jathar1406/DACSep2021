class Recursion{
	
		int fun(int n){
			int res;
			if(n==1)
				return 1;
			res= fun(n-1)*n;
			return res;
		}
}

class RecursionTest{
	public static void main(String args[]){
		Recursion obj=new Recursion();
		System.out.println(obj.fun(6));
	}
}
