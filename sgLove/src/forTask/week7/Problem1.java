package forTask.week7;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		int[] arr = new int[99];
		Scanner scan = new Scanner(System.in);
		int student = scan.nextInt();
		int sit = scan.nextInt();

		for (int i = 0; i < student; i++) {
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < student; i++) {
			for (int j = i + 1; j < student; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < student; i++) {
			System.out.print(arr[i] + " ");
			if ((i + 1) % sit == 0)
				System.out.println();
		}
	}

}
