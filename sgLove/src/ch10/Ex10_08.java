package ch10;

class AA {
	public void show(String s) {
		System.out.println("���� Ŭ������ �޼ҵ� ����" + s);
	}
}

class BB extends AA {
	@Override
	public void show(String s) {
		System.out.println("���� Ŭ������ �޼ҵ� ����" + s);
	}
}

public class Ex10_08 {

	public static void main(String[] args) {
		BB ob = new BB();
		ob.show("�������̵��� �ǳ�??!");
	}

}
