package Data.Flair.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class List {

	public static void main(String[] args) {
		
		java.util.List<Integer> c=new ArrayList();
		
		c.add(1027);
		c.add(2000);
		c.add(2003);
		c.add(3000);
		// print the size of the arrayList we use in collection  size() method
		
		//System.out.println(c.get(1));	// this is Index number value printing
		c.add(3,10); // adding the pertincular index posiontion to value
		
		Collections.sort(c, new Comparator<Integer>()
		{
			/*
			 * collection.sort we have two methdos only soring Ascending order 
			 * while we want to create Decendingorder we need to create the 
			 * Anonymous class 
			 */
			public int compare(Integer i, Integer j) {
				return i<j?-1:i>j?1:0;
			}
		});
		
		for(Integer i:c) {
		System.out.println(i);
		}
	}

}
