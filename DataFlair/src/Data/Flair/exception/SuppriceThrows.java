package Data.Flair.exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SuppriceThrows {

	public static void main(String[] args)  throws Exception // suppracing exception
	{
		String s=" ";
		System.out.println("enter a String:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		s=br.readLine(); // here error getting like try/catch  or throws 
		System.out.println(s);

	}

}
