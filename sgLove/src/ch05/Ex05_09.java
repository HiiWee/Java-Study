package ch05;

import java.util.Scanner;

public class Ex05_09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int lcm=0, gcf=0;
		// �ּҰ���� ���ϱ�
		for (int i = 1; i <= n * m; i++) {
			if (i % n == 0 && i % m == 0) {
				lcm = i;
				break;
			}
		}
		// �ִ����� ���ϱ�
		for (int i = n; i >= 1; i--) {
			if(n % i == 0 && m % i == 0) {
				gcf = i;
				break;
			}
		}
		if(gcf == 1)
			System.out.println("�ִ������� �����ϴ� �ּҰ����" + lcm);
		else
			System.out.println("�ִ�����" + gcf + "�ּҰ����" + lcm);
	}

}
