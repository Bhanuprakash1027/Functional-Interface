package DataFlai.arrays;

public class DemoArrays {

	public static void main(String[] args) {
	/*	int a[]=new int[5];  // creating the array by default array is the object
		
		for(int i=0;i<5;i++) {  
			a[i]=i+1;         // here we are assigining the values to array
		}
		for(int i=0;i<5;i++) {
			System.out.println(a[i]); // printing the array 
		}
*/
		
		int k[][] =new int[3][3];
		
		int x=1;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				k[i][j]=x++;
			}
		}
		
		for(int i[]:k) { // here for loop, 2D array conver enhance loop and 1D
			for(int j:i) {
				System.out.print(j+ " "); // print the loop
			}
			System.out.println();
		}
	}

}
