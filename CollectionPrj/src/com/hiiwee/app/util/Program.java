package com.hiiwee.app.util;

public class Program {

	public static void main(String[] args) {
		// �ڷ����� ������ �ѱ� �� ����
		// ������Ʈ�ν��� ���� ��ȯ�� ������ Wrapper���ĸ� ���� ex(Integer, Char ...)
		GList<Integer> list = new GList</* String */>();
		// ���������� �տ��� ���ĸ�Ī�� �巯������ �ڿ� String ��������
		// <Interger>�� ���������� ���������Ƿ� ������ ����(���ڿ�, �Ǽ� ��� �����ƴϸ� �ȵ�)
		list.add(3);
		list.add(5);

		int size = list.size();
		System.out.println("size : " + size);

		list.clear();
		size = list.size();
		System.out.println("size : " + size);

		list.add(7);
		// Integer�� ����ȯ���� �ʾƵ��� �̹� T�� ��ȯ��Ű�� �ѱ�Ƿ�
		int num = /*(Integer)*/list.get(0);
		System.out.println("num : " + num);

		//num = (Integer)list.get(1);
	}

}
