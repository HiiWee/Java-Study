package forTask.week7;

import java.util.Scanner;

public class ProblemForClass6 {
	public static void main(String[] args) {
		int[][] arr = new int[100][100];

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 1;

		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < num; j++)
					arr[j][i] = count++;
			} else {
				for (int j = num - 1; j >= 0; j--)
					arr[j][i] = count++;
			}
		}

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
