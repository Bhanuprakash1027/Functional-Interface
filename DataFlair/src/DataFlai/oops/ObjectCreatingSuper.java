package DataFlai.oops;

public class ObjectCreatingSuper {

	public static void main(String[] args) {
		o obj=new b1(5);
		/*
		 * we are object referance creating super class  and 
		 * object creating subclass so we are calling the subclass we get superclass constructor also call
		 * 
		 * over come this problem we can put SUPER() key word in sub class constructor 
		 * 
		 * every super calss is extend OBJECT class
		 */

	}

}
class o{
	public o() {
		System.out.println("with out");
	}
	public o(int i) {
		System.out.println("With parma");
	}
}

class b1 extends o{
	public b1() {
		System.out.println("b with out");
	}
	public b1(int i) {
		super(i);
		System.out.println("b with param");
	}
}
