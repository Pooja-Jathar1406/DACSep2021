class StringMethods{
	public static void main(String args[]){
		
		String s1 = "Welcome"; 
		
		//***** charAt() method  *****
		System.out.println(" s1.CharAt(0):  "+s1.charAt(2));    // s1.CharAt(0):  l
		//System.out.println(" s1.CharAt(0):  "+s1[3]);            //Error  we can't access like this
		
		//***** getChars()method  *****
		char chr[] = new char[10];
		s1.getChars(2,5,chr,1);                         //1 is for spaces before returned string
		for(int i=0;i<chr.length; i++){
			System.out.print(chr[i]+" ");          //         l c o
		}
		System.out.println();
		
		//***** getBytes()method  *****
		byte[] byteArr = s1.getBytes();
		
		for(int i=0;i<byteArr.length; i++){          //printing array using normal for loop
			System.out.print(byteArr[i]+" ");            // 87 101 108 99 111 109 101
		}
		for(byte c : byteArr){                 //printing array using for each loop
             System.out.print(c+" ");            //87 101 108 99 111 109 101
        }
		System.out.println();	
		
		//***** equals() &  equalsIgnoreCase()method  *****
		String s5="WelCome";
		String s6="welCOMe";
		System.out.println("s5.equals(s6): "+s5.equals(s6));	      //false
		System.out.println("s5.equalsIgnoreCase(s6): "+s5.equalsIgnoreCase(s6));	    //true

		//*****  toCharArray()method  *****
		char charr[]= s5.toCharArray();      
		for(char d : charr){                      //printing array using for each loop
            System.out.print(d+" ");            //W e l C o m e
        }
		System.out.println();
		
		//*****  substring()method  *****
		System.out.println("s1.subString(3): "+ s1.substring(3));              //come
		
		//*****  concat()method  *****
		System.out.println("concat: "+ s6.concat("All").concat(" Welcome"));        //welCOMeAll Welcome
		
		//*****  indexOf()method  *****
		System.out.println("s1.indexOf(w): "+ s1.indexOf('e'));     //1
		System.out.println(s1.indexOf("com"));              //3
	    System.out.println(s1.indexOf("csd"));             //-1  ----> returns -1 if substring is not found
		
		System.out.println(s1.contains("com"));           //true
		
		System.out.println(s1.isEmpty());              //false
		
		System.out.println(String.join("/","13","10","2022"));          //  13/10/2022
		
		//*****  split()method  *****
		String s7= "13/10/2022";
		String sarr[]=s7.split("/",3);  //3: so it will split in 3 parts
		for(String s: sarr){
			System.out.println(s);    
		}
		//*****  String formatting *****
		
		//*****  StringBuffer  *****
		StringBuffer sb1= new StringBuffer("Welcome");             // String is immutable but StringBuffer is mutable
		sb1.append("Friends");             
		System.out.println(sb1);             //WelcomeFriends
		
		//***** StringBuffer  insert() *****
		sb1.insert(3,"Home");             
		System.out.println(sb1);      //WelHomecomeFriends
		
		//*****  StringBuffer  replace() *****
		System.out.println(sb1.replace(2,4,"Java"));                 //WeJavaomecomeFriends
		
		//*****  StringBuffer  insert() *****
		System.out.println(sb1.insert(3,"xyz"));                      //WeJxyzavaomecomeFriends
		
		//*****  StringBuffer  reverse() *****
		System.out.println(sb1.reverse());                     //sdneirFemocemoavazyxJeW
		
		//*****  StringBuffer  capacity() *****
		StringBuffer sb2= new StringBuffer();  
		System.out.println("Capacity of sb2: "+sb2.capacity());               //16   - minimum capacity is 16
		
		StringBuffer sb3= new StringBuffer("65gh567"); 
		System.out.println("Capacity of sb3: "+sb3.capacity());               //23   - 16+ no of characters=16+7=23
		System.out.println("Appending 2243 to  sb3: "+sb3.append("2243"));          //65gh5672243
		System.out.println("Capacity of sb3: "+sb3.capacity());             //still capacty is 23 because capacity()returns initial capacity only

	}
}