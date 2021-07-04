package part3_ex05_abstraction;

import java.util.Scanner;

public class NewlecExamConsole extends ExamConsole {

	// ���丮 �޼ҵ��� ����
	@Override
	protected Exam makeExam() {
		return new NewlecExam();
	}

	// �̺�Ʈ �޼ҵ� ����
	@Override
	protected void onPrint(Exam exam) {
		int com;
		NewlecExam newlecExam = (NewlecExam) exam;
		com = newlecExam.getCom();
		System.out.printf("��ǻ�� %d\n", com);

	}

	// �̺�Ʈ �޼ҵ� ����
	@Override
	protected void onInput(Exam exam) {
		NewlecExam newlecExam = (NewlecExam) exam;

		Scanner scan = new Scanner(System.in);
		int com;

		do {
			System.out.printf("��ǻ�� : ");
			com = scan.nextInt();

			if (com < 0 || 100 < com)
				System.out.println("��ǻ�ͼ����� 0~100������ ������ �Է��� �����մϴ�.");

		} while (com < 0 || 100 < com);
		newlecExam.setCom(com);
	}

}
