package Data.Flair;

public class Patterns {

	public static void main(String[] args) {
		/*for(int i=1;i<=4;i++) {   // defined no of rows
			for(int j=1;j<=4;j++) { // defined no of colums 
				int k=i+j;
				
				System.out.print(k-1 + " ");
			}
			
			System.out.println(" ");
		}*/
		
		/*
		 		* * * *
		 		*     *
		 		*     *
		 		* * * *
		 * we need to draw the above pattern  
		 */
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if((i==1 || i==4)||(j==1 || j==4))
					System.out.print("*");
				else
					System.out.print(" ");
				}
			System.out.println(" ");
		}
	}
}