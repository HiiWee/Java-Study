package part3_ex05_abstraction;

public class NewlecExam extends Exam {
	
	private int com;
	
	public NewlecExam() {
		this(0, 0, 0, 0);
	}

	public NewlecExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);
		this.com = com;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public int getTotal() {
		//super Ű���带 �̿��� �� ���� ���������� total���� �����ؾ� �ϴ�
		//�������� �־��� ���� protectedŰ���带 �̿��� �ڽĿ��Ը� ����� �� �ִ�
		//onTotal �޼ҵ带 ������ �� ����
		//int total = getKor() + getEng() + getMath() + getCom();
		int total = onTotal() + getCom();
		return total;
	}

	@Override
	public float getAvg() {
		
		return getTotal()/4.0f;
	}

}
