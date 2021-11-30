package forTask.week11;

import java.util.Scanner;

class PrimeTest {
	private int n;
	private String result;
	
	public PrimeTest(int n) {
		this.n = n;
		isPrime();
	}

	private void isPrime() {
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				result = "composite";
				return;
			}
		}
		result = "prime";
	}
	
	public String getResult() {
		return result;
	}
}

public class ProblemForClass2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		PrimeTest ob1 = new PrimeTest(n);
		System.out.println(ob1.getResult());
	}
}
