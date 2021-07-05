package forTask.week13;

import java.util.Scanner;

class Summary {
	private long sum;

	public long sumNumber(int n) {
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

}

public class Problem2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Summary ob = new Summary();
		System.out.println(ob.sumNumber(n));

	}
}
