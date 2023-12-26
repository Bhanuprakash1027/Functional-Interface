package Data.Flair.exception;

public class Arthamatic {

	public static void main(String[] args) {
		
		try {
		int aa,bb,cc;
		aa=4;
		bb=2;
		cc= aa/bb; 
		int a[]=new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		//a[3]=4;
		//a[4]=5;
		
		System.out.println(cc);
		}
		catch(ArithmeticException e) {
			System.out.println("you can not devide by zeto:");
		}
		catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("please take anothe no");
		e.printStackTrace(); // this is mainly used to error location when we click the error going to code
		}
	}

}
