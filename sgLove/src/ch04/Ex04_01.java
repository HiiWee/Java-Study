package ch04;

import java.util.Scanner;

public class Ex04_01 {

	public static void main(String[] args) {

		int num;
		Scanner scan = new Scanner(System.in);

		num = scan.nextInt();

		// 이중 if문
		if (num > 0)
			System.out.println("양수입니다.");
		else
			System.out.println("음수입니다.");
		// 3항 연산자로 표현
		System.out.println(num > 0 ? "양수입니다." : "음수업니다.");

	}

}
