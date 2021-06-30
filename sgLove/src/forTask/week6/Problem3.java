package forTask.week6;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		int[] arr = new int[1000];
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		for (int i = 0; i < num; i++) {
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(arr[(i + j) % num] + " ");
			}
			System.out.println("");
		}

	}
}