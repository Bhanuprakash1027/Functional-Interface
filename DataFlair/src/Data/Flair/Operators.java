package Data.Flair;

 class Operators {

	public static void main(String[] args) {
//***************************Assignment Operators***********************************		
		
		int x; // variable Declaration
		x=10;  // assign the value 
		/*
		 * Here (EQUAL)= is Assignment oerator like 
		 * x=5;
		 * (DOUBLE EQUAL) is compare operator
		 * x==5;
		 * both are different 
		 
		x=x+1; // here 5=5+1 so total 6 this is called POST Increment
		x++;  // this is also same SHORT HAND POST Increment
		*/
		//++x;  // this is PRE Increment
		System.out.println(x);
		System.out.println(x++ + ++x);
		/*
		 * here x++ is the operator not ended so (10+1 + 1+11)=22
		 */
		System.out.println( "the value"+ x); //we can see the x value
		
		System.out.println(++x + ++x);
		System.out.println();
		System.out.println();
		
		//***************************Relational Operators***********************************		

		System.out.println("relational Operator:");
		int j=5;
		int y=4;
		/*
		 * relational operator is check the condition
		 * and givens the True/False value so we can store boolean data type
		 * 
		 */
		boolean b=j>y;
		System.out.println(b);
		System.out.println();
		
		//***************************Conditonal Operators***********************************
		
		System.out.println("Conditional operator");
		
		int A=5;
		int B=7;
		if(A<6 && B<10) {
			System.out.println("both conditions are true");
		}
		else
			System.out.println("either are condition false");
		System.out.println();
		
		//***************************Conditonal Operators***********************************
		System.out.println("Bitwise operator");
		
		int ac=5;
		int ab=6;
		/*
		 * here bitwise operator is integer values conver to bits
		 * 5= 1 0 1
		 * 6= 1 1 0
		 * 	= 1 1 1 =4+2+1(7)
		 * 
		 * operator(|) is, with in the bit's either 1,0 it will give 1
		 * operator(&) is, with in the bit's either 1,0 it will gives 0
		 */
		
		int k=ac|ab;
		System.out.println("Bitwise Or "+ k);
		
		int k1=ac&ab;
		System.out.println("Bitwise And "+ k1);
		
		System.out.println();
		//***************************Shift Operators***********************************
		
		System.out.println("shift operator:");
		
		int left=4;  //1 0 0 conver the binary code 
		/*
		 * The shift operator is used to byte code/binary digit code Increment or decrement
		 * << 2 it means left side add two zeros
		 * >>2 it means right side redusce two zeros
		 */
		//left <<= 2; //10000
		System.out.println(left);
		
		System.out.println(left<<2);// add the 2 zeros 100(4)+00=10000(16) binary code
		System.out.println(1<<3); // 2^3=8 output is 8
		System.out.println(20>>2); // >>2 means 2^2=4, 20/4=5 so out put is 5
		
	}

}
