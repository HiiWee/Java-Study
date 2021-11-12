package com.anjinman.app.console;

import java.util.Scanner;

import com.anjinman.app.entity.ExamEntity;
import com.anjinman.app.entity.HoseokExamEntity;

public class HoseokExamConsole extends ExamConsole {

	
	// ���丮 �޼ҵ� ���� ���� ���ӹ޾� ������� HoseokExamEntity ��ü�� �����ϰ� ��ȯ��
	@Override
	protected ExamEntity makeExam() {
		return new HoseokExamEntity();
	}

	
	// �̺�Ʈ �޼ҵ� : HoseokExamEntity�� ���ο� ������ ��ǻ�� ������ ������ �Է���
	@Override
	protected void onInputList(ExamEntity exam) {
		int computer;
		Scanner scan = new Scanner(System.in);
		HoseokExamEntity hoseokExam = (HoseokExamEntity)exam;
		
		computer = scan.nextInt();
		
		hoseokExam.setComputer(computer);
		
		
	}

	// �̺�Ʈ �޼ҵ� : HoseokExamEntity�� ���ο� ������ ��ǻ�� ������ ������ �����
	@Override
	protected void onPrintList(ExamEntity exam) {
		HoseokExamEntity hoseokExam = (HoseokExamEntity)exam;
		int computer = hoseokExam.getComputer();
		System.out.printf("��ǻ��:  %d\n", computer);
	}
	
	
	// �ڽĿ��� ���ӵ� �޴� ����� ����
	@Override
	public void inputMenu() {
		System.out.println("����������������������������������������������������������");
		System.out.println("��           ���� �޴�     	��");
		System.out.println("����������������������������������������������������������");
		System.out.println("\t ������ ������� �Է��ϼ���. ");
		System.out.println("\t���� ");
		System.out.println("\t���� ");
		System.out.println("\t���� ");
		System.out.println("\t��ǻ�� ");
	}

}
