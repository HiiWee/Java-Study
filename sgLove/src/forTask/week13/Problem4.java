package forTask.week13;

import java.util.Scanner;

class BiggestValue2 {
	private int max;
	private int index;

	public int searchIndex(int[] ki, int n, int k) {
		for (int i = 0; i < n; i++) {
			if (ki[i] > k)
				return i + 1;
		}
		return n + 1;
	}
}

public class Problem4 {
	public static void main(String[] args) {
		int[] ki = new int[1000];
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k;

		for (int i = 0; i < n; i++)
			ki[i] = scan.nextInt();
		k = scan.nextInt();

		BiggestValue2 ob = new BiggestValue2();
		System.out.println(ob.searchIndex(ki, n, k));
	}
}
