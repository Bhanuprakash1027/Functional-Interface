package Bhanu.Prakash;

import java.util.Scanner;
import java.util.function.Predicate;

public class Example2 {

	public static void main(String[] args) {
		Predicate<String> name=a->(a.length()<5);
		Scanner  sc =new Scanner(System.in);
		System.out.println("enter a name:");
		String s=sc.next();
		System.out.println(name.test("name"));
		sc.close();
	}

}
