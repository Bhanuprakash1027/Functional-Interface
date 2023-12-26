package Data.Flair.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO { // this is nothing but Checked Exception

	public static void main(String[] args) {
		
		try {
		int i,j;
		System.out.println("enter 2 numbers:");
		InputStreamReader is=new InputStreamReader(System.in);// this line is taking the input from system
		BufferedReader br=new BufferedReader(is);
		i=Integer.parseInt(br.readLine()); 
		/*
		 * here we are converting the String to Integer
		 * so Integer class typecast parseint to string br.readLine
		 */
		j=Integer.parseInt(br.readLine());
		int k=i+j;
		System.out.println(k);
		br.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}

}
