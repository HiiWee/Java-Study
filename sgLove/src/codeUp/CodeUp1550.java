package codeUp;

import java.util.Scanner;

class SquareRoot {
	private long n;
	private long squareRoot;

	public SquareRoot(long n) {
		this.n = n;

		searchSquareRoot();
	}

	private void searchSquareRoot() {
		for (long i = 1; i <= n; i++) {
			if (n == 1)
				squareRoot = 1;

			else if (i * i > n) {
				squareRoot = i - 1;
				return;
			}
		}
	}

	public long getSquareRoot() {
		return squareRoot;
	}
}

public class CodeUp1550 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		SquareRoot ob = new SquareRoot(n);
		System.out.println(ob.getSquareRoot());

	}
}
