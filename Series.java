//Printing the pattern:
//                      3 3 3 2 2 2 1 1 1
//                      3 3 2 2 1 1
//                      3 2 1


public class Series {

	public static void main (String[]args) {
	int k =3, m=3;	
		for(int i= 3; i>=1; i--) {
			for(int j = k; j>=1; j--) {
				for(int l = m; l>=1; l--) {
					System.out.print(j);
					
				}
			}
			System.out.println(" ");
		
			k=3;
			m--;
		}
		
		
	}
	
}
