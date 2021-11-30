package forTask.week6;

import java.util.Scanner;

public class ProblemForClass1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("not prime");
				return;
			}
		}
		System.out.println("prime");

	}
}
