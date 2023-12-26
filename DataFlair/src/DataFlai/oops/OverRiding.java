package DataFlai.oops;

public class OverRiding {

	public static void main(String[] args) {
		B b=new B();
		b.show();
		b.show(4);

	}

}

class A{
	public void show() {
		System.out.println("this is A class");
	}
}

class B extends A{
	public void show(int a) {
		System.out.println("this is B class");
	}
}