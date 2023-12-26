package DataFlai.inner;

public class Annonmus {

	public static void main(String[] args) {
		// calling the object
//		bp b=new bp();
//		b.show();
		//************************************************************8
		// calling annonmus call
////		bp b=new bp() {
////			public void show() {
////				System.out.println("this is annonmus class");
////			}
////		};
//		b.show();// this is annonmus class 
		/*
		 * now we can create the annonumus object
		 */
		//*****************************************************************
		
	//	new bp().show(); // normal way to calling the object
		//****************************************************************
		new bp() {
			public void show() {
				System.out.println("thi is annonmus object");
			}
		}.show();
	}

}

class bp{
	public void show() {
		System.out.println("this is Bp show class");
	}
}