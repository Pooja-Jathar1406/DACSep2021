//******************** ArrayList demo **********************
import java.util.*;  
class ArrayListDemo{
	
	public static void Display(ArrayList<String> list){
		//**printing using for each loop**
		for(String s : list){
			System.out.println(s);
		}
	}
	
	public static void main(String args[]){
		//----------------------------creating new object list2 
		ArrayList<String> list1 = new ArrayList<String>();                  //creatng container object of ArayList
		
		//add() method   --    method to add 1 element at a time
		list1.add("Rohit");                                  //add method is method of collection - creating roit object(in costant pool as we have not used new)
		list1.add("Mukesh");
		list1.add("Radha");
		list1.add("Geeta");
		System.out.println("List1 elements:--------------------------- ");
		Display(list1);
		
        //------------------------------creating new object list2 
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("Shyam");
		list2.add("Madhur");
		list2.add("Amisha");
		System.out.println("List2 elements:-------------------------- ");
		Display(list2);
		 //------------------------------creating new object list3
		ArrayList<String> list3=new ArrayList<String>();
		list3.add("Shyam");
		list3.add("Geeta");
		list3.add("Neeta");
		System.out.println("List3 elements:------------------------ ");
		Display(list3);
		
		//addAll() method    --    method to add all elements at a time
		list1.addAll(list2);                          // will add all elements of list 2 in list 1
		System.out.println("List1 elements after adding list2 elements: ");
		Display(list1);
		
		//clear() method
	/*  list1.clear();                          // method to clear a list
		System.out.println("List1 elements after list1.clear(): ");
		for(String s:list1){
			System.out.println(s);
		}
	*/
		//contains()method    --    returns true if object is present there and false if not present
		boolean b1=list1.contains("Shyam");
		System.out.println("list1.contains(\"Shyam\"):  "+b1);              //true
		
		boolean b2=list1.contains("Rajan");
		System.out.println("list1.contains(\"Rajan\"):  "+b2);               //false
		
		//containsAll()method	  --   returns true if list1 contains all the objects of list2
		boolean b3=list1.containsAll(list2);
		System.out.println("list1.containsAll(list2):  "+b3);                   // true
		
		boolean b4=list1.containsAll(list3);
		System.out.println("list1.containsAll(list3)):  "+b4);               //false
		
		//isempty()   --    returns true if list1 i empty
		boolean b5=list1.isEmpty();
		System.out.println("list1.isEmpty():  "+b5);                             //false
		
		//remove()  --    remove Mukesh from list1
		list1.remove("Mukesh");                                                  // remove Mukesh from list1
		System.out.println("list1 elements after  - list1.remove(\"Mukesh\"):  ");                             //false
		Display(list1);
		
		//removeAll() --   remove all elements which are common in list1 & list2  from list1
		list1.removeAll(list2);                                                      // remove all eements of list2  from list1
		System.out.println("list1 elements after  - list1.remove(\"Mukesh\"):  ");                             //false
		Display(list1);
		
		// retainAll()  --   Inside list1  retains only the common elements from list1 and list3
		list1.retainAll(list3);
		System.out.println("list1 elements after  - list1.retainAll(list3):  "); 
		Display(list1);
		
		// size()  --   returns size
		int i1 = list1.size();
		System.out.println("list1.size():  "+i1);          //1
		 int i2 = list3.size();
		System.out.println("list3.size():  "+i2);          //3
		
		// toArray()  --   returns object of array
		Object arr[] = list1.toArray();                          //Array of type Object can contain ref f any type of array
		for(Object ob : arr){
			System.out.println(ob);                             //Geeta
		} 
		
		
	} 
}