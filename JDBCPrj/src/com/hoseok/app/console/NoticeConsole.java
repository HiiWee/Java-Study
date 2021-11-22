package com.hoseok.app.console;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.hoseok.app.entity.Notice;
import com.hoseok.app.service.NoticeService;

public class NoticeConsole {
	
	private NoticeService service;
	// �������� ����ϱ� ���� ���º���
	// Console�� page�� ���� ���°��� ���°��� �ٶ�����
	private int page;		
	
	public NoticeConsole() {
		service = new NoticeService();
		page = 1;
	}
	
	public void printNoticeList() throws ClassNotFoundException, SQLException {
		List<Notice> list = service.getList(page);
		System.out.printf("����������������������������������������������������������������������\n");
		System.out.printf("<��������> �� %d �Խñ�\n", 10);
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
		Scanner scan = new Scanner(System.in);
		// ����� �Է��� �ޱ����� �޴� ���
		System.out.print("1.����ȸ/ 2.����/ 3.����/ 4.�۾���/ 5.����>");
		
		// nextInt()�� �ΰ��� ������ �߱�, 
		//(1. �������� �ƴ� ���� �Է�,))
		//2. ���ۿ� �����ִ� ����Ű�� Ű���� ���� �Է¿� ������ ��)
		// ���� ���ڿ��� �޾� ��ȯ���� �Է¿� �̿�
		String menu_ = scan.nextLine();

		// ������ ��ȯ�� �� �ִ� ������ üũ�ϴ� ����(���ڸ´���, �߸��Ȱ� �ƴ���)�ʿ������� ����
		int menu = Integer.parseInt(menu_);
		
		return menu;
	}

	public void movePrevList() {
		if (page == 1) {
			System.out.println("���� �������� �����ϴ�.");
			return;
		}
		page--;
		
	}

	public void moveNextList() {
		// ������ �������� �����ϴ� ����� ����� ������ �ϴ� ����
		
		//	if (page == 1) {
		//		System.out.println("���� �������� �����ϴ�.");
		//		return;
		//	}
		page++;
	}

}
