package codeUp;

import java.util.Scanner;

class LCM {
	private int a;
	private int b;
	private int gcm;
	private long lcm;

	public LCM(int a, int b) {
		this.a = a;
		this.b = b;

		calcGCM();
		calcLCM();
	}

	private void calcGCM() {
		int x;
		int y;
		if (a >= b) {
			x = a;
			y = b;
		} else {
			x = b;
			y = a;
		}
		//유클리드호제법
		while (y > 0) {
			int temp = x;
			x = y;
			y = temp % x;
		}
		gcm = x;
	}

	private void calcLCM() {
		lcm = (long) a * b / gcm;
	}

	public long getLCM() {
		return lcm;
	}
}

public class CodeUp1565 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		LCM ob = new LCM(a, b);
		System.out.println(ob.getLCM());
	}
}
