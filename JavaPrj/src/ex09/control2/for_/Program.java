package ex09.control2.for_;

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
		
		while(true) {
			//----------------------���� �Է� �κ�---------------------------
			System.out.println("���ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѦ�");
			System.out.println("��         �����Է�       ��");
			System.out.println("���ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѦ�");
			
			//����1 ���� �Էºκ�
			do {
				System.out.print("����1:");
				kor1 = scan.nextInt();
				if(kor1<0 || kor1>100) {
					System.out.println("��������(0~100)�� ������ϴ�.");
				}
			} while(kor1<0 || kor1>100);
			
			//����2 ���� �Էºκ�
			do {
				System.out.print("����2:");
				kor2 = scan.nextInt();
				if(kor2<0 || kor2>100) {
					System.out.println("��������(0~100)�� ������ϴ�.");
				}
			} while(kor2<0 || kor2>100);
			
			//����3 ���� �Էºκ�
			do {
				System.out.print("����3:");
				kor3 = scan.nextInt();
				
				if(kor3<0 || kor3>100) {
					System.out.println("��������(0~10)�� ������ϴ�.");
				}
			} while(kor3<0 || kor3>100);
			
			// ��ȿ�˻� (0~100 ���̰���)
			//int validate = (0<=kor1 && 100>=kor1)?1:0;
			//System.out.println(validate);
			
			
			
			//----------------------���� ��� �κ�----------------------
			
			total = kor1 + kor2 + kor3;
			//�Ҽ��� �츮��(������ ����ȯ)
			avg = (float)(total / 3.0);  //or use "avg = total / 3.0f"
			
			System.out.println("���ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѦ�");
			System.out.println("��         �������       ��");
			System.out.println("���ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѦ�");
	
			//argument index
			//System.out.printf("%2$d %1$d %3$d\n", 1, 2, 3);
			//formating
			for(int i=0; i<3; i++) {
				System.out.printf("����%d : %3d\n", 3-i, kor1);
												//for���� ������ ����Ʈ���� �ʴ� ��������.
												//�ַ� for���� 0���� �ݺ��� ���۵�
			}
			
			System.out.printf("����2 : %3d\n", kor2);
			System.out.printf("����3 : %3d\n", kor3);
			System.out.printf("���� : %3d\n", total);
			System.out.printf("��� : %6.2f\n", avg);
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		}
	}
}
