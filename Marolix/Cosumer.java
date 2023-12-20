package Marolix;

import java.util.function.Consumer;

public class Cosumer {
	
private	String name;

	public static void main(String[] args) {
		Consumer<String> cs=t-> {System.out.println(t);	};
		cs.accept("bhanu");

		
		
//Consumer<String> cs1= new Consumer<String>() {
//			
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//				
//			}
//		};
//		cs1.accept("bhanu");
	}

}
