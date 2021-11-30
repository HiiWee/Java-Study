package com.hiiwee.app.util;

public class ObjectList {
	private Object[] nums;
	private int current;

	public ObjectList() {
		nums = new Object[3];
		current = 0;
	}
	// Auto Boxing
	public void add(Object num) {
		//Auto Boxing
		nums[current++] = num;
	}

	public void clear() {
		current = 0;
	}

	public int size() {
		// TODO Auto-generated method stub
		return current;
	}
	// 참조형 반환
	public Object get(int index) {
		if (current <= index)
			throw new IndexOutOfBoundsException();
		return nums[index];
	}

}
