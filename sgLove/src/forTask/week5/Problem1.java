package forTask.week5;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int temp = scan.nextInt();
			if (temp % 5 == 0)
				sum += temp;
		}
		System.out.println(sum);

	}

}
