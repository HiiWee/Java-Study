package forTask.week5;

import java.util.Scanner;

//������ ��,���� �� Ȧ��, ¦�� �Ǻ�
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
