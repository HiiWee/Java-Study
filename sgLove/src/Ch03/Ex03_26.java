package ch03;

import java.util.Scanner;

public class Ex03_26 {
	public static void main(String[] args) {
		int num;
		boolean flag;
		Scanner scan = new Scanner(System.in);

		System.out.print("한 개의 숫자를 입력: ");
		num = scan.nextInt();
		flag = num % 2 == 0 ? true : false;
		System.out.println(num + "이(가) 짝수입니까? : " + flag);
	}
}
