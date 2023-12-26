package Data.Flair.bufferereader;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class FilesDemo {

	public static void main(String[] args)  throws IOException{
		String s;
	//*******************This is file output stream***********************************	
		File f= new File("file1.txt");
//	//	FileInputStream
//		DataOutputStream dos= new DataOutputStream (new FileOutputStream(f));
//		dos.write(s.getBytes()); //or  directly print the string use UTF
//		dos.writeUTF(s);
//		
		
		//*******************This is file Input stream***********************************
		
		FileInputStream fis=new FileInputStream(f);
		DataInputStream dis=new DataInputStream(fis);
		
		s=dis.readUTF();
		System.out.println(" " +s);
	}

}
