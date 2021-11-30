package forTask.week11;

import java.util.Scanner;

class FactorClass {
	private int num;
	private int count;

	public FactorClass(int num) {
		this.num = num;
		countFactor();
	}

	private void countFactor() {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				count++;
		}
	}

	public int getCountFactor() {
		return count;
	}
}

public class Problem1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		FactorClass ob = new FactorClass(num);
		System.out.println(ob.getCountFactor());
	}
}
