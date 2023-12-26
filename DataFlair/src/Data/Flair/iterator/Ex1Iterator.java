package Data.Flair.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex1Iterator {
	public static void main(String[] a) {
	
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(5);
	al.add(6);
	al.add(7);
	
	Iterator<Integer> I=al.iterator();
	while(I.hasNext())  // hasNext is checking the boolean condition next element on not 
	{
		int x=I.next(); // next() is read the data 
		System.out.println(x);
	}
	
	}
}
