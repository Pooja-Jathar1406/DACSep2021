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
		return 0;     
	}
}
//**************************  main class  *************************
class ListInterfaceMethods{
	
	//******* Display method
	static void Display(ArrayList<Student> list){
		//Iterating using Iterator
		Iterator<Student> it = list.iterator();
		while(it.hasNext()){
			Student s= it.next();
			System.out.println(s);                //it works as s.toString()so we will override toString ()method bcz we want value
		}
	}
    //******* main method
	public static void main(String args []){
		
		ArrayList<Student> list1 = new ArrayList<Student>();      //ArrayListForUserDefinedObjects
		Student s1 = new Student(1, "Rohit" , 75.0,20); 
		list1.add(s1); 
		//Also we can create and add directly as-
		list1.add(new Student(2, "Pooja" , 74.5,21));
		list1.add(new Student(3, "Pragati" , 69.0,32)); 
		list1.add(new Student(4, "Mona" , 87.2,12)); 
		System.out.println("List1 elements: ------------------------");
		Display(list1);
		System.out.println();
		
		ArrayList<Student> list2 = new ArrayList<Student>();  
		list2.add(new Student(5, "Priya" , 65.0,23)); 
		list2.add(new Student(6, "Nita" , 77.2,14)); 
		System.out.println("List2 elements: ------------------------");
		Display(list2);
		System.out.println();
		
		//get(Index) method
		Student s = list1.get(2);
		System.out.println("Element at index 2 : ");
		Display(list1);
		System.out.println();
		
		//add(index, element) method)
		list1.add(2,new Student(23, "Nachiket" , 87.2,12));
		System.out.println("list1 after adding new element at 2nd index: ");
		Display(list1);
		System.out.println();
		
		//add(index, list) method)
		list1.addAll(2,list2);
		System.out.println("list1 after adding list2 at 2nd index: ");
		Display(list1);
		System.out.println();
		
		//indexOf(element) method
		int i = list1.indexOf(new Student(4, "Mona" , 87.2,12));
		System.out.println("Index of Nita in list1  "+i);                            //5
		System.out.println();
		
		//remove(index) method
		list1.remove(3);
		System.out.println("list1 after removing object at index 3: ");      //5
		System.out.println();
	}
}