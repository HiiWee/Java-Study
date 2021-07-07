package codeUp;

import java.util.Scanner;

class Factorial {
	private int n;
	private long factorial = 1;

	public Factorial(int n) {
		this.n = n;

		calcFact(n);
	}

	private void calcFact(int n) {
		// 재귀함수 아님
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		// 재귀함수로 풀이 메소드 long타입으로 변환
//		if (n == 1)
//			return 1;
//		return calcFact(n - 1) * n;
	}

	public long getFact() {
		return factorial;
	}
}

public class CodeUp1556 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Factorial ob = new Factorial(n);
		System.out.println(ob.getFact());

	}
}
