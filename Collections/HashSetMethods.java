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
		if(this.roll == s.roll && this.name.equals(s.name) && this.marks == s.marks && this.age ==s.age)                        //this.name.equals(s.name): useed .equals here bcz we want to compare and content not the ref
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

class HashSetMethods{
	
	//*** Display method
	static void Display(HashSet<Student> set){
		//Iterating using Iterator
		Iterator<Student> it = set.iterator();
		while(it.hasNext()){
			Student s= it.next();
			System.out.println(s);                //it works as s.toString()so we will override toString ()method bcz we want value
		}
	}

	public static void main(String args []){
		
		HashSet<Student> set1 = new HashSet<Student>();      //HashSetForUserDefinedObjects
		Student s1 = new Student(1, "Rohit" , 75.0,20); 
		set1.add(s1); 
		//Also we can create and add directly as-
		set1.add(new Student(2, "Pooja" , 74.5,21));
		set1.add(new Student(3, "Pragati" , 69.0,32)); 
		set1.add(new Student(4, "Nachiket" , 87.2,12)); 
		System.out.println("set1 elements: ------------------------");
		Display(set1);
		System.out.println();
		
		HashSet<Student> set2 = new HashSet<Student>();  
		set2.add(new Student(5, "Priya" , 65.0,23)); 
		set2.add(new Student(6, "Nita" , 77.2,14)); 
		System.out.println("set2 elements: ------------------------");
		Display(set2);
		System.out.println();
		
		//Adding duplicates 
		set2.add(new Student(20, "Mona",77.4,23)); 
		set2.add(new Student(20, "Mona",77.4,23));                //we are adding same element again so it will not add-- duplicates are not allowed in Set
		                                                                                                    //but if we are not overriding the equals method then it will add
		System.out.println("set2 elements: ------------------------");
		Display(set2);
		System.out.println();
		
	}
}