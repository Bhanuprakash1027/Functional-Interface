package Data.Flair.multithread;

public class Thread {

	public static void main(String[] args) throws Exception {
		ab obj =new ab();
		obj.run();
		ba obj1=new ba();
		obj1.run();

	}

}

class ab extends Thread{
	public void show() {
		for(int i=1;i<=5;i++) {
			System.out.println("we are in ab class:");
			try{java.lang.Thread.sleep(1);}catch(Exception e) {}
		}
		}
	public void run() {
		show();
	}
}

class ba extends Thread {
	public void show() throws Exception  {
		for(int i=1;i<=5;i++) {
			System.out.println("this is BA class:");
			java.lang.Thread.sleep(1000) ;
		}
	}
		public void run() throws Exception {
			show();
		}
	
}