package com.anjinman.app.console;

import java.util.Scanner;

import com.anjinman.app.entity.ExamEntity;
import com.anjinman.app.list.ExamList;


// 콘솔단 사용자의 행위 및 화면에 표시되는 부분을 담당
public class ExamConsole {
	private ExamList list;

	public ExamConsole() {
		list = new ExamList();
	}

	public void inputList() {
		// 시험 점수 변수
		int korean;
		int english;
		int math;

		// 1. 사용자 안내문 출력
		// print console
		inputMenu();
		Scanner scan = new Scanner(System.in);

		korean = scan.nextInt();
		english = scan.nextInt();
		math = scan.nextInt();

		ExamEntity exam = new ExamEntity();

		// 2. 사용자 성적 입력
		// input
		exam.setKorean(korean);
		exam.setEnglish(english);
		exam.setMath(math);
		
		list.add(exam);
	}

	public void printList() {
		printList(list.getSize());
	}
	
	public void printList(int size) {
		
		System.out.println("성적을 출력합니다.\n");
		for (int i = 0; i < size; i++) {
			ExamEntity exam = list.getEntity(i);
			
			int korean = exam.getKorean();
			int english = exam.getEnglish();
			int math = exam.getMath();
			
			int total = exam.getTotal();
			float avg = exam.getAvg();
			System.out.printf("학생 %d\n", i + 1);
			System.out.printf("국어:  %d\n", korean);
			System.out.printf("영어:  %d\n", english);
			System.out.printf("수학:  %d\n", math);
			
			System.out.printf("총 점 : %d\n", total);
			System.out.printf("평 균 : %f\n", avg);
			
		}
	}

	public void inputMenu() {
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           메인 메뉴     	│");
		System.out.println("└───────────────────────────┘");
		System.out.println("\t 성적을 순서대로 입력하세요. ");
		System.out.println("\t국어 ");
		System.out.println("\t영어 ");
		System.out.println("\t수학 ");

	}
}
