package ex1;//(view, run ��������)

import java.sql.SQLException;

import com.hoseok.app.console.NoticeConsole;

public class MainProgram {
	// NoticeConsole���� ���� ���ܵ��� NoticeConsole��ü�� �����ϴ� ���ο��� �޾ƿ� �ϴ� throws
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		NoticeConsole console = new NoticeConsole();
		
		// EXIT ���� �̿��� �ݺ��� �ѹ��� �����
		// controller�� ���� �������� �ʰ� ���������� view���� ȣ����
		EXIT: while (true) {
			console.printNoticeList();
			int menu = console.inputNoticeMenu();
			
			switch (menu) {
			case 1: // ����ȸ
				break;
			case 2: // ����
				console.movePrevList();
				break;
			case 3: // ����
				console.moveNextList();
				break;
			case 4: // �۾���
				console.writeBoard();
				break;
			case 5: // �˻�
				console.inputSearchWord();
				break;
			case 6: // �ڷΰ���
				console.movePrevSearch();
				break;
			case 7:
				System.out.println("End the program");
				break EXIT;
			default:
				System.out.println("You put the wrong value");
				break;
			}
		}
	}

}
