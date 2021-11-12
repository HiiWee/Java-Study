package com.anjinman.app.console;

import java.util.Scanner;

import com.anjinman.app.entity.ExamEntity;
import com.anjinman.app.list.ExamList;


// �ִܼ� ������� ���� �� ȭ�鿡 ǥ�õǴ� �κ��� ����Ѵ�.
// ExamList()��ü�� ������ ���ο� ��ü�� input �Ǵ� ���� ��ü�� output�ɶ� ExamList()��ü�� �̿��Ѵ�.
// ExamList() ��ü�� composition has a ����� �����ϰ� �ִ�.
public abstract class ExamConsole {
	private ExamList list;

	public ExamConsole() {
		list = new ExamList();
	}

	public void inputList() {
		// ���� ���� ����
		int korean;
		int english;
		int math;

		// 1. ����� �ȳ��� ���
		// print console
		inputMenu();
		Scanner scan = new Scanner(System.in);

		korean = scan.nextInt();
		english = scan.nextInt();
		math = scan.nextInt();

		// ExamEntity�� �߻� Ŭ���� �̹Ƿ� ��ü ������ ��ƴ�.
		//ExamEntity exam = new ExamEntity();
		ExamEntity exam = makeExam();

		// 2. ����� ���� �Է�
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
		
		System.out.println("������ ����մϴ�.\n");
		for (int i = 0; i < size; i++) {
			ExamEntity exam = list.getEntity(i);
			
			int korean = exam.getKorean();
			int english = exam.getEnglish();
			int math = exam.getMath();
			
			int total = exam.getTotal();
			float avg = exam.getAvg();
			System.out.printf("�л� %d\n", i + 1);
			System.out.printf("����:  %d\n", korean);
			System.out.printf("����:  %d\n", english);
			System.out.printf("����:  %d\n", math);
			onPrintList(exam);
			
			System.out.printf("�� �� : %d\n", total);
			System.out.printf("�� �� : %f\n", avg);
			
		}
	}


	// �ڽĿ��� ���θ޴� ����⸦ ������
	abstract public void inputMenu();
//	{
//		System.out.println("����������������������������������������������������������");
//		System.out.println("��           ���� �޴�     	��");
//		System.out.println("����������������������������������������������������������");
//		System.out.println("\t ������ ������� �Է��ϼ���. ");
//		System.out.println("\t���� ");
//		System.out.println("\t���� ");
//		System.out.println("\t���� ");
//
//	}
	
	// ���丮 �޼ҵ� : ����Ʈ�� �߰��ϱ� ���� ��ü�� �����ϴ� �κ��� HoseokExamConsole(�ڽ�Ŭ����)�� �±�
	protected abstract ExamEntity makeExam();
	
	// �̺�Ʈ �޼ҵ�
	// ������ flow���� ���ο� ������ �߰��ϱ����� �̺�Ʈ flow�� ������
	protected abstract void onInputList(ExamEntity exam);
	
	// �̺�Ʈ �޼ҵ�
	// ������ flow���� ���ο� ������ �߰��ϱ����� �̺�Ʈ flow�� ������
	protected abstract void onPrintList(ExamEntity exam);
}
