package part3_ex05_abstraction;

import java.util.Scanner;

public class NewlecExamConsole extends ExamConsole{

	@Override
	protected Exam makeExam() {
		return new NewlecExam();
	}

	@Override
	protected void onPrint(Exam exam) {
		int com;
		NewlecExam newlecExam = (NewlecExam)exam;
		com = newlecExam.getCom();
		System.out.printf("��ǻ�� %d\n", com);

		
	}

	@Override
	protected void onInput(Exam exam) {
		NewlecExam temp = (NewlecExam)exam;
		
		Scanner scan = new Scanner(System.in);
		int com;

		do {
			System.out.printf("��ǻ�� : ");
			com = scan.nextInt();

			if (com < 0 || 100 < com)
				System.out.println("��ǻ�ͼ����� 0~100������ ������ �Է��� �����մϴ�.");

		} while (com < 0 || 100 < com);
		temp.setCom(com);
	}

}
