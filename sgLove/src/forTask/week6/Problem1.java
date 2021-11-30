package forTask.week6;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner scan = new Scanner(System.in);
		int flag = 0;
		for (int i = 0; i < 10; i++) {
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			if (arr[i] % 5 == 0) {
				System.out.println(arr[i]);
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(0);
		}

	}
}
