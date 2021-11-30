package forTask.week6;

import java.util.Scanner;

public class ProblemForClass5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[23];
		
		int num;
		int count = scan.nextInt();

		for (int i = 0; i < count; i++) {
			num = scan.nextInt();
			arr[num - 1]++;
		}
		for (int i = 0; i < 23; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
