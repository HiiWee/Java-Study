package com.hoseok.app.console;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.hoseok.app.entity.Notice;
import com.hoseok.app.service.NoticeService;

public class NoticeConsole {
	
	private NoticeService service;
	
	public NoticeConsole() {
		service = new NoticeService();
	}
	
	public void printNoticeList() throws ClassNotFoundException, SQLException {
		List<Notice> list = service.getList(1);
		System.out.printf("───────────────────────────────────\n");
		System.out.printf("<공지사항> 총 %d 게시글\n", 12);
		System.out.printf("───────────────────────────────────\n");
		// 반복문 사용예정
		for(Notice n : list) {
			System.out.printf("%d. %s / %s / %s\n", n.getId(), 
													n.getTitle(), 
													n.getMemberId(), 
													n.getRegdate());
		}
		System.out.printf("───────────────────────────────────\n");
		System.out.printf("           %d/%d pages         \n", 1, 2);
		
	}

	public int inputNoticeMenu() {
		Scanner scan = new Scanner(System.in);
		// 사용자 입력을 받기위한 메뉴 출력
		System.out.print("1.상세조회/ 2.이전/ 3.다음/ 4.글쓰기/ 5.종료>");
		
		// nextInt()는 두가지 문제를 야기, 
		//(1. 정수값이 아닌 값을 입력,))
		//2. 버퍼에 남아있는 엔터키의 키값이 다음 입력에 영향을 줌)
		// 따라서 문자열로 받아 변환을해 입력에 이용
		String menu_ = scan.nextLine();

		// 원래는 변환될 수 있는 것인지 체크하는 과정(숫자맞는지, 잘못된값 아닌지)필요하지만 생략
		int menu = Integer.parseInt(menu_);
		
		return menu;
	}

}
