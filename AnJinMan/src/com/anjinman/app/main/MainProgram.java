package com.anjinman.app.main;

import java.util.Scanner;

import com.anjinman.app.console.ExamConsole;

// ���� �Է� ���α׷�
public class MainProgram {

	public static void main(String[] args) {
		ExamConsole console = new ExamConsole();
		
		int menu;
		boolean keepLoop = true;
		
		
		while (keepLoop) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("���ϴ� ������ �����ϼ���"); 
			System.out.println("1. ���� �Է�"); 
			System.out.println("2. ���� ���"); 
			System.out.println("3. ���α׷� ����");
			
			menu = scan.nextInt();

			switch (menu) {
			case 1:
				console.inputList();
				break;
			case 2:
				console.printList();
				break;
			case 3:
				System.out.println("�ý����� �����մϴ�.");
				return;
			
			}
		}
	}

	

}


