package ch05;

import java.util.Scanner;

public class Ex05_16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원하는 정수 입력 : ");
		int num = scan.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 1) continue;
			sum += i;
		}
		System.out.println("1부터 " + num + "까지의 짝수의 합 = " + sum);
		
		
	}

}
