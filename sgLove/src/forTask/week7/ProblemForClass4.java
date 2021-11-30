﻿package forTask.week7;

import java.util.Scanner;

public class ProblemForClass4 {
	public static void main(String[] args) {
		int[][] arr = new int[100][100];

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int count = 1;

		for (int i = n - 1; i >= 0; i--) {
			for (int j = m - 1; j >= 0; j--) {
				arr[i][j] = count++;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
