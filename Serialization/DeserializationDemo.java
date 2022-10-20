import java.io.*;
import java.util.*;

class DeserializationDemo{
	
	public static void main(String args[])throws IOException,ClassNotFoundException
  {
		//Demo d1= new Demo(5,"Hello",65.0);             //no need to create object as we will be reading it
		
		FileInputStream fis= new FileInputStream("myObjects.txt");          //passing file name here object state from myObjects.txt file 
		ObjectInputStream ois = new ObjectInputStream(fis);
		Demo d = (Demo)ois.readObject();                        //return type of the object which we are reading is Object so we need to typecast it to Demo 
		
		ois.close(); 
		System.out.println("Object of class Demo is deserialized from the secondary storage! ");
		System.out.println("Object state : "+d);
	}
}