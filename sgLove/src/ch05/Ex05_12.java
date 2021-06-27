package ch05;

import java.util.Scanner;

public class Ex05_12 {

	public static void main(String[] args) {
		System.out.println("합계원하는 정수 입력 : ");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int i = 1;
		int sum = 0;

		while (true) {
			sum += i;
			if(i == num) break;
			i++;
		}
		System.out.println("Value of 1 to " + num + " : " + sum);
	}

}
