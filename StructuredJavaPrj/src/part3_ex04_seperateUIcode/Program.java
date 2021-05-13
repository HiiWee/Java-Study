package part3_ex04_seperateUIcode;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		ExamConsole list = new ExamConsole();
		//list.init();
		
		int menu;
		boolean keepLoop = true;
		// 스캐너는 굳이 전역변수로 공유할필요없다.
		Scanner scan = new Scanner(System.in);

		while (keepLoop) {
			menu = inputMenu();

			switch (menu) {
			case 1:
				//ExamList.inputList(list);
				list.inputList();
				break;
			case 2: 
				//ExamList.printList(list);
				list.printList();
				break;
			case 3:
				System.out.println("Bye~~");

				keepLoop = false;
				break;

			default:
				System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지입니다.");

			}

		}
	}

	
	static int inputMenu() {

		int menu;

		Scanner scan = new Scanner(System.in);
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           메인 메뉴       │");
		System.out.println("└───────────────────────────┘");
		System.out.println("\t1. 성적입력 ");
		System.out.println("\t2. 성적출력 ");
		System.out.println("\t3. 종료 ");
		System.out.println("\t선택> ");
		menu = scan.nextInt();

		return menu;
	}

}
