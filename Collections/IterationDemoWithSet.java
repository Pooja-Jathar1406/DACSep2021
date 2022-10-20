//******************** Iteration demo with set **********************
import java.util.*;  
class IterationDemoWithSet{

	public static void main(String args[]){
		//----------------------------creating new object list2 
		HashSet<String> set1 = new HashSet<String>();                  //creatng container object of ArayList
		
		//add() method   --    method to add 1 element at a time
		set1.add("Rohit");                                  //add method is method of collection - creating roit object(in costant pool as we have not used new)
		set1.add("Mukesh");
		set1.add("Radha");
		set1.add("Geeta");
		
		//Using for each loop
		System.out.println("set1 elements using for each loop:--------------------------- ");
	    for(String s: set1){
			System.out.println(s);
		}
		
		//Using Iterator   Interface              
		System.out.println("set1 elements Using Iterator Interface :--------------------------- ");
		Iterator<String>  it1 = set1.iterator();       //using iterator () mtd
		while(it1.hasNext()){                       //hasNext check if there is next element 
			String s =  it1.next();                         //next() will iterate to next index and return the value- we are storing that value in s
			System.out.println(s);
		}
		/*
		//***********  ListIterator can't be used with set ************
		//Using ListIterator Interface
		System.out.println("set1 elements Using ListIterator Interface :--------------------------- ");
		ListIterator<String>  lit2 = set1.listIterator();        //using listIterator() mtd
		while(lit2.hasNext()){                       //hasNext check if there is next element 
			String s =  lit2.next();                         //next() will iterate to next index and return the value- we are storing that value in s
			System.out.println(s);
		}
		*/
		//Using Enumeration Interface
		System.out.println("set1 elements Using Enumeration interface :--------------------------- ");
		Enumeration<String> em1 = Collections.enumeration(set1);        //  enumeration() is static method inside Collections class
		while(em1.hasMoreElements()){                       //hasMoreElements check if there is next element 
			String s =  em1.nextElement();                         //nextElement() will iterate to next index and return the value- we are storing that value in s
			System.out.println(s);
		}
		
	} 
}