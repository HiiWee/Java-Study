package ch04;

import java.util.Scanner;

public class Ex04_08 {

	public static void main(String[] args) {

		int num;
		Scanner scan = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		num = scan.nextInt();

		if (num > 0) {
			System.out.println("입력된 수 " + num + "은 양수입니다.");
		}
		else if (num == 0) {
			System.out.println("입력된 수는 " + num + "입니다.");
		}
		else {
			System.out.println("입력된 수 " + num + "은 음수입니다.");

		}
	}

}
