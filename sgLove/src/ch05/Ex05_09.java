package ch05;

import java.util.Scanner;

public class Ex05_09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int lcm=0, gcf=0;
		// 최소공배수 구하기
		for (int i = 1; i <= n * m; i++) {
			if (i % n == 0 && i % m == 0) {
				lcm = i;
				break;
			}
		}
		// 최대공약수 구하기
		for (int i = n; i >= 1; i--) {
			if(n % i == 0 && m % i == 0) {
				gcf = i;
				break;
			}
		}
		if(gcf == 1)
			System.out.println("최대공약수는 없습니다 최소공배수" + lcm);
		else
			System.out.println("최대공약수" + gcf + "최소공배수" + lcm);
	}

}
