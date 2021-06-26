package ch04;

import java.util.Scanner;

public class Ex04_09 {

	public static void main(String[] args) {

		int score;
		Scanner scan = new Scanner(System.in);

		System.out.print("성적 입력 : ");
		score = scan.nextInt();

		if (score >= 80) {
			System.out.println("우수 성적 입니다..");
			if(score >= 90)
				System.out.println("A 학점입니다.");
			else
				System.out.println("B 학점입니다.");
		}
		else {
			if (score >= 60) {
				System.out.println("보통 성적 입니다.");
				if(score >= 70)
					System.out.println("C 학점입니다.");
				else
					System.out.println("D 학점입니다.");
			}
			else
				System.out.println("학점 취득 실패");
			
			
		}
	}

}
