// view(controller ���ҵ� �����ϰ� ����)
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
	
	// Ű���带 �˻��ϱ� ���� ����(serarchWord,Field) inputSearchWord()���� ���Ǵ� �� �Ӹ��ƴ϶�
	// printNoticeList()���� ����� ��ȸ�Ҷ��� ���ǹǷ� ��������� ����
	private String searchField;
	private String searchWord;

	public NoticeConsole() {
		service = new NoticeService();
		page = 1;
		// �ƹ����� ������ NoticeService.getList()�� �������� ������
		// [�ʵ尪����] like '%word%'
		searchField="title";
		searchWord="";
	}
	
	public void printNoticeList() throws ClassNotFoundException, SQLException {
		List<Notice> list = service.getList(page, searchField, searchWord);
		// �Խù��� ������ ī��Ʈ�ϴ� ����
		int count = service.getCount(searchField, searchWord);
		// ������ �������� ��� ����
		int lastPage = count/10;
		lastPage = count%10>0 ? lastPage + 1 : lastPage;
		
		System.out.printf("����������������������������������������������������������������������������������������������\n");
		System.out.printf("<��������> �� %d �Խñ�\n", count);
		System.out.printf("����������������������������������������������������������������������������������������������\n");
		// �ݺ��� ��뿹��
		for(Notice n : list) {
			System.out.printf("%d / %s / %s / %s / %s\n", n.getId(), 
													n.getTitle(), 
													n.getMemberId(),
													n.getContent(),
													n.getRegdate());
		}
		System.out.printf("����������������������������������������������������������������������������������������������\n");
		System.out.printf("           %d/%d pages         \n", page, lastPage);
		
	}

	public int inputNoticeMenu() {
		Scanner scan = new Scanner(System.in);
		// ����� �Է��� �ޱ����� �޴� ���
		System.out.print("1.����ȸ/ 2.����/ 3.����/ 4.�۾���/ 5.�˻�/ 6.�ڷΰ���/ 7.����>");
		
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
			System.out.println("\n\n==========================");
			System.out.println("[ ���� �������� �����ϴ�. ]");
			System.out.println("==========================");
			return;
		}
		System.out.print("\n\n");
		page--;
		
	}

	public void moveNextList() throws ClassNotFoundException, SQLException {
		// main���� �Լ��� ȣ��Ǳ��� ���̿� �ٸ� ���� ���� �� �����Ƿ�
		// ���� ���������� �����ؼ� �ٽ� count�� lastPage���� ���Ѵ�.
		// �Խù��� ������ ī��Ʈ�ϴ� ����
		int count = service.getCount(searchField, searchWord);
		// ������ �������� ��� ����
		int lastPage = count / 10;
		lastPage = count % 10 > 0 ? lastPage + 1 : lastPage;
		if (page == lastPage) {
			System.out.println("\n\n==========================");
			System.out.println("[ ���� �������� �����ϴ�. ]");
			System.out.println("==========================");
			return;
		}
		System.out.print("\n\n");
		page++;
	}

	public void inputSearchWord() throws ClassNotFoundException, SQLException {
		page = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\n�˻� ����(title/ content/ memberId)�߿� �ϳ��� �Է��ϼ���.");
		System.out.print(">");
		searchField = scan.nextLine();

		System.out.print("�˻��� >");
		searchWord = scan.nextLine();
		System.out.print("\n\n");
		
	}

	public void movePrevSearch() {
		if (searchWord != "" && searchField != "title") {
			System.out.println("\n\nó�� ������� ���ư��ϴ�.");
			searchField = "title";
			searchWord = "";
			return;
		}
		System.out.println("\n\n�̹� ó�� ����Դϴ�.");
	}

}
