package Data.Flair.set;

import java.util.HashSet;
import java.util.Set;

public class HassetandSet {

	public static void main(String[] args) {
		/* 
		 * Set is not taken the duplicate values , list can take the duplicate values
		 * automatically print the sorting order or we use sorted set
		 */
		Set<Integer> s=new HashSet<Integer>();
		s.add(5);
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(6);
		for(int i:s)
		{
			System.out.println(i);
		}

	}

}
