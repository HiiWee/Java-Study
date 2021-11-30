package ex19.omok;

public class Program {
	public static void main(String[] args) {

		for(int y=0; y<10; y++) {
			for(int x=0; x<10; x++) {
				if(x==3 && y==2)
					System.out.printf("%c", '●');
				else if(x==0 && y==0)
					System.out.printf("%c", '┌');
				else if(x==9 && y==0)
					System.out.printf("%c", '┐');
				else if(x==9 && y==9)
					System.out.printf("%c", '┘');
				else if(x==0 && y==9)
					System.out.printf("%c", '└');
				else if (y == 0 /* && x>0 && x<9 */)
					System.out.printf("%c", '┬');
				else if (x == 0 /* && y>0 && y<9 */)
					System.out.printf("%c", '├');
				else if (x == 9 /* && y>0 && y<9 */)
					System.out.printf("%c", '┤');
				else if (y == 9 /* && x>0 && x<9 */)
					System.out.printf("%c", '┴');
				else
					System.out.printf("%c", '┼');
			}
			System.out.println();
		}
	}
}