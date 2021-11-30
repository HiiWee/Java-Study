package ch10;

class AA {
	public void show(String s) {
		System.out.println("상위 클래스의 메소드 수행" + s);
	}
}

class BB extends AA {
	@Override
	public void show(String s) {
		System.out.println("하위 클래스의 메소드 수행" + s);
	}
}

public class Ex10_08 {

	public static void main(String[] args) {
		BB ob = new BB();
		ob.show("오버라이딩이 되나??!");
	}

}
