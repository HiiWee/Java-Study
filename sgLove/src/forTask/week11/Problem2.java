package forTask.week11;

import java.util.Scanner;

class NumericClass {
	private int num;
	private String result;

	public NumericClass(int num) {
		this.num = num;
		judgeValue();
	}

	private void judgeValue() {
		if (num < 0)
			result = "negative";
		else if (num == 0)
			result = "zero";
		else
			result = "positive";
	}

	public String getResult() {
		return result;
	}
}

public class Problem2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		NumericClass ob = new NumericClass(num);
		System.out.println(ob.getResult());
	}
}
