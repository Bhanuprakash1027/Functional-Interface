package Data.Flair; // this is the package

public class HellowEx1 { // this is the class name

	/* here JVM( java vertival Meachine ) tells any java program 
	 * need to run the code mandatory to follow Main method
	 * so we need to create Main method
	 */
	public static void main(String a[]) {
		/*
		 * Here Main() is method return type is Void
		 * Every Method has create the object instead of Static we can't create the object
		 * public is a access modifiers we can call/access  the entaire project 
		 */
		System.out.println("Hello Data Flair:");
		/*
		 * println is the printing statment
		 * out is the object
		 * system is the class 
		 * though system class using the object we call the printing statment
		 */
		
		int num1=5; 
		int num2=4;
		/*
		 * here num1 and num2 are the variables 
		 * every variable need to satisfiy two properties
		 * 1. data type and 2.name
		 *  int is the data type and name is nothing but Container is used to store the data 
		 */
		int result=num1+num2;
		System.out.println("addition of two numbers:"+ num1+num2);
		/*
		 * here we are Concatinate the String data type to interger data type so we need to put like this
		 */
		System.out.println("addition of two numbers:"+ (num1+num2));
		System.out.println("addition of two numbers:" + result);
		
	}
}
