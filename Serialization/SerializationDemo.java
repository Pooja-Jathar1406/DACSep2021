import java.io.*;
import java.util.*;
class Demo implements Serializable{
	int a;
	String s;
	double d;
	Demo(){}
	Demo(int a, String s, double d){
		this.a=a;
		this.s=s;
		this.d=d;
	}
	public String toString(){
		return "Demo [s = "+a+", s = "+s+", d = "+d+" ]";
	}
}
class SerializationDemo{
	
	public static void main(String args[])throws IOException
  {
		Demo d1= new Demo(5,"Hello",65.0);
		
		FileOutputStream fos= new FileOutputStream("myObjects.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		oos.flush();
		oos.close();
		System.out.println("Object state : "+d1);
		System.out.println("Object of class Demo is serialized and stored in the secondary storage! ");
		
	}
}