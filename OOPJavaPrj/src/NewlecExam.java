import part3_ex04_seperateUIcode.Exam;
//is a 상속
public class NewlecExam extends Exam{
	private int com;
	
	public NewlecExam() {
		this(0, 0, 0, 0);
	}
	public NewlecExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);	//부모의 생성자 호출
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
		//부모객체 getTotal + com
		return super.getTotal() + com;
	}
	
	@Override
	public float getAvg() {
		return getTotal()/4.0f;
	}
}
