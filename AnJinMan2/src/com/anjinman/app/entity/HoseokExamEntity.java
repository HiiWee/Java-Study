package com.anjinman.app.entity;


/* 
 * ExamEntity ��ü�� �߻� �޼ҵ带 ���� �� ���ο� ���� computer �߰�, getter setter ����
 * */
public class HoseokExamEntity extends ExamEntity {
	private int computer;
	
	public int getComputer() {
		return computer;
	}

	public void setComputer(int computer) {
		this.computer = computer;
	}

	public HoseokExamEntity() {
		super();
		this.computer = 0;
	}
	
	public HoseokExamEntity(int korean, int english, int math, int computer) {
		super(korean, english, math);
		this.computer = computer;
		
	}

	// onTotal()�� ���� �������� ���� ���� �����´�.
	@Override
	public int getTotal() {
		return onTotal() + this.computer;
	}

	@Override
	public float getAvg() {
		return getTotal()/4.0f;
	}
}
