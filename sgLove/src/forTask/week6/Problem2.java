package forTask.week6;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		if (num > 12 && num < 2)
			System.out.println("옳지 않은 수를 입력했습니다.");
		
		for (int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if ((i + j) == num)
					System.out.println(i + " " + j);
			}
		}
	}
}
