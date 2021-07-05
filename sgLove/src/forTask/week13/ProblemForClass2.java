package forTask.week13;

import java.util.Scanner;

class Power {
	private int a = 1;
	private int n = 1;
	private long result = 1;

	public Power(int a, int n) {
		this.a = a;
		this.n = n;
		calcPower();
	}

	private void calcPower() {
		for (int i = 0; i < n; i++) {
			result = result * a;
		}
	}

	public void printResultPower() {
		System.out.println(result);
	}
}

public class ProblemForClass2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int n = scan.nextInt();
		Power ob = new Power(a, n);
		ob.printResultPower();
	}
}
