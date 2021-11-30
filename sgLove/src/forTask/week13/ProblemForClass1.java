package forTask.week13;

import java.util.Scanner;

class Subtract {
	private long n;
	private long m;
	private long result;

	public Subtract(long n, long m) {
		if (n > m)
			setSubNumber(n, m);
		else
			setSubNumber(m, n);

		printResult();
	}

	private void setSubNumber(long n, long m) {
		result = n - m;
	}

	public void printResult() {
		System.out.println(result);
	}

}

public class ProblemForClass1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long m = scan.nextLong();
		Subtract ob = new Subtract(n, m);
	}
}
