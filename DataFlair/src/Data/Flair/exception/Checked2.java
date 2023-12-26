package Data.Flair.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Checked2 {

	public static void main(String[] args) {
		BufferedReader br=null;
		
		try {
		int a1,b1;
		 br=new BufferedReader(new InputStreamReader(System.in)); // this anonymous class
		 System.out.println("Enter 2 Integer values:");
		 a1=Integer.parseInt(br.readLine()); // String converting Integer
		 b1=Integer.parseInt(br.readLine());
		 
		 int c1=a1/b1;
		 System.out.println(c1);
		 
		}
		catch(IOException e) {
			System.out.println("checked exception");
		}
		catch(Exception e) {
			System.out.println("unknow exception");
		}
		finally {
			System.out.println("Resolved given");
		}

	}

	
}
