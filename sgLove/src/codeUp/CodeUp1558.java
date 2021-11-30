package codeUp;

import java.util.Scanner;

class Reverse {
	private long n;

	public Reverse(long n) {
		this.n = n;
	}

	public void printReverse() {
		while (n != 0) {
			System.out.print(n % 10);
			n /= 10;
		}
	}
}

public class CodeUp1558 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		Reverse ob = new Reverse(n);
		ob.printReverse();
	}
}
