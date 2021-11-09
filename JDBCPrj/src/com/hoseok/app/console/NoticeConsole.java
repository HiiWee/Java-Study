package com.hoseok.app.console;

import java.sql.SQLException;
import java.util.List;

import com.hoseok.app.entity.Notice;
import com.hoseok.app.service.NoticeService;

public class NoticeConsole {
	
	private NoticeService service;
	
	public NoticeConsole() {
		service = new NoticeService();
	}
	
	public void printNoticeList() throws ClassNotFoundException, SQLException {
		List<Notice> list = service.getList();
		System.out.printf("����������������������������������������������������������������������\n");
		System.out.printf("<��������> �� %d �Խñ�\n", 12);
		System.out.printf("����������������������������������������������������������������������\n");
		// �ݺ��� ��뿹��
		for(Notice n : list) {
			System.out.printf("%d. %s / %s / %s\n", n.getId(), 
													n.getTitle(), 
													n.getMemberId(), 
													n.getRegdate());
		}
		System.out.printf("����������������������������������������������������������������������\n");
		System.out.printf("           %d/%d pages         \n", 1, 2);
		
	}

	public int inputNoticeMenu() {
		
		return 0;
	}

}
