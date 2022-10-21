import java.io.*;
import java.util.*;
import java.nio.*;                       //ByteBuffer is a class in nio pkg
import java.nio.channels.*;

//***************************  nio Mapped Byte Buffer demo *******************

class MappedByteBuffer{
	public static void main(String args[])throws IOException,ClassNotFoundException,FileNotFoundException {
		
		FileInputStream fis= new FileInputStream("Input.txt");  
        FileChannel fcin = fis.getChannel();                                 //channel  is connected with file and bytebuffer  -- creating object of fiilechannel so it will read data from file and takes it to bb
		
		// 
        MappedByteBuffer bb = fcin.map(FileChannel.MapMode.READ_ONLY,0,fcin.size());		//fcin.size returns in long so typecaste in integer  -- this line calculates the size and allocate a bb of that size  and stores data in bb
		//MappedByteBuffer bb = fcin.map(FileChannel.MapMode.READ_ONLY,0,fcin.size());
		//reading thr hthe bytebuffer and printng it console
		
		bb.rewind();        //takes the pointer to starting
		
		for(int i = 0; i<(int)fcin.size(); i++){
			System.out.println((char)bb.get(i));                //get(i)reads character by character and  returns ascii value so typecat
		}
		
		//writing to another file
		bb.rewind();
		FileOutputStream fos= new FileOutputStream("MappedByteBufferOp.txt");  
		FileChannel fcout = fos.getChannel(); 
		fcout.write(bb);     
		
		fcin.close();
		fis.close();
		fcout.close();
		fos.flush();
		fos.close();
		System.out.println("File read successfully");
	}
}