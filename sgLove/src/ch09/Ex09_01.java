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
		// ���� �߻� >> ����� �����ڸ� ����ϸ�
		// ������ �����ڴ� �ڵ����� �������� �����Ƿ� ���� �ۼ��ؾ���
		// Box4 mybox2 = new Box4();
		int vol = mybox1.w * mybox1.h * mybox1.d;
		System.out.println("�ڽ��� ���� : " + vol);
	}
}
