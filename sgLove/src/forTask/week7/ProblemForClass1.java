package forTask.week7;

import java.util.Scanner;

public class ProblemForClass1 {
	public static void main(String[] args) {

		int[] score = new int[50];
		String[] name = new String[50];

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		for (int i = 0; i < num; i++) {
			name[i] = scan.next();
			score[i] = scan.nextInt();
		}

		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				if (score[i] < score[j]) {
					int temp1 = score[i];
					score[i] = score[j];
					score[j] = temp1;

					String temp2 = name[i];
					name[i] = name[j];
					name[j] = temp2;
				}
			}
		}
		System.out.println(name[2] + " " + score[2]);
	}
}
