package ch03;

public class Ex03_19 {
	public static void main(String[] args) {
		
		byte a = 127, b = 2;
		byte c = (byte)(a * b);
		System.out.println("a*b�� ����� byte�� ��ȯ���: " + c);
		
		int d = a * b;
		System.out.println("a*b�� ����� int�� ��� : " + d);
		
		int i = 1000000, j = 10000000;
		int k = i * j;
		System.out.println("�鸸*�鸸�� ����� int�� ���: " + k);
		
		long m = (long)(i*j);
		System.out.println("����(int ����)�� ����� long���� ��ȯ�� �� ���:" + m);
		
		m = (long)i * j;
		System.out.println("i�� long ������ ��ȯ �� ����(long����)�Ͽ� ��� :" + m);
		m = (long)i * (long)j;
		System.out.println("�鸸�� long���� ��ȯ �� ����(long����) ����� ��� :" + m);
		
	}
}