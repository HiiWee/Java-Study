package ch09;

class Box4 {
	int w;
	int h;
	int d;

	public Box4(int w, int h, int d) {
		this.w = w;
		this.h = h;
		this.d = d;
	}
}

public class Ex09_01 {
	public static void main(String[] args) {
		Box4 mybox1 = new Box4(10, 20, 30);
		// 오류 발생 >> 명시적 생성자를 사용하면
		// 묵시적 생성자는 자동으로 생성되지 않으므로 직접 작성해야함
		// Box4 mybox2 = new Box4();
		int vol = mybox1.w * mybox1.h * mybox1.d;
		System.out.println("박스의 부피 : " + vol);
	}
}
