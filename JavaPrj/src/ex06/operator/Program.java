package ex06.operator;

//import Class "Scanner"
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		int kor1, kor2, kor3;
		int total;
		float avg;

		Scanner scan = new Scanner(System.in);
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		
		//----------------------���� �Է� �κ�----------------------
		System.out.println("���ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѦ�");
		System.out.println("��         �����Է�         ��");
		System.out.println("���ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѦ�");

		System.out.print("����1:");
		kor1 = scan.nextInt();
		System.out.print("����2:");
		kor2 = scan.nextInt();
		System.out.print("����3:");
		kor3 = scan.nextInt();
		
		// ��ȿ�˻� (0~100 ���̰���)
		int validate = (0<=kor1 && 100>=kor1)?1:0;
		System.out.println(validate);
		
		//----------------------���� ��� �κ�----------------------
		
		total = kor1 + kor2 + kor3;
		//�Ҽ��� �츮��(������ ����ȯ)
		avg = (float)(total / 3.0);  //or use "avg = total / 3.0f"
		
		System.out.println("���ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѦ�");
		System.out.println("��         �������          ��");
		System.out.println("���ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѦ�");

		//argument index
		System.out.printf("%2$d %1$d %3$d\n", 1, 2, 3);
		//formating
		System.out.printf("����1 : %3d\n", kor1);
		System.out.printf("����2 : %3d\n", kor2);
		System.out.printf("����3 : %3d\n", kor3);
		System.out.printf("���� : %3d\n", total);
		System.out.printf("��� : %6.2f\n", avg);
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
	}
}

