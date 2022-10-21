import java.io.*;
import java.nio.*;                       //ByteBuffer is a class in nio pkg
import java.nio.channels.*;

//***************************  nio pkg demo *******************

class ByteBufferDemo{
	public static void main(String args[])throws IOException,ClassNotFoundException {
		
		FileInputStream fis= new FileInputStream("Input.txt");  
        FileChannel fcin = fis.getChannel();                                 //channel  is connected with file and bytebuffer  -- creating object of fiilechannel so it will read data from file and takes it to bb
		
		//allocating memory to byte buffer according to file size
        ByteBuffer bb = ByteBuffer.allocate((int)fcin.size());		//fcin.size returns in long so typecaste in integer  -- this line calculates the size and allocate a bb of that size  and stores data in bb
		
		fcin.read(bb);                                //
		
		//reading thr hthe bytebuffer and printng it console
		bb.rewind();        //takes the pointer to starting
		
		for(int i = 0; i<(int)fcin.size(); i++){
			System.out.println((char)bb.get(i));                //get(i) returns integer so typecat
		} 
		
		//writing to another file
		bb.rewind();
		FileOutputStream fos= new FileOutputStream("ByteBufferOp.txt");  
		FileChannel fcout = fos.getChannel(); 
		fcout.write(bb);     
		
		fcin.close();
		fis.close();
		fcout.close();
		fos.close();
		System.out.println("File read successfully");
	}
}