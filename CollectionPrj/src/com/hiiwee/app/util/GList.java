package com.hiiwee.app.util;

//Generic Ŭ����
// T(type) ���ڸ� �ַ� ��� �ƹ��ų� �ᵵ��
// ���ڸ� 2���̻� �ѱ� �� ����
public class GList<T /* , �ι�°Ÿ�� */> {
	private Object[] nums;
	private int current;
	private int capacity; // �ʱ� �迭ũ��(����)
	private int amount; // �迭 ������(����)

	public GList() {
		capacity = 3;
		amount = 5;
		// nums = new T[3]; �Ұ� ��ü�� ������ Object��������
		nums = new Object[capacity];
		current = 0;
	}

	// Auto Boxing
	// ��ü�� ������ Object�������� �ϵ� ������ ���� T������ ����ȯ����
	public void add(T num) {
		// ���� ũ���� �迭 ���� (�ʱ�ũ�� 3, �߰�ũ�� 5)
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
		// ����� T�� ��ȯ�ؾ� �ϹǷ� T�������� ����ȯ����(Wrapper ������ Ŭ���� �⺻�ڷ����� �ȵ�)
		return (T) nums[index];
	}

}
