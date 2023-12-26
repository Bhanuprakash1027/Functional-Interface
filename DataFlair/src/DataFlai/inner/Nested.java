package DataFlai.inner;

public class Nested {

	public static void main(String[] args) {
		j.V obj=new j.V();
		/*
		 * here Nested class no need to create the parent class object directly we can create becuase static variable
		 * directly call the class name
		 */
		obj.show();
	}

}

class j{
	static class V{  // Nested class
		public void show() {
			System.out.println("we are in the V class");
		}
		
	}
}