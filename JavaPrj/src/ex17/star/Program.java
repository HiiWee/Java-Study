package ex17.star;

public class Program {
	public static void main(String[] args) {

		for(int j=0; j<10; j++) {
			for(int i=0; i<10; i++)
				System.out.printf("%c", '¡Ù');
			System.out.printf("\n");
		}	
			
		System.out.printf("\n");
		
			for(int j=0; j<10; j++) {
				for(int i=0; i<j+1; i++) {
					System.out.printf("%c", '¡Ù');
				}
				System.out.printf("\n");
			}
			
		System.out.printf("\n");
			
			for(int j=0; j<10; j++) {
				for(int i=9; i>j-1; i--) {
					System.out.printf("%c", '¡Ù');
				}
 				System.out.printf("\n");
			}

	}
}