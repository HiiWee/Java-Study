package ex16.finalvar;

//import Class "Scanner"
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		final int SIZE = 3;
		int[] kors = new int[SIZE];
		int total=0;
		int menu; // 1:INPUT, 2:PRINT, 3:EXIT
		float avg;
		
		final int MENU_INPUT = 1;
		final int MENU_PRINT = 2;
		final int MENU_EXIT = 3;
		
		

		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			kors[i] = 0;
		}
		
		//break�� 1���� ������ �ƴ϶� while������ ����� break�� ���		
		exit:
		while(true) {
			
			//----------------------���� �޴� �κ�---------------------------
			System.out.println("���ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѦ�");
			System.out.println("��         ���θ޴�       ��");
			System.out.println("���ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѦ�");
			System.out.println("\t1.�����Է�");
			System.out.println("\t2.�������");
			System.out.println("\t3.����");
			System.out.print("\t>");
			menu = scan.nextInt();
			
			switch(menu) {
			
			case MENU_INPUT: 
					//----------------------���� �Է� �κ�---------------------------
					
					
					  System.out.println("���ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѦ�");
					  System.out.println("��         �����Է�       ��");
					  System.out.println("���ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѦ�");
					 
						
					for(int i=0; i<SIZE; i++)
						do {
							System.out.printf("����%d:", i+1);
							kors[i] = scan.nextInt();
							
							if(kors[i]<0 || kors[i]>100) {
								System.out.println("��������(0~10)�� ������ϴ�.");
							}
						} while(kors[i]<0 || kors[i]>100);
					
					break;
				
				
				//----------------------���� ��� �κ�----------------------
			case MENU_PRINT:
					for(int i=0; i<SIZE; i++)
						total += kors[i];
					
					//�Ҽ��� �츮��(������ ����ȯ)
					avg = (float)(total / 3.0);  //or use "avg = total / 3.0f"
					
					System.out.println("���ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѦ�");
					System.out.println("��         �������       ��");
					System.out.println("���ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѦ�");
			
					for(int i=0; i<SIZE; i++) {
						System.out.printf("����%d : %3d\n", 3-i, kors[i]);
														//for���� ������ ����Ʈ���� �ʴ� ��������.
														//�ַ� for���� 0���� �ݺ��� ���۵�
					}
					System.out.printf("���� : %3d\n", total);
					System.out.printf("��� : %6.2f\n", avg);
					System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
					break;

			case MENU_EXIT: 
					break exit;
					//while ���� switch ������ ��� �� while�� ���������
			default:	
					System.out.println("�Է¿��� 1~3������ �Է��� �� �ֽ��ϴ�.");
			}
		}
		System.out.println("����Ǿ����ϴ�.");
		scan.close();
	}
}
