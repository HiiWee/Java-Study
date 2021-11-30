package ch05;

public class Ex05_13 {

	public static void main(String[] args) {

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < i; j++) {
				if (j >= 6)
					break;
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
