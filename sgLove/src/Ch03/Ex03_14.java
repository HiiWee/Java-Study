package Ch03;

import java.util.Scanner;

public class Ex03_14 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력 : ");
		int firstNum = scan.nextInt();
		
		System.out.print("두 번째 정수를 입력 : ");
		int secondNum = scan.nextInt();
		
		int sum = firstNum + secondNum;
		double avg = sum/2;
		double avg2 = sum/2.0;
		
		System.out.printf("정수연산: 평균은(%d+%d)/2=%.1f\n", firstNum, secondNum, avg);
		System.out.printf("정수연산: 평균은(%d+%d)/2=%.1f\n", firstNum, secondNum, avg2);
	}
}
