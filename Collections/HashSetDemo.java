//******************** HashSet demo **********************
import java.util.*;  
class HashSetDemo{
	
	static void Display(HashSet<String> set){
		//**printing using for each loop**
		for(String s : set){
			System.out.println(s);
		}
	}
	
	public static void main(String args[]){
		//----------------------------creating new object set2 
		HashSet<String> set1 = new HashSet<String>();                  //creatng container object of HashSet   -- insted of HashSet we can also write Set  bcz HashSet is implementing Set   
		
		//add() method   --    method to add 1 element at a time
		set1.add("Rohit");                                  //add method is method of collection - creating roit object(in costant pool as we have not used new)
		set1.add("Mukesh");
		set1.add("Radha");
		set1.add("Geeta");
		System.out.println("set1 elements:--------------------------- ");
		Display(set1);
		
        //------------------------------creating new object set2 
		HashSet<String> set2=new HashSet<String>();
		set2.add("Shyam");
		set2.add("Madhur");
		set2.add("Amisha");
		System.out.println("set2 elements:-------------------------- ");
		Display(set2);
		 //------------------------------creating new object set3
		HashSet<String> set3=new HashSet<String>();
		set3.add("Shyam");
		set3.add("Geeta");
		set3.add("Neeta");
		System.out.println("set3 elements:------------------------ ");
		Display(set3);
		
		//addAll() method    --    method to add all elements at a time
		set1.addAll(set2);                          // will add all elements of set 2 in set 1
		System.out.println("set1 elements after adding set2 elements: ");
		Display(set1);
		
		//clear() method
	/*  set1.clear();                          // method to clear a set
		System.out.println("set1 elements after set1.clear(): ");
		for(String s:set1){
			System.out.println(s);
		}
	*/
		//contains()method    --    returns true if object is present there and false if not present
		boolean b1=set1.contains("Shyam");
		System.out.println("set1.contains(\"Shyam\"):  "+b1);              //true
		
		boolean b2=set1.contains("Rajan");
		System.out.println("set1.contains(\"Rajan\"):  "+b2);               //false
		
		//containsAll()method	  --   returns true if set1 contains all the objects of set2
		boolean b3=set1.containsAll(set2);
		System.out.println("set1.containsAll(set2):  "+b3);                   // true
		
		boolean b4=set1.containsAll(set3);
		System.out.println("set1.containsAll(set3)):  "+b4);               //false
		
		//isempty()   --    returns true if set1 i empty
		boolean b5=set1.isEmpty();
		System.out.println("set1.isEmpty():  "+b5);                             //false
		
		//remove()  --    remove Mukesh from set1
		set1.remove("Mukesh");                                                  // remove Mukesh from set1
		System.out.println("set1 elements after  - set1.remove(\"Mukesh\"):  ");                             //false
		Display(set1);
		
		//removeAll() --   remove all elements which are common in set1 & set2  from set1
		set1.removeAll(set2);                                                      // remove all eements of set2  from set1
		System.out.println("set1 elements after  - set1.remove(\"Mukesh\"):  ");                             //false
		Display(set1);
		
		// retailAll()  --   Inside set1  retains ony the common elements from set1 and set3
		set1.retainAll(set3);
		System.out.println("set1 elements after  - set1.retainAll(set3):  "); 
		Display(set1);
		
		// size()  --   returns size
		int i1 = set1.size();
		System.out.println("set1.size():  "+i1);          //1
		 int i2 = set3.size();
		System.out.println("set3.size():  "+i2);          //3
		
		// toArray()  --   returns object of array
		Object arr[] = set1.toArray();                          //Array of type Object can contain ref f any type of array
		for(Object ob : arr){
			System.out.println(ob);                             //Geeta
		} 
		
		
	} 
}