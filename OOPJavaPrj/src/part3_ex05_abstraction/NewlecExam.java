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
		//super 키워드를 이용할 수 없고 직접적으로 total값을 구현해야 하는
		//불편함이 있었음 따라서 protected키워드를 이용해 자식에게만 사용할 수 있는
		//onTotal 메소드를 구현할 수 있음
		//int total = getKor() + getEng() + getMath() + getCom();
		int total = onTotal() + getCom();
		return total;
	}

	@Override
	public float getAvg() {
		
		return getTotal()/4.0f;
	}

}
