package forTask.week4;

import java.util.Scanner;
//������ ��,���� �� Ȧ��, ¦�� �Ǻ�
public class Problem1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num;
		num = scan.nextInt();

		if (num < 0)
			System.out.println("minus");
		else
			System.out.println("plus");

		if (num % 2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");

	}

}
