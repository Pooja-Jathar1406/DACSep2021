import java.io.*;
import java.util.*;
class FileClassDemo{
	public static void main(String args[])
  {
		File f = new File("D:\\CDAC\\3. OOPJ\\Lab Practice\\File IO\\Input.txt");
		//exists() --  checks whether  the path exists or not
		if(f.exists())
	  {
			System.out.println("Exists");
		}
		else{
			System.out.println("Does not exists");
		}
		//isDirectory method  --  checks is it is a file or directory
		if(f.isDirectory())                
	  {
			System.out.println("It is a directory and files inside this directory are : ");
			
			//list() method -- returns array of all the filesnames and directories names inside the folder
			String filenames[] = f.list();
			System.out.println(Arrays.toString(filenames));
			
			//listFiles()  --  returns an array of file objects
			File fileObj[] = f.listFiles();
			
			for(File fl : fileObj){
				if(fl.isDirectory()){
					//getName()  --  gives fileName
					System.out.println(fl.getName()+" is a directory");               
				}
				else{
					System.out.println(fl.getName()+" is a file");
				}
			}
		}
		else{
			System.out.println("It is a file");
		}
	}
}