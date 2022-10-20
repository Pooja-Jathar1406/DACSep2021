//******************** Linkedll demo **********************
import java.util.*;  
class LinkedllDemo{
	
	static void Display(LinkedList<String> ll){
		//**printing using for each loop**
		for(String s : ll){
			System.out.println(s);
		}
	}
	
	public static void main(String args[]){
		//----------------------------creating new object ll2 
		LinkedList<String> ll1 = new LinkedList<String>();                  //creatng container object of Arayll
		
		//add() method   --    method to add 1 element at a time
		ll1.add("Rohit");                                  //add method is method of collection - creating roit object(in costant pool as we have not used new)
		ll1.add("Mukesh");
		ll1.add("Radha");
		ll1.add("Geeta");
		System.out.println("ll1 elements:--------------------------- ");
		Display(ll1);
		
        //------------------------------creating new object ll2 
		LinkedList<String> ll2=new LinkedList<String>();
		ll2.add("Shyam");
		ll2.add("Madhur");
		ll2.add("Amisha");
		System.out.println("ll2 elements:-------------------------- ");
		Display(ll2);
		 //------------------------------creating new object ll3
		LinkedList<String> ll3=new LinkedList<String>();
		ll3.add("Shyam");
		ll3.add("Geeta");
		ll3.add("Neeta");
		System.out.println("ll3 elements:------------------------ ");
		Display(ll3);
		
		//addAll() method    --    method to add all elements at a time
		ll1.addAll(ll2);                          // will add all elements of ll 2 in ll 1
		System.out.println("ll1 elements after adding ll2 elements: ");
		Display(ll1);
		
		//clear() method
	/*  ll1.clear();                          // method to clear a ll
		System.out.println("ll1 elements after ll1.clear(): ");
		for(String s:ll1){
			System.out.println(s);
		}
	*/
		//contains()method    --    returns true if object is present there and false if not present
		boolean b1=ll1.contains("Shyam");
		System.out.println("ll1.contains(\"Shyam\"):  "+b1);              //true
		
		boolean b2=ll1.contains("Rajan");
		System.out.println("ll1.contains(\"Rajan\"):  "+b2);               //false
		
		//containsAll()method	  --   returns true if ll1 contains all the objects of ll2
		boolean b3=ll1.containsAll(ll2);
		System.out.println("ll1.containsAll(ll2):  "+b3);                   // true
		
		boolean b4=ll1.containsAll(ll3);
		System.out.println("ll1.containsAll(ll3)):  "+b4);               //false
		
		//isempty()   --    returns true if ll1 i empty
		boolean b5=ll1.isEmpty();
		System.out.println("ll1.isEmpty():  "+b5);                             //false
		
		//remove()  --    remove Mukesh from ll1
		ll1.remove("Mukesh");                                                  // remove Mukesh from ll1
		System.out.println("ll1 elements after  - ll1.remove(\"Mukesh\"):  ");                             //false
		Display(ll1);
		
		//removeAll() --   remove all elements which are common in ll1 & ll2  from ll1
		ll1.removeAll(ll2);                                                      // remove all eements of ll2  from ll1
		System.out.println("ll1 elements after  - ll1.remove(\"Mukesh\"):  ");                             //false
		Display(ll1);
		
		// retailAll()  --   Inside ll1  retains ony the common elements from ll1 and ll3
		ll1.retainAll(ll3);
		System.out.println("ll1 elements after  - ll1.retainAll(ll3):  "); 
		Display(ll1);
		
		// size()  --   returns size
		int i1 = ll1.size();
		System.out.println("ll1.size():  "+i1);          //1
		 int i2 = ll3.size();
		System.out.println("ll3.size():  "+i2);          //3
		
		// toArray()  --   returns object of array
		Object arr[] = ll1.toArray();                          //Array of type Object can contain ref f any type of array
		for(Object ob : arr){
			System.out.println(ob);                             //Geeta
		} 
		
		
	} 
}