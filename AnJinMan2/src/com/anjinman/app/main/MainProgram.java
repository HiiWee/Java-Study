package com.anjinman.app.main;

import java.util.Scanner;

import com.anjinman.app.console.ExamConsole;
import com.anjinman.app.console.HoseokExamConsole;

/*
 * ���� ExamConsole�� ���񽺸� �������� HoseokExamConsole ��ü�� ����
 * [ �� �ڵ忡 �޼ҵ� ���� �Ǿ�����
 * */
public class MainProgram {

	public static void main(String[] args) {
		ExamConsole hoseok = new HoseokExamConsole();
		
		hoseok.inputList();
		
		hoseok.printList();
	}

}
