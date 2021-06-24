package forTask.week3;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {

		int a, b;
		
		Scanner scan = new Scanner(System.in);

		a = scan.nextInt();
		b = scan.nextInt();

		System.out.printf("%d+%d=%d\n", a, b, a + b);
		System.out.printf("%d-%d=%d\n", a, b, a - b);
		System.out.printf("%d*%d=%d\n", a, b, a * b);
		System.out.printf("%d/%d=%d\n", a, b, a / b);
	}

}
