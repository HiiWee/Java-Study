package ch09;

class Overload {
	public void calc() {
		System.out.println("�Ű������� �����ϴ�.");
	}

	public void calc(int width) {
		System.out.println("���簢���� ���� : " + width * width);
	}

	public void calc(int width, int height) {
		System.out.println("���簢���� ���� : " + width * height);
	}

	public void calc(int width, int height, int depth) {
		System.out.println("������ü�� ���� : " + width * height * depth);
	}
}

public class Ex09_11 {
	public static void main(String[] args) {
		
		Overload ob = new Overload();
		int input[] = new int[args.length];
		
		for (int i = 0; i < args.length; i++) {
			input[i] = Integer.parseInt(args[i]);
		}
		
		switch (args.length) {
		case 0:
			ob.calc();
			break;
		case 1:
			ob.calc(input[0]);
			break;
		case 2:
			ob.calc(input[0], input[1]);
			break;
		case 3:
			ob.calc(input[0], input[1], input[2]);
			break;
		default:
			System.out.println("�μ��� ������ �����ϴ�.");
		}
	}
}
