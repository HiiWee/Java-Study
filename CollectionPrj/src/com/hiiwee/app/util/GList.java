package com.hiiwee.app.util;

//Generic 클래스
// T(type) 약자를 주로 사용 아무거나 써도됨
// 인자를 2개이상 넘길 수 있음
public class GList<T /* , 두번째타입 */> {
	private Object[] nums;
	private int current;
	private int capacity; // 초기 배열크기(가변)
	private int amount; // 배열 증가량(고정)

	public GList() {
		capacity = 3;
		amount = 5;
		// nums = new T[3]; 불가 객체는 무조건 Object형식으로
		nums = new Object[capacity];
		current = 0;
	}

	// Auto Boxing
	// 객체는 무조건 Object형식으로 하되 들어오는 값을 T형으로 형변환해줌
	public void add(T num) {
		// 가변 크기의 배열 생성 (초기크기 3, 추가크기 5)
		if (current >= capacity) {
			Object[] temp = new Object[capacity + amount];
			for (int i = 0; i < current; i++) {
				temp[i] = nums[i];
			}
			capacity += amount;
			nums = temp;
		}
		// Auto Boxing
		nums[current++] = num;
	}

	public void clear() {
		current = 0;
	}

	public int size() {
		return current;
	}

	public T get(int index) {
		if (current <= index)
			throw new IndexOutOfBoundsException();
		// 벗어날때 T를 반환해야 하므로 T형식으로 형변환해줌(Wrapper 형태의 클래스 기본자료형은 안됨)
		return (T) nums[index];
	}

}
