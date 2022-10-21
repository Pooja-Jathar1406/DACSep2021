import java.io.*;
import java.util.*;
import java.nio.*;
import java.nio.channels.*;

class MappedByteBufferDemo 
{
	public static void main(String [] args) throws FileNotFoundException, IOException
	{
		FileInputStream fis = new FileInputStream("Input.txt");
		FileChannel fcin = fis.getChannel();
		MappedByteBuffer bb = fcin.map(FileChannel.MapMode.READ_ONLY,0,fcin.size());
		
		//fcin.read(bb);
		
		//reading through the byte buffer and printing it to the console
		bb.rewind();
		
		for(int i = 0; i<(int)fcin.size(); i++){
			System.out.print((char)bb.get(i));
		}
		System.out.println();
		
		
		
		
		//Writing to the another file
		bb.rewind();
		FileOutputStream fos = new FileOutputStream("OutputMappedBuffer.txt");
		FileChannel fcout = fos.getChannel();
		fcout.write(bb);
		
		fcin.close();
		fcout.close();
		fis.close();
		fos.flush();
		fos.close();
		
		System.out.println("File read successfully");
	}	
}