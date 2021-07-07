package codeUp;

import java.util.Scanner;

class BiggestNum {
	private int[] ki;
	private int a;
	private int b;
	private int max;
	private int index;

	public BiggestNum(int[] ki, int a, int b) {
		this.ki = ki;
		this.a = a;
		this.b = b;
		
		searchMax();
	}

	private void searchMax() {
		max = ki[a - 1];
		for (int i = a; i < b; i++) {
			if (max < ki[i])
				max = ki[i];
		}

		for (int i = a - 1; i < b; i++) {
			if (max == ki[i]) {
				index = i + 1;
				return;
			}
		}
	}
	
	public int getIndex() {
		return index;
	}
}

public class CodeUp1568 {
	public static void main(String[] args) {
		int[] ki = new int[1000];
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++)
			ki[i] = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();

		BiggestNum ob = new BiggestNum(ki, a, b);
		System.out.println(ob.getIndex());

	}
}
