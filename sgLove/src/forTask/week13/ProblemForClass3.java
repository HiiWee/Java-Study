package forTask.week13;

import java.util.Scanner;

class SumArray {
	private int[] arr;
	private int a, b;
	private int sum;

	public void setArray(int[] arr, int a, int b) {
		this.arr = arr;
		this.a = a;
		this.b = b;

		calcArray();
	}

	private void calcArray() {
		for (int i = a - 1; i < b; i++) {
			sum += arr[i];
		}
	}

	public int getResult() {
		return sum;
	}

}

public class ProblemForClass3 {
	public static void main(String[] args) {
		SumArray ob = new SumArray();
		int[] arr = new int[1000];
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int a = scan.nextInt();
		int b = scan.nextInt();
		ob.setArray(arr, a, b);
		System.out.println(ob.getResult());
	}
}
