package codeUp;

import java.util.Scanner;

class MinNum {
	private int[] arr;
	private int min;

	public MinNum(int[] arr) {
		this.arr = arr;

		findMinNum();
	}

	private void findMinNum() {
		min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
	}

	public int getMinNum() {
		return min;
	}
}

public class CodeUp1536 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = scan.nextInt();

		MinNum ob = new MinNum(arr);
		System.out.println(ob.getMinNum());
	}
}
