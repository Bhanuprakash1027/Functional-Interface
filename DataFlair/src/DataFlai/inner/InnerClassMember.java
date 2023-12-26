package DataFlai.inner;

import DataFlai.inner.a.b;

public class InnerClassMember {
	public static void main(String[] args) {
		a obj=new a();
		a.b obj1= obj.new b();
		obj1.show();
		
		//System.out.println(obj1.toString());
		
	}

}
/*
 * we have 3 types of Inner classes
 * 1 Member class
 * 2 Nested class
 * 3 Anonymous class
 */

class a{  // this is member class means we can create object nothing but Instance class
	class b{// before going to create the B class object we need to create the A class object 
		public static void show() {
			System.out.println("this is b class");
		}
	}
}
