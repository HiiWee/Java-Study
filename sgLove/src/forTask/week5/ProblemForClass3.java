package forTask.week5;

import java.util.Scanner;

//������ ��,���� �� Ȧ��, ¦�� �Ǻ�
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
