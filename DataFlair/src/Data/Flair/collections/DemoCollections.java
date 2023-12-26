package Data.Flair.collections;

import java.util.ArrayList;
import java.util.Collection;

public class DemoCollections {

	public static void main(String[] args) {
		
		Collection c=new ArrayList();
		/*
		 * Collection is Interface refarance to c and ArrayList is the class 
		 * here Arrya is not dynamically change the size 
		 * collection is not like that we can use to change
		 * the size automatically
		 */
		System.out.println("before  add the item size of the ArrayList:"+ c.size()); // Instead of length in collections we use size()
		c.add(2);
		c.add(4);
		c.add(6);
		System.out.println("after  add the item size of the ArrayList:"+ c.size());
		System.out.println("print the  ArrayList:");
		for(Object i:c) {
			// All data types are converting to Object dataa type and 
			// we are not specifing any data type in arraylist and collection
			System.out.println(i);
		}
	}

}
