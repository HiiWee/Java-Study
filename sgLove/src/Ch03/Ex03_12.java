package Ch03;

public class Ex03_12 {
	public static void main(String[] args) {
		double r = 5.0;
		double pi = 3.14159;
		
		System.out.printf("�������� %f�� ���� ���̴� %f�Դϴ�.\n", 5.0, 5.0*5.0*3.14159);
		System.out.printf("�������� %f�� ���� ���̴� %f�Դϴ�.\n", r, r*r*pi);
		System.out.printf("�������� %E�� ���� ���̴� %E�Դϴ�.\n", r, r*r*pi);

		System.out.printf("123.456�� %%f�� : %f\n", 123.456);
		System.out.printf("123.456�� %%e�� : %e\n", 123.456);
		System.out.printf("-123.456�� %%E�� : %E\n", -123.456);
	}
}
