package forTask.week11;

import java.util.Scanner;

class ZeroClass {
	private int num;
	private String result;

	public ZeroClass(int num) {
		this.num = num;
		isZero();
	}

	private void isZero() {
		if (num == 0)
			result = "zero";
		else
			result = "non zero";
	}

	public String getResult() {
		return result;
	}
}

public class Problem3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		ZeroClass ob = new ZeroClass(num);
		System.out.println(ob.getResult());
	}
}
