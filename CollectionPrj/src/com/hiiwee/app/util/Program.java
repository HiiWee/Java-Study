package com.hiiwee.app.util;

public class Program {

	public static void main(String[] args) {
		// 자료형에 형식을 넘길 수 있음
		// 오브젝트로써의 형식 변환이 가능한 Wrapper형식만 가능 ex(Integer, Char ...)
		GList<Integer> list = new GList</* String */>();
		// 묵시적으로 앞에서 형식명칭을 드러냄으로 뒤에 String 생략가능
		// <Interger>로 묵시적으로 설정했으므로 정수만 가능(문자열, 실수 등등 정수아니면 안됨)
		list.add(3);
		list.add(5);

		int size = list.size();
		System.out.println("size : " + size);

		list.clear();
		size = list.size();
		System.out.println("size : " + size);

		list.add(7);
		// Integer로 형변환하지 않아도됨 이미 T로 변환시키고 넘기므로
		int num = /*(Integer)*/list.get(0);
		System.out.println("num : " + num);

		//num = (Integer)list.get(1);
	}

}
