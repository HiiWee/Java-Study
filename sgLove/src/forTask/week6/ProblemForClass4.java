package forTask.week6;

import java.util.Scanner;

public class ProblemForClass4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[1000];

		int num = scan.nextInt();

		for (int i = 0; i < num; i++) {
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < num; i++) {
			System.out.print(arr[num - 1 - i] + " ");
		}
	}
}
