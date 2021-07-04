package part3_ex05_abstraction;

import java.util.Scanner;

public abstract class ExamConsole {
	// UI를 나타내는 부분
	// Composition Has A 일체형 has a 상속관계
	private ExamList list;

	public ExamConsole() {
		list = new ExamList();
	}

	public void print() {
		this.print(list.getSize());
	}

	public void print(int size) {
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적  출력      │");
		System.out.println("└───────────────────────────┘");
		System.out.println();
		// int size = list.current;

		for (int i = 0; i < size; i++) {
			Exam exam = list.get(i);// this.exams[i];
			// for문 내에 있어도 1번만 선언되고 맘, 즉 반복되어
			// 선언되지 않는다.
			int kor = exam.getKor();// exam.kor;
			int eng = exam.getEng();
			int math = exam.getMath();

			int total = exam.getTotal();// kor + eng + math;
			// 연산자 다량사용 및 가독성 떨어짐
			// 따라서 임시변수 사용
			float avg = exam.getAvg();// total / 3.0f;

			System.out.printf("국어 %d\n", kor);
			System.out.printf("영어 %d\n", eng);
			System.out.printf("수학 %d\n", math);
			onPrint(exam);

			System.out.printf("총점 : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("─────────────────────────────");
		}
	}

	public void input() {

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
		/*
		 * Exam exam = new Exam(); exam.setKor(kor);//exam.kor = kor;
		 * exam.setEng(eng);//exam.eng = eng; exam.setMath(math);//exam.math = math;
		 */

		// 임시변수
		// Exam exam = new Exam(kor, eng, math);
		Exam exam = makeExam();
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
		onInput(exam);
		/*----------------ADD-------------------------*/
		list.add(exam);

	}

	// 이벤트 메소드 : 자식객체에서 추가되는 과목 성적을 자식에게 맡김
	// 입력을 받기위한 로직이 진행되는 과정에서
	// 확장되는 부분은 자식이 입력하라는 의미로 on사용
	// 이벤트 메소드 = 어떤 사건에 기반되어 실행되는 함수
	protected abstract void onPrint(Exam exam);

	protected abstract void onInput(Exam exam);

	// 팩토리 메소드
	// 자식이 사용할 수 있고 외부 서비스로는 노출안됨
	protected abstract Exam makeExam();

}