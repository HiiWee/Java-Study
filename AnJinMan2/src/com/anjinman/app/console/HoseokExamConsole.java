package com.anjinman.app.console;

import java.util.Scanner;

import com.anjinman.app.entity.ExamEntity;
import com.anjinman.app.entity.HoseokExamEntity;

public class HoseokExamConsole extends ExamConsole {

	
	// 팩토리 메소드 구현 새로 위임받아 만들어진 HoseokExamEntity 객체를 생성하고 반환함
	@Override
	protected ExamEntity makeExam() {
		return new HoseokExamEntity();
	}

	
	// 이벤트 메소드 : HoseokExamEntity의 새로운 과목인 컴퓨터 과목의 점수를 입력함
	@Override
	protected void onInputList(ExamEntity exam) {
		int computer;
		Scanner scan = new Scanner(System.in);
		HoseokExamEntity hoseokExam = (HoseokExamEntity)exam;
		
		computer = scan.nextInt();
		
		hoseokExam.setComputer(computer);
		
		
	}

	// 이벤트 메소드 : HoseokExamEntity의 새로운 과목인 컴퓨터 과목의 점수를 출력함
	@Override
	protected void onPrintList(ExamEntity exam) {
		HoseokExamEntity hoseokExam = (HoseokExamEntity)exam;
		int computer = hoseokExam.getComputer();
		System.out.printf("컴퓨터:  %d\n", computer);
	}
	
	
	// 자식에게 위임된 메뉴 출력을 구현
	@Override
	public void inputMenu() {
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           메인 메뉴     	│");
		System.out.println("└───────────────────────────┘");
		System.out.println("\t 성적을 순서대로 입력하세요. ");
		System.out.println("\t국어 ");
		System.out.println("\t영어 ");
		System.out.println("\t수학 ");
		System.out.println("\t컴퓨터 ");
	}

}
