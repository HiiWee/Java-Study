package Ch03;

public class Ex03_15 {
	public static void main(String[] args) {
		byte b = 120;
		int i = b;
		
		System.out.println("Ȯ�� �� ��ȯ : " + i);
		int j = 259;
		double d = 259.428;
		
		System.out.println("��� �� ��ȯ ���");
		b = (byte)j;
		System.out.println("int 259�� byte�� : " + b);
		i = (int)d;
		System.out.println("double 259.428�� int�� : " + i);
		b = (byte) d;
		System.out.println("double 259.428�� byte�� : " +b);
		
	}
}
