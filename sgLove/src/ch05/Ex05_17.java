package ch05;

public class Ex05_17 {
	public static void main(String[] args) {

		Outer: for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			
			for (int j = 1; j <= 9; j++) {
				if (j == 3)
					continue Outer;
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}

	}

}
