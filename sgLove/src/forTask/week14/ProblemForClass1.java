package forTask.week14;

class Shape {
	public void area(int num) {
		System.out.println("�Էµ� ���� : " + num);
	}
}

class Rect extends Shape {

	@Override
	public void area(int num) {
		int area = num * num;
		System.out.println("���簢���� ���� : " + area);
	}
}

class Circle extends Shape {

	@Override
	public void area(int radius) {
		double area = radius * radius * 3.14;
		System.out.println("���� ���� : " + area);
	}
}

public class ProblemForClass1 {

	public static void main(String[] args) {
		Shape rect = new Rect();
		Shape circle = new Circle();
		
		rect.area(5);
		circle.area(5);
	}

}
