package 메소드오버로딩테스트;

public class Child /* extends Parent */ {

	public int sum(int a, int b) {
		return this.sum(a, b, 0);
	}
	
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	

	
}
