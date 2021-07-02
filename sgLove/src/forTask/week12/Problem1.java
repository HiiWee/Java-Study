package forTask.week12;

class Shape {

	public void getArea(int radius) {
		System.out.println("정수형 반지름의 원의 넓이 : " + 3.14 * radius * radius);
	}

	public void getArea(double radius) {
		System.out.println("실수형 반지름의 원의 넓이 : " + 3.14 * radius * radius);
	}

	public void getArea(int base, int altitude) {
		System.out.println("삼각형의 넓이 : " + base * altitude / 2);
	}
}

public class Problem1 {
	public static void main(String[] args) {
		Shape figure = new Shape();
		
		figure.getArea(5);
		figure.getArea(5.5);
		figure.getArea(4, 6);
	}
}
