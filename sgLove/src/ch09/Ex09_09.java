package ch09;

class Box11 {
	private int iVol;
	private double dVol;

	public Box11(int width, int height, int depth) {
		volume(width, height, depth);
	}

	public Box11(double width, double height, double depth) {
		volume(width, height, depth);
	}

	private void volume(int width, int height, int depth) {
		iVol = width * height * depth;
	}

	private void volume(double width, double height, double depth) {
		dVol = width * height * depth;
	}
	public int getIVolume() {
		return iVol;
	}
	
	public double getDVolume() {
		return dVol;
	}
}

public class Ex09_09 {
	public static void main(String[] args) {
		Box11 ob = new Box11(10, 20, 30);
		System.out.println("정수 매개변수 박스의 부피 : " + ob.getIVolume());
		
		Box11 ob1 = new Box11(10.5, 20.5, 30.5);
		System.out.println("실수 매개변수 박스의 부피 : " + ob1.getDVolume());
		
		
	}
}
