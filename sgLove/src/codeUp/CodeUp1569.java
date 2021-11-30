package codeUp;

import java.util.Scanner;

class BiggestNum2 {
	private int[] ki;
	private int n;
	private int k;
	private int index;

	public BiggestNum2(int[] ki, int n, int k) {
		this.ki = ki;
		this.n = n;
		this.k = k;

		searchIndex();
	}

	private void searchIndex() {
		for (int i = 0; i < n; i++) {
			if (ki[i] == k) {
				index = i + 1;
				return;
			}
		}
		index = -1;
	}

	public int getIndex() {
		return index;
	}
}

public class CodeUp1569 {
	public static void main(String[] args) {
		int[] ki = new int[1000];
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++)
			ki[i] = scan.nextInt();
		int k = scan.nextInt();

		BiggestNum2 ob = new BiggestNum2(ki, n, k);
		System.out.println(ob.getIndex());

	}
}
