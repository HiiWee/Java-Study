package com.anjinman.app.console;

import java.util.Scanner;

import com.anjinman.app.entity.ExamEntity;
import com.anjinman.app.list.ExamList;


// 콘솔단 사용자의 행위 및 화면에 표시되는 부분을 담당한다.
// ExamList()객체를 가지며 새로운 객체가 input 또는 기존 객체가 output될때 ExamList()객체를 이요한다.
// ExamList() 객체를 composition has a 관계로 포함하고 있다.
public abstract class ExamConsole {
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

		// ExamEntity은 추상 클래스 이므로 객체 생성이 어렵다.
		//ExamEntity exam = new ExamEntity();
		ExamEntity exam = makeExam();

		// 2. 사용자 성적 입력
		// input
		exam.setKorean(korean);
		exam.setEnglish(english);
		exam.setMath(math);
		onInputList(exam);
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
			onPrintList(exam);
			
			System.out.printf("총 점 : %d\n", total);
			System.out.printf("평 균 : %f\n", avg);
			
		}
	}


	// 자식에게 메인메뉴 만들기를 위임함
	abstract public void inputMenu();
//	{
//		System.out.println("┌───────────────────────────┐");
//		System.out.println("│           메인 메뉴     	│");
//		System.out.println("└───────────────────────────┘");
//		System.out.println("\t 성적을 순서대로 입력하세요. ");
//		System.out.println("\t국어 ");
//		System.out.println("\t영어 ");
//		System.out.println("\t수학 ");
//
//	}
	
	// 팩토리 메소드 : 리스트를 추가하기 위한 객체를 생성하는 부분을 HoseokExamConsole(자식클래스)에 맞김
	protected abstract ExamEntity makeExam();
	
	// 이벤트 메소드
	// 기존의 flow에서 새로운 과목을 추가하기위한 이벤트 flow를 구현함
	protected abstract void onInputList(ExamEntity exam);
	
	// 이벤트 메소드
	// 기존의 flow에서 새로운 과목을 추가하기위한 이벤트 flow를 구현함
	protected abstract void onPrintList(ExamEntity exam);
}
