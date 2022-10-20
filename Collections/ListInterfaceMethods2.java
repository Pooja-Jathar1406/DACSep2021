import java.util.*; 

class ListInterfaceMethods2{
	
	//*** Display method
	static void Display(ArrayList<Student> list){
		//Iterating using Iterator
		Iterator<Student> it = list.iterator();
		while(it.hasNext()){
			Student s= it.next();
			System.out.println(s);                //it works as s.toString()so we will override toString ()method bcz we want value
		}
	}
	
	public static void main(String args []){
		
		ArrayList<Student> list1 = new ArrayList<Student>();      //ArrayListForUserDefinedObjects
		//we can create object like this-
		Student s1 = new Student(1, "Rohit" , 75.0,20); 
		// and add it in the list
		list1.add(s1); 
		//Also we can create and add directly as-
		list1.add(new Student(2, "Pooja" , 74.5,21));
		list1.add(new Student(3, "Pragati" , 69.0,32)); 
		list1.add(new Student(4, "Mona" , 87.2,12)); 
		System.out.println("List1 elements: ------------------------");
		Display(list1);
		
		ArrayList<Student> list2 = new ArrayList<Student>();  
		list2.add(new Student(5, "Priya" , 65.0,23)); 
		list2.add(new Student(6, "Nita" , 77.2,14)); 
		System.out.println("List2 elements: ------------------------");
		Display(list2);
		
		//get(Index) method
		Student s = list1.get(2);
		System.out.println("Element at index 2 : ");
		System.out.println(s);
		
		//get(Index) method
		Student s = list1.get(2);
		System.out.println("Element at index 2 : ");
		System.out.println(s);
		
		
		//add(index, list) method)
		list1.addAll(3,list2);
		System.out.println("list1 after adding list 2 at 3rd index: ");
		System.out.println(s);
		
	}
}