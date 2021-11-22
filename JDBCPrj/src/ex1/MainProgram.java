package ex1;

import java.sql.SQLException;

import com.hoseok.app.console.NoticeConsole;

public class MainProgram {
	// NoticeConsole에서 던진 예외들은 NoticeConsole객체를 생성하는 메인에서 받아옴 일단 throws
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		NoticeConsole console = new NoticeConsole();
		
		// EXIT 라벨을 이용한 반복문 한번에 벗어나기
		EXIT: while (true) {
			console.printNoticeList();
			int menu = console.inputNoticeMenu();

			switch (menu) {
			case 1: // 상세조회
				break;
			case 2: // 이전
				console.movePrevList();
				break;
			case 3: // 다음
				console.moveNextList();
				break;
			case 4: // 글쓰기
				break;
			case 5: // 종료
				System.out.println("End the program");
				break EXIT;
			default:
				System.out.println("You put the wrong value");
				break;
			}
		}
	}

}
