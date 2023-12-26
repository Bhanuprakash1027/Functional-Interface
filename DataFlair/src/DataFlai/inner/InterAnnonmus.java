package DataFlai.inner;

public interface InterAnnonmus {

	public static void main(String[] args) {
		abc obj=new abc() {
					@Override
			public void show() {
				System.out.println("now we are creating object to interface");
			}
		};
		obj.show();
	}
}

interface abc{
	void show() ;
}