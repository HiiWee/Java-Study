package forTask.week13;

import java.util.Scanner;

class BiggestNum {
	private int index;
	private int value;

	public int searchIndex(int[] arr) {
		value = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (value < arr[i]) {
				value = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (value == arr[i]) {
				index = i+1;
				break;
			}
		}
		return index;
	}
}

public class Problem3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = scan.nextInt();

		BiggestNum ob = new BiggestNum();
		System.out.println(ob.searchIndex(arr));

	}
}
