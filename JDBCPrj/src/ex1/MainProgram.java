package ex1;

import java.sql.SQLException;

import com.hoseok.app.console.NoticeConsole;

public class MainProgram {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		NoticeConsole console = new NoticeConsole();
		console.printNoticeList();
		int menu = console.inputNoticeMenu();
	
		switch(menu) {
		case 1:		// ����ȸ
			break;
		case 2:		// ����
			break;
		case 3:		// ����
			break;
		case 4:		// �۾���
			break;
		
		}
	}

}
