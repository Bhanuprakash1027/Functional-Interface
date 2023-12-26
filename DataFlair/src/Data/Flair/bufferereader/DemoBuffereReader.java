package Data.Flair.bufferereader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoBuffereReader {

	public static void main(String[] args) throws IOException{
	
		String s=" ";
		System.out.println("Enter a String:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		s=br.readLine();
		System.out.println("out is "+ s);

	}

}
