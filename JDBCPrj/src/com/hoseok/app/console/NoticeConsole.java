// view(controller 역할도 같이하고 있음)
package com.hoseok.app.console;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.hoseok.app.entity.Notice;
import com.hoseok.app.service.NoticeService;

public class NoticeConsole {
	
	private NoticeService service;
	// 페이지를 기억하기 위한 상태변수
	// Console이 page에 대한 상태값을 갖는것이 바람직함
	private int page;
	
	// 키워드를 검색하기 위한 변수(serarchWord,Field) inputSearchWord()에서 사용되는 것 뿐만아니라
	// printNoticeList()에서 목록을 조회할때도 사용되므로 멤버변수로 공유
	private String searchField;
	private String searchWord;

	public NoticeConsole() {
		service = new NoticeService();
		page = 1;
		// 아무값도 없으면 NoticeService.getList()의 쿼리문이 오류남
		// [필드값누락] like '%word%'
		searchField="title";
		searchWord="";
	}
	
	public void printNoticeList() throws ClassNotFoundException, SQLException {
		List<Notice> list = service.getList(page, searchField, searchWord);
		// 게시물의 개수를 카운트하는 변수
		int count = service.getCount(searchField, searchWord);
		// 마지막 페이지를 담는 변수
		int lastPage = count/10;
		lastPage = count%10>0 ? lastPage + 1 : lastPage;
		
		System.out.printf("───────────────────────────────────────────────\n");
		System.out.printf("<공지사항> 총 %d 게시글\n", count);
		System.out.printf("───────────────────────────────────────────────\n");
		// 반복문 사용예정
		for(Notice n : list) {
			System.out.printf("%d / %s / %s / %s / %s\n", n.getId(), 
													n.getTitle(), 
													n.getMemberId(),
													n.getContent(),
													n.getRegdate());
		}
		System.out.printf("───────────────────────────────────────────────\n");
		System.out.printf("           %d/%d pages         \n", page, lastPage);
		
	}

	public int inputNoticeMenu() {
		Scanner scan = new Scanner(System.in);
		// 사용자 입력을 받기위한 메뉴 출력
		System.out.print("1.상세조회/ 2.이전/ 3.다음/ 4.글쓰기/ 5.검색/ 6.뒤로가기/ 7.종료>");
		
		// nextInt()는 두가지 문제를 야기, 
		//(1. 정수값이 아닌 값을 입력,))
		//2. 버퍼에 남아있는 엔터키의 키값이 다음 입력에 영향을 줌)
		// 따라서 문자열로 받아 변환을해 입력에 이용
		String menu_ = scan.nextLine();

		// 원래는 변환될 수 있는 것인지 체크하는 과정(숫자맞는지, 잘못된값 아닌지)필요하지만 생략
		int menu = Integer.parseInt(menu_);
		
		return menu;
	}

	public void movePrevList() {
		if (page == 1) {
			System.out.println("\n\n=========================================");
			System.out.println("[ 이전 페이지가 없습니다. ]");
			System.out.println("=========================================");
			return;
		}
		System.out.print("\n\n");
		page--;
		
	}

	public void moveNextList() throws ClassNotFoundException, SQLException {
		// main에서 함수가 호출되기전 사이에 다른 값이 들어올 수 있으므로
		// 새로 지역변수로 선언해서 다시 count와 lastPage값을 구한다.
		// 게시물의 개수를 카운트하는 변수
		int count = service.getCount(searchField, searchWord);
		// 마지막 페이지를 담는 변수
		int lastPage = count / 10;
		lastPage = count % 10 > 0 ? lastPage + 1 : lastPage;
		if (page == lastPage) {
			System.out.println("\n\n=========================================");
			System.out.println("[ 다음 페이지가 없습니다. ]");
			System.out.println("=========================================");
			return;
		}
		System.out.print("\n\n");
		page++;
	}

	public void inputSearchWord() throws ClassNotFoundException, SQLException {
		page = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\n검색 범주(title/ content/ memberId)중에 하나를 입력하세요.");
		System.out.print(">");
		searchField = scan.nextLine();

		System.out.print("검색어 >");
		searchWord = scan.nextLine();
		System.out.print("\n\n");
		
	}

	public void movePrevSearch() {
		if (searchWord != "" && searchField != "title") {
			System.out.println("\n\n처음 목록으로 돌아갑니다.");
			searchField = "title";
			searchWord = "";
			return;
		}
		System.out.println("\n\n이미 처음 목록입니다.");
	}

	public void writeBoard() throws ClassNotFoundException, SQLException {
		// 객체 전달을 위한 임시객체 생성
		Notice notice = new Notice();

		String title = "";
		String memberId = "";
		String content = "";
		String files = null;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n\n글을 작성 합니다. (글제목, 작성자, 글내용, 파일을 순서대로 입력하세요)");
		
		// title not null
		System.out.print("글 제목 >");
		title = scan.nextLine();
		
		// memberId not null
		System.out.print("작성자 >");
		memberId = scan.nextLine();
		
		// content null
		System.out.print("글내용 >");
		content = scan.nextLine();
		
		// files null
		System.out.print("파일 >");
		files = scan.nextLine();
		
		// 제목 또는 작성자 미입력시 프로그램 종료
		if (title == "" && memberId == "") {
			System.out.println("제목 또는 작성자를 입력하지 않았습니다.");
			return;
		}
		
		notice.setTitle(title);
		notice.setMemberId(memberId);
		notice.setContent(content);
		notice.setFiles(files);
		
		// 예외 처리 해야하는데.. ㅠ
		int result = service.insert(notice);
		if (result > 0) {
			System.out.printf("게시물 %d개가 작성되었습니다.\n\n", result);
			return;
		}
		System.out.println("게시물 작성을 실패했습니다.\n\n");
		
	}

}
