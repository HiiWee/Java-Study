package ch04;

import java.util.Scanner;

public class Ex04_01 {

	public static void main(String[] args) {

		int num;
		Scanner scan = new Scanner(System.in);

		num = scan.nextInt();

		// ���� if��
		if (num > 0)
			System.out.println("����Դϴ�.");
		else
			System.out.println("�����Դϴ�.");
		// 3�� �����ڷ� ǥ��
		System.out.println(num > 0 ? "����Դϴ�." : "�������ϴ�.");

	}

}
