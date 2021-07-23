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
		// list의 값들은 별도의 식별자 index가 할당됨
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
		//Set은 식별자가 없음 값이 곧 식별자임
		//값 자체가 키가 되므로 식별자가 중복될 수 없음
		//즉 이미 있는 값이 중복되지 않는다.
		// Set으로 특정한 값을 꺼낼일을 없다. 전체를 나열해 뽑는건 가능
		// 사용하는 이유? >> "중복 제거용"
		set.add(3);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(7);
		set.add(7);
		set.add(7);

		System.out.println(set.add(7)); // 기존값 false 반환
		System.out.println(set.add(8)); // 새로운 값 true 반환
		System.out.println(set.size());
		
		Map<String, Object> map = new HashMap<>();
		map.put("id", 3);
		map.put("title", "hello");
		map.put("hit", 12);
		
		System.out.println(map.get("title"));
		
		
		/*
		 List >> 일반적으로 데이터를 배열처럼 관리하고 싶을때(가변길이) 사용
		 
		 Set >> 데이터 수집시 중복을 제거하는 형태의 데이터 수집이 필요할때
		 
		 Map >> 속성을 가지고 있는 개체를 a클래스로 정의하고 사용해야하는데 클래스를 정의하지 않고
		 속성과 값으로 구분된 데이터집합의 객체를 필요로할때 Map계열의 컬렉션을 만들어 사용하게
		*/
		
		/*
		 * 컬렉션을 사용할때 데이터를넣고 다른 한쪽은 데이터를 꺼낼수 있어야함 꺼내보는 작업을 반복자라고하는 iterator를 통해 꺼낸다
		 * iterator라는 패턴과 함께 공부
		 */
	}
}
