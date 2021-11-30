package forTask.week5;

import java.util.Scanner;

//정수의 양,음수 및 홀수, 짝수 판별
public class ProblemForClass3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while (true) {
			System.out.print(n % 10);
			n = n / 10;
			if (n == 0)
				break;
		}
		System.out.println("");
	}
}
