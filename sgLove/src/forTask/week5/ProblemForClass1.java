package forTask.week5;

import java.util.Scanner;

//정수의 양,음수 및 홀수, 짝수 판별
public class ProblemForClass1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if ((i + 1) % 2 == 0)
				sum += (i + 1);
		}
		System.out.println(sum);
	}

}
