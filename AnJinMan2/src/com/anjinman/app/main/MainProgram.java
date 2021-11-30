package com.anjinman.app.main;

import java.util.Scanner;

import com.anjinman.app.console.ExamConsole;
import com.anjinman.app.console.HoseokExamConsole;

/*
 * 기존 ExamConsole의 서비스를 물려받은 HoseokExamConsole 객체의 실행
 * [ 각 코드에 메소드 설명 되어있음
 * */
public class MainProgram {

	public static void main(String[] args) {
		ExamConsole hoseok = new HoseokExamConsole();
		
		hoseok.inputList();
		
		hoseok.printList();
	}

}
