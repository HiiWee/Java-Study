package forTask.week9;

import java.util.Scanner;

public class ProblemForClass1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[20][20];
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			arr[i][0] = scan.nextInt();
		}

		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				arr[i][j] = arr[i][j - 1] - arr[i - 1][j - 1];
			}

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
