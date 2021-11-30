package forTask.week6;

import java.util.Scanner;

public class ProblemForClass3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int sum;
		int totalSum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum = 0;
			for (int j = 1; j <= i; j++) {
				sum += j;
			}
			totalSum += sum;
		}
		System.out.println(totalSum);
	}
}
