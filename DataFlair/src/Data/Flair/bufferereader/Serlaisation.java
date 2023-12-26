package Data.Flair.bufferereader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serlaisation {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Cricket c=new Cricket();
		c.Batssman="bhanu";
		c.runs=27;
		
		// this is creating serialization to Creating the data into file
		File f=new File("cricket.txt");
		
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c);
		
		// this is creating serialization to Featching  the data into file
		Cricket c1;
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		c1=(Cricket)ois.readObject();
		System.out.println(c1.runs +" "+ c1.Batssman);
	}

}

class Cricket implements Serializable
{
	int runs;
	String Batssman;
}