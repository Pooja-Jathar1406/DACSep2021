
import java.io.*;
import java.util.*;

//***********************  Character Stream  ******************
class CharStreamDemoFileReadWrite{
	
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
        FileReader fr = new  FileReader(fin);
		//FileWriter fw = new  FileWriter(fout,true);        //will append the content 
	    FileWriter fw = new  FileWriter(fout);             //will always create a new file
		
		/*
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		*/
		//read() - returns integer value of read byte from the file input stream
		int ch;
		while((ch=fr.read()) != -1){                   //-1 means  file reading completed , no elements left
			System.out.println((char)ch);
			fw.write(ch);                                                //write() 
		}
		fr.close();  
		fw.close();
		System.out.println("File Copied successfully to Target.txt");
	}
}


















