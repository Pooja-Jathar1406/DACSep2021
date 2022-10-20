import java.util.*; 
class Student implements Comparable<Student>{          // for usig sort method - we need to implement Comparable interface
	int roll,age;
	String name;
	double marks;
	
	Student(){

	}
	Student(int roll, String name, double marks , int age){
		this.roll=roll;
		this.name=name;
		this.marks=marks;
		this.age=age;
	}
	public void printNameAndMarks(){
		System.out.println("Name = " + name + " Marks = " + marks);
	}
	public String toString(){
		return "[ Studentroll = "+roll+", name = "+name+",  marks = "+marks+ " , age = "+age+"]";
	}
	public int hashCode(){
		return (int)(roll+marks);
	}
	public boolean equals(Object ob){
		Student s=(Student)ob;
		System.out.println("equals() called---------------------");
		if(s==null)
			return false;
		if(this.roll == s.roll && this.name.equals(s.name) && this.marks == s.marks && this.age ==s.age)                       
                             			//this.name.equals(s.name): useed .equals here bcz we want to compare and content not the ref
			return true;
		else
			return false;
	}
	//default comparison : based on marks for sorting
	//******* overriding compareTo method which is abstract method present in Comparable interface  
	public int compareTo(Student s){
		
		//********comparison  on the basis of marks
		if (this.marks > s.marks)           
		    return 1;
		if(this.marks < s.marks)
			return -1;
		return 0;                                //if we are writing return inside if then we have to write one return outside if also
		
		//********sorting on the basis of marks using wrapper class
		/*
		Double marks1= this.marks;
		Double marks2= s.marks;
		return marks1.compareTo(marks2);
		*/
		
		//**** sorting on the basis of name  -- using compareTo() method of String
	    //return this.name.compareTo(s.name);              
	}
}

//comparator interface for sorting on the basis of age
class StudentAgeComparator implements Comparator<Student>{
	public int compare(Student s1, Student s2){
		if(s1.age > s2.age)
			return 1;
		if(s1.age<s2.age)
			return -1; 
		
		return 0;
	}
}
//comparator interface for sorting on the basis of roll
class StudentRollComparator implements Comparator<Student>{
	public int compare(Student s1, Student s2){
		if(s1.roll > s2.roll)
			return 1;
		if(s1.roll<s2.roll)
			return -1; 
		
		return 0;
	}
}

class ArrayListForUserDefinedObjects{
	
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
		
		//----- addAll() method)
		list1.addAll(list2);
		System.out.println("List1 elements after addAll(list2): ------------------------");
		Display(list1);
		
		//----- contains() method)
		boolean b1 = list1.contains(s1);                       //true
		System.out.println("----------------------------------------------");
		System.out.println("list1.contains(s1) : "+b1);
	 
		Student s2 = new Student(1, "Rohit" , 75.0,23);       // creating same object as s1
		boolean b2 = list1.contains(s2);                               //false: bcz it it doing shallow comparison but as object is same so we want it shd do deep comparison so we will override equals() method
		System.out.println("----------------------------------------------");
		System.out.println("list1.contains(s2) : "+b2);
		
		//----- remove() method)
		list1.remove(s1);
	    System.out.println("list1.remove(s1) : " );
	    Display(list1);
	   
	    list1.remove(1);
	    System.out.println(" list1.remove(1) : " );
	    Display(list1);
		System.out.println();
		
		//sort() method
		Collections.sort(list1);                       //default compareTo() will be called     -- Collections is an utility class which contains a static method sort(), which can be used to sort the ArrayList elements
		                                                             //internally it calls compareTo() method -- which we have overridden above
		System.out.println(" list1 after sorting on the basis of marks : -------------" );
	    Display(list1);
		
		//sorting in rverse order - passing comparator class object
		Collections.sort(list1,Collections.reverseOrder());       
		System.out.println(" list1 after sorting in * reverse * order of marks : -------------" );
	    Display(list1);
		System.out.println();
		
		//
		Collections.shuffle(list1);       
		System.out.println(" Shuffle: -------------" );
	    Display(list1);
		System.out.println();
		
		//sorting on the basis of age
		Collections.sort(list1,new StudentAgeComparator());               //StudentAgeComparator 's compare()method will called
		System.out.println(" list1 after sorting on the basis of age : -------------" );
	    Display(list1);
		
		//sorting in rverse order - passing comparator class object
		StudentAgeComparator studAgeComp = new StudentAgeComparator();
		Collections.sort(list1,Collections.reverseOrder(studAgeComp));                     //StudentAgeComparator compare method()will be calleed
		System.out.println(" list1 after sorting in * reverse * order of age: -------------" );
	    Display(list1);
		System.out.println();
		
		//sorting on the basis of roll
		Collections.sort(list1,new StudentRollComparator());  
		System.out.println(" list1 after sorting on the basis of roll : -------------" );
	    Display(list1);
		
		//sorting in reverse order on basis of roll
		StudentRollComparator studRollComp = new StudentRollComparator();
		Collections.sort(list1,Collections.reverseOrder(studRollComp));  
		System.out.println(" list1 after sorting in * reverse * order of roll : -------------" );
	    Display(list1);
		
	}
}