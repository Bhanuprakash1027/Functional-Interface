package DataFlai.arrays;

public interface atm{
	public static void main(String[] a) {
		pay p=new pay();
		p.transfer();
		p.net();
	}
}

interface bank{
	void net() ;
}

interface upi{
	void transfer();
}

class pay implements bank,upi{

	@Override
	public void transfer() {
		System.out.println("transfer by upi");
		
	}

	@Override
	public void net() {
		System.out.println("transfer by bank");
		
		
	}
	
}