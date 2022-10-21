import java.io.*;
import java.util.*;
class ByteStreamFileIODemo{
	public static void main(String args[]) throws IOException
  {
		File fin = new File("C:\\Users\\Shree\\Desktop\\DummyDir\\Input.txt");
		File fout = new File("C:\\DummyDir\\Target.txt");
		//exists() --  checks whether  the path exists or not
		if(fin.exists())
	  {
			System.out.println("Exists");
		}
		else{
			System.out.println("Does not exists");
		}
		FileInputStream fis = new FileInputStream(fin);
		FileOutputStream fos = new FileOutputStream(fout,true);
		int ch;
		while((ch=fis.read())!=-1){
			System.out.println((char)ch);
			fos.write(ch);
		}
		fis.close();
		fos.close();
		System.out.println("File copied successfully");
	}
}