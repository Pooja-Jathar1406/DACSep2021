class WrapperDemo{
	
	public static void main(String args[]){
		Double dobj1 = new Double(53.5);
		System.out.println("dobj1: "+dobj1);     //dobj1: 53.5
		
		Double dobj2 = new Double("53.5");
		System.out.println("dobj2: "+dobj2);      //dobj2: 53.5
		
		Double dobj3 = Double.valueOf("53.5");
		System.out.println("dobj3: "+dobj3);		//dobj3: 53.5
		
		double dp1 = Double.parseDouble("53.5");
		System.out.println("dp1: "+dp1);			//dp1: 53.5
		
		Double dobj4 = new Double ("53.5");
		System.out.println("dobj4: "+dobj4);   	//dobj4: 53.5
		
		int ip1= Integer.parseInt("537");
		System.out.println("ip1: "+ip1); 			//ip1: 537
		
		String s1 = dobj1.toString();
		System.out.println("s1: "+s1);			//s1: 53.5
		
		int res = dobj1.compareTo(dobj4);             //compares value
		System.out.println("dobj1.compareTo(dobj4): "+res);     	//dobj1.compareTo(dobj4): 0 -means same
		
		double dp2 = dobj4.doubleValue();
		System.out.println("dp2: "+dp2);				//dp2: 53.5
		
		byte bp = dobj4.byteValue();
		System.out.println("bp: "+bp);				//bp: 53
		
		int ip2= dobj4.intValue();
		System.out.println("ip2: "+ip2);			//ip2: 53
		
		Boolean boolObj1 = new Boolean("true");
		Boolean boolObj2=Boolean.valueOf("true");
		
		boolean boolp=Boolean.parseBoolean("true");
		System.out.println("ip2: "+ip2);			//ip2: 53
		
		int num=31;
		String binRes=Integer.toBinaryString(num);
		System.out.println("Integer.toBinaryString(num): "+binRes);	       // Integer.toBinaryString(num): 11111
		String octalRes=Integer.toOctalString(num);
		System.out.println("Integer.toOctalStringString(num): "+octalRes);	    // Integer.toOctalStringString(num): 37
		String hexaRes=Integer.toHexString(num);
		System.out.println("Integer.toHexaString(num): "+hexaRes);	     // Integer.toHexaString(num): 1f
		
		int num2=15;
		Integer iobj2= new Integer(num2);        //boxing
		System.out.println("iobj2.hashCode() :"+iobj2.hashCode());             //iobj2.hashCode() :15
		Integer iobj3=10;                        //autoboxing
		Integer iobj4=num2;                     //autoboxing
		System.out.println("iobj4.hashCode(): "+ iobj4.hashCode());             //iobj4.hashCode(): 15
		
		int num4=iobj4.intValue();       //unboxing
		System.out.println("num4: "+num4);               //num4: 15
		int num5=iobj4;                        //autounboxing
		System.out.println("num5: "+num5);             //num4: 15
		
		
	}
}