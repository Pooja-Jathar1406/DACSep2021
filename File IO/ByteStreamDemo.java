import java.io.*;
import java.util.*;

//***********************  Byte Stream  ******************
class ByteStreamDemo{
	
	public static void main(String args[]) throws IOException
  {
		File fin = new File("D:/CDAC/3. OOPJ/Lab Practice/File IO/Input.txt");
		File fout = new File("D:/CDAC/3. OOPJ/Lab Practice/File IO/Target.txt");
		//exists() --  checks whether  the path exists or not
		if(!fin.exists())
	  {
			System.out.println("File does not exists");
			return;
		}
        FileInputStream fis = new  FileInputStream(fin);
		//FileOutputStream fos = new  FileOutputStream(fout,true);        //will append the content 
	    FileOutputStream fos = new  FileOutputStream(fout);             //will always create a new file
		
		//Using Buffer -- faster than FileInputStream and FileOutputStream
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		//read() - returns integer value of read byte from the file input stream
		int ch;
		while((ch=fis.read()) != -1){                   //-1 means  file reading completed , no elements left
			System.out.println((char)ch);
			fos.write(ch);                                                //write() 
		}
		bis.close();
		bos.flush();
		bos.close();
		System.out.println("File Copied successfully to Target.txt");
	}
}