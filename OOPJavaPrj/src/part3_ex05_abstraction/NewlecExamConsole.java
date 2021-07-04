package part3_ex05_abstraction;

import java.util.Scanner;

public class NewlecExamConsole extends ExamConsole {

	// 팩토리 메소드의 구현
	@Override
	protected Exam makeExam() {
		return new NewlecExam();
	}

	// 이벤트 메소드 구현
	@Override
	protected void onPrint(Exam exam) {
		int com;
		NewlecExam newlecExam = (NewlecExam) exam;
		com = newlecExam.getCom();
		System.out.printf("컴퓨터 %d\n", com);

	}

	// 이벤트 메소드 구현
	@Override
	protected void onInput(Exam exam) {
		NewlecExam newlecExam = (NewlecExam) exam;

		Scanner scan = new Scanner(System.in);
		int com;

		do {
			System.out.printf("컴퓨터 : ");
			com = scan.nextInt();

			if (com < 0 || 100 < com)
				System.out.println("컴퓨터성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (com < 0 || 100 < com);
		newlecExam.setCom(com);
	}

}
