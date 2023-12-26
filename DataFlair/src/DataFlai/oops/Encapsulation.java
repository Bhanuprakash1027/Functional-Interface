package DataFlai.oops;

public class Encapsulation {

	public static void main(String[] args) {
		Student s=new Student();
		s.setSid(5);
		
		s.setSname("bhanu");
		
		System.out.println(s.getSid());
		System.out.println(s.getSname());
	}

}

class Student{
	/*
	 * Encapsulation means data Hiding, make it private
	 * so we need to create Setter and Getters method to 
	 * Access the variables though constructor
	 */
	
	private int sid;
	private String sname;
	/*
	 * private data type variables not acess the another class no we are creating 
	 * setter= set the data in to method 
	 * getter= get the data in to calling
	
		 * here this key word is perpose is diferentiate the 
		 * local variables and class variables 
		 */
	
	public void getid(int sid,String sname) {
		return;
		
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
}