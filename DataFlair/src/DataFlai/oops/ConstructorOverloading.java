package DataFlai.oops;

public class ConstructorOverloading {

	public static void main(String[] args) {
		Z obj=new Z();
	}

}
/*
 * constructor Overloading means with params and with out params
 * if we are taking int, float, double
 * for example int constuctor put into command and call integer
 * it will goto float becuase, nearest posibility will get automatically
 */

class Z{
	public Z() {
		System.out.println("here with out parameters");
	}
	
	public Z(int x) {
		System.out.println("Integer parameter");
	}
	
	public Z(float y) {
		System.out.println("Floating point parameter");
	}
	
	public Z(double d) {
		System.out.println("double point parameter");
	}
}