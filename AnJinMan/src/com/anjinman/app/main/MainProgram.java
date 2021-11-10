package com.anjinman.app.main;

import java.util.Scanner;

import com.anjinman.app.console.ExamConsole;

// 성적 입력 프로그램
public class MainProgram {

	public static void main(String[] args) {
		ExamConsole console = new ExamConsole();
		
		int menu;
		boolean keepLoop = true;
		
		
		while (keepLoop) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("원하는 동작을 설정하세요"); 
			System.out.println("1. 성적 입력"); 
			System.out.println("2. 성적 출력"); 
			System.out.println("3. 프로그램 종료");
			
			menu = scan.nextInt();

			switch (menu) {
			case 1:
				console.inputList();
				break;
			case 2:
				console.printList();
				break;
			case 3:
				System.out.println("시스템을 종료합니다.");
				return;
			
			}
		}
	}

	

}


