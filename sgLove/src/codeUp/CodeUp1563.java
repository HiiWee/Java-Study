package codeUp;

import java.util.Scanner;

class MiddleNum {
	private int n;
	private int m;
	private int x;
	private int middleNum;

	public MiddleNum(int n, int m, int x) {
		this.n = n;
		this.m = m;
		this.x = x;
		findMiddleNum();
	}

	private void findMiddleNum() {
		if ((n >= m && n <= x) || (n <= m && n >= x)) {
			middleNum = n;
		} else if ((m >= n && m <= x) || (m <= n && m >= x)) {
			middleNum = m;
		} else if ((x >= n && x <= m) || (x <= m && x >= m)) {
			middleNum = x;
		}
	}

	public int getMiddleNum() {
		return middleNum;
	}
}

public class CodeUp1563 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int x = scan.nextInt();
		MiddleNum ob = new MiddleNum(n, m, x);
		System.out.println(ob.getMiddleNum());
	}
}
