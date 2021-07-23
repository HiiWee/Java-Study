package com.hiiwee.app.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionProgram {

	public static void main(String[] args) {
		// GList<Integer> list = new GList</* String */>();
		List<Integer> list = new ArrayList<>();
		// list�� ������ ������ �ĺ��� index�� �Ҵ��
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);
		System.out.println(list.get(2));
		System.out.println(list.size());
		Iterator<Integer> it = list.iterator();
		list.forEach(null);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Set<Integer> set = new HashSet<>();
		//Set�� �ĺ��ڰ� ���� ���� �� �ĺ�����
		//�� ��ü�� Ű�� �ǹǷ� �ĺ��ڰ� �ߺ��� �� ����
		//�� �̹� �ִ� ���� �ߺ����� �ʴ´�.
		// Set���� Ư���� ���� �������� ����. ��ü�� ������ �̴°� ����
		// ����ϴ� ����? >> "�ߺ� ���ſ�"
		set.add(3);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(7);
		set.add(7);
		set.add(7);

		System.out.println(set.add(7)); // ������ false ��ȯ
		System.out.println(set.add(8)); // ���ο� �� true ��ȯ
		System.out.println(set.size());
		
		Map<String, Object> map = new HashMap<>();
		map.put("id", 3);
		map.put("title", "hello");
		map.put("hit", 12);
		
		System.out.println(map.get("title"));
		
		
		/*
		 List >> �Ϲ������� �����͸� �迭ó�� �����ϰ� ������(��������) ���
		 
		 Set >> ������ ������ �ߺ��� �����ϴ� ������ ������ ������ �ʿ��Ҷ�
		 
		 Map >> �Ӽ��� ������ �ִ� ��ü�� aŬ������ �����ϰ� ����ؾ��ϴµ� Ŭ������ �������� �ʰ�
		 �Ӽ��� ������ ���е� ������������ ��ü�� �ʿ���Ҷ� Map�迭�� �÷����� ����� ����ϰ�
		*/
		
		/*
		 * �÷����� ����Ҷ� �����͸��ְ� �ٸ� ������ �����͸� ������ �־���� �������� �۾��� �ݺ��ڶ���ϴ� iterator�� ���� ������
		 * iterator��� ���ϰ� �Բ� ����
		 */
	}
}
