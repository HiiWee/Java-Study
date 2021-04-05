package part2_ex03_dataStructured;

import java.util.Scanner;

public class ExamProgram {
	
	public static void main(String[] args) {
		//���������� �������ϰ�쿡 �ݵ�� �����ϴ� ��ü�� �־���Ѵ�
		//�� new�� ���� ���� ��ü�� �����ϴ°��� �ʼ����̴�.
		//�����Ϳ� �޸� ������ ���������� �ּҸ� �����ϰ� �ֱ�������
		//���������δ� �ּҰ����� ���ٶ�� �����ؾ���
		//���������� ��ü��°��� �����ϸ� ��ü�� �̸��� �ʿ��ϴ�.
		//�׷� �̸��� �ش�Ǵ� �ĺ��ڰ� �ʿ��ϴ�.
		//�� �������� = ��ü�� �ĺ��ϴ� �̸����� �����ϸ� ��
		Exam exam = new Exam();
		
		//��ü ��ü�� exam �����̹Ƿ� �̸��� ���� inputExam���� �ι� ����� �ʿ䰡 ����.
		//�̹� exam �������� �ֱ� ������ input, print�θ� �ۼ��Ѵ�.
		input(exam);
		print(exam);
	}

	private static void print(Exam exam) {
		System.out.println("����������������������������������������������������������");
        System.out.println("��           ����  ���      ��");
        System.out.println("����������������������������������������������������������");
        System.out.println();
        
        int kor = exam.kor;
        int eng = exam.eng;
        int math = exam.math;

        int total = 0;
        total = kor + eng + math; 
        //������ �ٷ���� �� ������ ������
        //���� �ӽú��� ���
        float avg = total/3.0f;
        
        System.out.printf("���� %d\n", kor);
        System.out.printf("���� %d\n", eng);
        System.out.printf("���� %d\n", math);
        
        System.out.printf("���� : %3d\n", total);
        System.out.printf("��� : %6.2f\n", avg);
        System.out.println("����������������������������������������������������������");
	}

	private static void input(Exam exam) {
		Scanner scan = new Scanner(System.in);
    	
		System.out.println("����������������������������������������������������������");
        System.out.println("��           ����  �Է�      ��");
        System.out.println("����������������������������������������������������������");
        System.out.println();
		
        int kor, eng, math;
        
        do {
	        System.out.printf("���� : ");
	        kor = scan.nextInt();
        
	        if(kor < 0 || 100 < kor)
	        	System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");
	        
        }while(kor < 0 || 100 < kor);
        
        do {
        	System.out.printf("���� : ");
        	eng = scan.nextInt();
        	
        	if(eng < 0 || 100 < eng)
        		System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");
        	
        }while(eng < 0 || 100 < eng);
        
        do {
        	System.out.printf("���� : ");
        	math = scan.nextInt();
        	
        	if(math < 0 || 100 < math)
        		System.out.println("���м����� 0~100������ ������ �Է��� �����մϴ�.");
        	
        }while(math < 0 || 100 < math);
        
        exam.kor = kor;
        exam.eng = eng;
        exam.math = math;
	}
}
