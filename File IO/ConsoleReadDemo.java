import java.io.*;
import java.util.*;

class ConsoleReadDemo{
	
	//**************reading input from console***********************
	
	public static void main(String args[])throws IOException
  {
		InputStreamReader is = new InputStreamReader(System.in);               //creating object of buffered reader
		
		BufferedReader br = new BufferedReader(is);
		
		System.out.println("Enter a number: ");
		String strInput = br.readLine();
		
		int num = Integer.parseInt(strInput);
		
		System.out.println("Enter a float value: ");
		String strInput1 = br.readLine();
		double dval = Double.parseDouble(strInput1);
		
		System.out.println("Enter a String: ");
		String strInput2 = br.readLine();
		String strName = strInput2;
		
		System.out.println("Enter a boolean value: ");
		String strInput3 = br.readLine();
		boolean bval = Boolean.parseBoolean(strInput3);
		
		br.close();
		
		System.out.println("The input values are as follows: ");
		System.out.println(num);
		System.out.println(dval);
		System.out.println(strName);
		System.out.println(bval);
		
	}
}