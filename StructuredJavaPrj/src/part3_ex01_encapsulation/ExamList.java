﻿package part3_ex01_encapsulation;

import java.util.Scanner;

public class ExamList {
	Exam[] exams;
	int current;
	
	static void printList(ExamList list) {
		printList(list, list.current);
	}

	static void printList(ExamList list, int size) {
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적  출력      │");
		System.out.println("└───────────────────────────┘");
		System.out.println();
		//int size = list.current;
		Exam[] exams = list.exams;
		for (int i = 0; i < size; i++) {
			Exam exam = exams[i];
			// for문 내에 있어도 1번만 선언되고 맘, 즉 반복되어
			// 선언되지 않는다.
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;

			int total = kor + eng + math;
			// 연산자 다량사용 및 가독성 떨어짐
			// 따라서 임시변수 사용
			float avg = total / 3.0f;

			System.out.printf("국어 %d\n", kor);
			System.out.printf("영어 %d\n", eng); 
			System.out.printf("수학 %d\n", math);

			System.out.printf("총점 : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("─────────────────────────────");
		}
	}
	
	static void inputList(ExamList list) {

		Scanner scan = new Scanner(System.in);

		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적  입력      │");
		System.out.println("└───────────────────────────┘");
		System.out.println();

		int kor, eng, math;

		do {
			System.out.printf("국어 : ");
			kor = scan.nextInt();

			if (kor < 0 || 100 < kor)
				System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (kor < 0 || 100 < kor);

		do {
			System.out.printf("영어 : ");
			eng = scan.nextInt();

			if (eng < 0 || 100 < eng)
				System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (eng < 0 || 100 < eng);

		do {
			System.out.printf("수학 : ");
			math = scan.nextInt();

			if (math < 0 || 100 < math)
				System.out.println("수학성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (math < 0 || 100 < math);
		Exam exam = new Exam();
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
		//객체의 직접적인 연산을 피하고 임시 변수를 사용하여 연산진행
		Exam[] exams = list.exams;
		int size = list.current;
		
		if(exams.length == size) {
			//1. 크기가 5가 더 큰 새로운 배열 생성
			Exam[] temp = new Exam[size + 5];
			//2. 값을 이주시키기
			for(int i=0; i<size; i++) {
				temp[i] = exams[i];
			//3. list.exams 가 새로만든 temp 배열을 참조한다.
				list.exams = temp;
			}
		}
		list.exams[list.current] = exam;
		list.current++;

	}

	public static void init(ExamList list) {
		list.exams = new Exam[3];
		list.current = 0;		
	}

}
