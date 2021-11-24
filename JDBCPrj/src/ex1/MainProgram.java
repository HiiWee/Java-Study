package ex1;//(view, run 섞여있음)

import java.sql.SQLException;

import com.hoseok.app.console.NoticeConsole;

public class MainProgram {
	// NoticeConsole에서 던진 예외들은 NoticeConsole객체를 생성하는 메인에서 받아옴 일단 throws
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		NoticeConsole console = new NoticeConsole();
		
		// EXIT 라벨을 이용한 반복문 한번에 벗어나기
		// controller가 따로 존재하지 않고 직접적으로 view에서 호출함
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
				console.writeBoard();
				break;
			case 5: // 검색
				console.inputSearchWord();
				break;
			case 6: // 뒤로가기
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
