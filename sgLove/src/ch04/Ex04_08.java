package ch04;

import java.util.Scanner;

public class Ex04_08 {

	public static void main(String[] args) {

		int num;
		Scanner scan = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		num = scan.nextInt();

		if (num > 0) {
			System.out.println("�Էµ� �� " + num + "�� ����Դϴ�.");
		}
		else if (num == 0) {
			System.out.println("�Էµ� ���� " + num + "�Դϴ�.");
		}
		else {
			System.out.println("�Էµ� �� " + num + "�� �����Դϴ�.");

		}
	}

}
