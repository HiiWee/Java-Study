package Ch02;
import java.util.Scanner;

public class Ex02_04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�̸�, ����, �����Ը� ����(Space)�� �����Ͽ� �Է� : ");
		
		String name = scan.next();
		int age = scan.nextInt();
		double weight = scan.nextDouble();
		
		System.out.println(name + " ���� ���̴� " + age + "���̰�");
		System.out.println("�����Դ� " + weight + "Kg �Դϴ�.");
	}
	
}
