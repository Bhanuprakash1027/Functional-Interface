package Data.Flair.map;

import java.util.HashMap;
import java.util.Map;

public class MapandHasMap {

	public static void main(String[] args) {
		/*
		 * Key and values basically this is better to use 
		 * key is not duplicate values we can set duplicate
		 * 
		 * add the data to map use put variable
		 */
		
		Map<Integer, String> m1=new HashMap();
		m1.put(1, "bhanu");
		m1.put(2, "prakash");
		m1.put(3, "rajesh");
		m1.put(4,"sekahr babu");
		m1.put(5, "pushpanjali");
		
		System.out.println(m1.get(4));

	}

}
