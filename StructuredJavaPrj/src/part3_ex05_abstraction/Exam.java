package part3_ex05_abstraction;

public abstract class Exam {
	private int kor;
	private int eng;
	private int math;
	
	//�ڵ��� ����ȭ
	public Exam() {
		this(0, 0, 0);
	}
	
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	//getter and setter
	public int getKor() {
		
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public abstract int getTotal();
	
	//�ڽĿ��Ը� �����Ǵ� �޼ҵ�
	//�ڽ� Ŭ�������� getTotal()�� ó������ �����ϴ°Ϳ� ����
	//�δ��� ���� �� �ִ�.
	protected int onTotal() {
		return kor + eng + math;
	}

	public abstract float getAvg();
	
}
