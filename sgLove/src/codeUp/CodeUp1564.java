package codeUp;

import java.util.Scanner;

class GCD {
	private int a;
	private int b;
	private int gcd;

	public GCD(int a, int b) {
		if (a > b) {
			this.a = a;
			this.b = b;
		} else {
			this.a = b;
			this.b = a;
		}
		findGCD();
	}

	private void findGCD() {
		int x = a;
		int y = b;

		while (y > 0) {
			int temp = x;
			x = y;
			y = temp % x;
		}
		gcd = x;
	}

	public int getGCD() {
		return gcd;
	}
}

public class CodeUp1564 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		GCD ob = new GCD(a, b);
		System.out.println(ob.getGCD());
	}
}
