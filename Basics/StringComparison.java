class StringComparison{
	public static void main(String args[]){
		String s1 = "Welcome";
		String s2 = new String("Welcome");
		String s3  = "Welcome";
		String s4 = new String("Welcome");
		
		//******** using == for comparison -- shallow comparison -- compares references  
		System.out.println(" s1==s2 : "+(s1 == s2));    
		System.out.println(" s1==s3 : "+(s1 == s3));
		System.out.println(" s3==s4 : "+(s3 == s4));
		
		//******** using equals method for comparison -- deep comparison -- compares data  
		System.out.println(" s1.equals(s2) : "+(s1.equals(s2)));  
		System.out.println(" s1.equals(s3) : "+(s1.equals(s3)));  
		System.out.println(" s3.equals(s4)  : "+(s3.equals(s4)));  
	}
}

/*
o/p:
 s1==s2 : false
 s1==s3 : true
 s3==s4 : false
 s1.equals(s2) : true
 s1.equals(s3) : true
 s3.equals(s4) : true
*/