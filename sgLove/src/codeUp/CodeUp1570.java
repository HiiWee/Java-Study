package codeUp;

import java.util.Scanner;

class LowerBound {
	private int[] ki;
	private int n;
	private int k;
	private int index;

	public LowerBound(int[] ki, int n, int k) {
		this.ki = ki;
		this.n = n;
		this.k = k;

		searchLowerBound();
	}

	private void searchLowerBound() {
		for (int i = 0; i < n; i++) {
			if (ki[i] >= k) {
				index = i + 1;
				return;
			}
		}
		index = n + 1;
	}

	public int getIndex() {
		return index;
	}
}

public class CodeUp1570 {
	public static void main(String[] args) {
		int[] ki = new int[1000];
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++)
			ki[i] = scan.nextInt();
		int k = scan.nextInt();

		LowerBound ob = new LowerBound(ki, n, k);
		System.out.println(ob.getIndex());

	}
}
