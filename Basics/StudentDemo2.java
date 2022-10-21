class Student{              // class 
	int rollno;             // decleare detaa
	int age;
	double marks;
	
	Student ()              // zero arg class
  {
		System.out.println("zero args call: ");
	}
	
	Student(int r )          // one arg class create
  {
		System.out.println("one args call: ");
		rollno=r;
	}
	
	Student (int r, int a,double m)      //three arg call and assinig the var
	{
		System.out.println("three args call: ");
		rollno=r;
		age=a;
		marks=m;
	}
	
	void setDetails(int r, int a,double m)         // method create
  {
	    rollno=r;
		age= a;
		marks=m;
	}	
	
	void printDetails()                           // printing details
  {
		System.out.println(rollno+","+age+","+marks);
	}
}
class StudentDemo2                          // creaitng new class
{
	public static void main (String args[])      // main method create
  {
		Student Stud1= new Student(10,50,96.66);          // object create 
		//stud2.printDetails();		// and initialize
		Stud1.setDetails(10,50,96.66);
		Stud1.printDetails();             // method call 
	}
}