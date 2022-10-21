import java.io.*;
import java.util.*;

//***********************  Character Stream  : reading data  from a file and creating  list******************
class Student{
	int roll;
	String name;
	double marks;
	
	Student(){}
	Student(int roll, String name, double marks){
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}
	public String toString(){
		return "Student [ roll = "+roll+", name = "+name+", marks = "+marks+" ]";
	}
}
class StudentHandler{
	
	public static void main(String args[]) throws IOException
  {
		File fin = new File("D:/CDAC/3. OOPJ/Lab Practice/File IO/Input.txt");
		 
		//exists() --  checks whether  the path exists or not
		if(!fin.exists())
	  {
			System.out.println("File does not exists");
			return;
		}
        FileReader fr = new  FileReader(fin);          
		
		BufferedReader br = new BufferedReader(fr);
        
		//List to store Student objects
		List<Student> studlist = new LinkedList<>();            //here we can also take ArrayList  -->  List<Student> studlist == new ArrayList<>()
		
		String line=null;
		while((line = br.readLine()) !=  null){            //-1 means  file reading completed , no elements left  -- for going on next line we don't need to increment it internally does
			line= line.trim();                                 //removes spaces
			if(line.isEmpty())                           // if in between any line is empty in our input file  then while loop will be termintaed so we are using isEmpty method to check if it is empty 
				continue;                                           //if line is empty then continue to nextline
			String str[] = line.split(",");                                         //separates the content based on ,(comma)and stoeres in str[] (ex: line= 1,Rohit,23 --> str[] = [1 Rohit 20])
			
			int roll = Integer.parseInt(str[0]);        // by default roll, name, marks everything is in string format so converting into integer and storing 1st index in roll
			String name = str[2];                              //storing 2nd index in name
			double marks = Double.parseDouble(str[2]);          //storing 3rd index in marks
			
			//create new object
			Student s = new Student(roll, name, marks);
			studlist.add(s);                                                        //adds the object in studlist
		}
	    br.close();
		System.out.println("List created Successfully!"); 
		
	    FileWriter fw = new  FileWriter("Student_Details_out.txt");  
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(Student s : studlist){
			s.marks = s.marks + 5;
			//String str = s.roll+","+s.name+","+s.marks+".";
			bw.write(s.toString()+"\n");
		}
		
		bw.flush();   
		bw.close();
       System.out.println("Student details are saved to Student_Details_out.txt Successfully!");
  }
}


















