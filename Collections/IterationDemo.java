//******************** Iteration demo with list **********************
import java.util.*;  
class IterationDemo{

	public static void main(String args[]){
		//----------------------------creating new object list2 
		ArrayList<String> list1 = new ArrayList<String>();                  //creatng container object of ArayList
		
		//add() method   --   method to add 1 element at a time
		list1.add("Rohit");                                  //add method is method of collection - creating roit object(in costant pool as we have not used new)
		list1.add("Mukesh");
		list1.add("Radha");
		list1.add("Geeta");
		
		//Using for each loop
		System.out.println("List1 elements using for each loop:--------------------------- ");
	    for(String s: list1){
			System.out.println(s);
		}
		
		//Using Iterator   Interface              
		System.out.println("List1 elements Using Iterator Interface :--------------------------- ");
		Iterator<String>  it1 = list1.iterator();       //using iterator () mtd
		while(it1.hasNext()){                        //hasNext check if there is next element 
			String s =  it1.next();                          //next() will iterate to next index and return the value- we are storing that value in s
			System.out.println(s);
		}
		
		//Using ListIterator Interface  hasNext()
		System.out.println("List1 elements Using ListIterator Interface :--------------------------- ");
		ListIterator<String>  lit2 = list1.listIterator();        //using listIterator() mtd
		while(lit2.hasNext()){                       //hasNext check if there is next element 
			String s =  lit2.next();                          //next() will iterate to next index and return  the value- we are storing that value in s
			System.out.println(s);
		}
		
		//Using ListIterator Interface  hasPrevious()
		System.out.println("List1 elements Using ListIterator Interface previous()method:------------------- ");
		while(lit2.hasPrevious()){                       //hasPrevious check if there is next element 
			String s =  lit2.previous();                         //previous() will iterate to next index and return the value- we are storing that value in s
			System.out.println(s);
		}
		
		//Using Enumeration Interface
		System.out.println("List1 elements Using Enumeration interface :--------------------------- ");
		Enumeration<String> em1 = Collections.enumeration(list1);            //  enumeration()is static method inside Collections class
		while(em1.hasMoreElements()){                       //hasMoreElements check if there is next element 
			String s =  em1.nextElement();                           //nextElement() will iterate to next index and return the value- we are storing that value in s
			System.out.println(s);   
		}
	} 
}