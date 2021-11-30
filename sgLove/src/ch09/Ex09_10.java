package ch09;

class Box12 {
	private int iVol;

	public Box12(int w, int h, int d) {
		iVol = w * h * d;
	}

	public int getVol() {
		return iVol;
	}
}

public class Ex09_10 {
	public static void main(String[] args) {
		Box12[] mybox = new Box12[10];

		for (int i = 0; i < mybox.length; i++) {
			mybox[i] = new Box12(10 * i, 20 * i, 30 * 1);
		}

		for (Box12 mb : mybox) {
			System.out.println(mb.getVol());
		}

	}
}
