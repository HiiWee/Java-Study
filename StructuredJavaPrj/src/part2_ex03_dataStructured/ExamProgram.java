package part2_ex03_dataStructured;

import java.util.Scanner;

public class ExamProgram {
	
	public static void main(String[] args) {
		//참조형식의 데이터일경우에 반드시 참조하는 객체가 있어야한다
		//즉 new를 통해 만든 객체를 대입하는것이 필수적이다.
		//포인터와 달리 참조는 내부적으로 주소를 저장하고 있긴하지만
		//개념적으로는 주소공간이 없다라고 이해해야함
		//참조변수는 객체라는것이 존재하면 객체의 이름이 필요하다.
		//그런 이름에 해당되는 식별자가 필요하다.
		//즉 참조변수 = 객체를 식별하는 이름으로 이해하면 편
		Exam exam = new Exam();
		
		//객체 자체가 exam 형식이므로 이름을 굳이 inputExam으로 두번 사용할 필요가 없다.
		//이미 exam 형식으로 있기 때문에 input, print로만 작성한다.
		input(exam);
		print(exam);
	}

	private static void print(Exam exam) {
		System.out.println("┌───────────────────────────┐");
        System.out.println("│           성적  출력      │");
        System.out.println("└───────────────────────────┘");
        System.out.println();
        
        int kor = exam.kor;
        int eng = exam.eng;
        int math = exam.math;

        int total = 0;
        total = kor + eng + math; 
        //연산자 다량사용 및 가독성 떨어짐
        //따라서 임시변수 사용
        float avg = total/3.0f;
        
        System.out.printf("국어 %d\n", kor);
        System.out.printf("영어 %d\n", eng);
        System.out.printf("수학 %d\n", math);
        
        System.out.printf("총점 : %3d\n", total);
        System.out.printf("평균 : %6.2f\n", avg);
        System.out.println("─────────────────────────────");
	}

	private static void input(Exam exam) {
		Scanner scan = new Scanner(System.in);
    	
		System.out.println("┌───────────────────────────┐");
        System.out.println("│           성적  입력      │");
        System.out.println("└───────────────────────────┘");
        System.out.println();
		
        int kor, eng, math;
        
        do {
	        System.out.printf("국어 : ");
	        kor = scan.nextInt();
        
	        if(kor < 0 || 100 < kor)
	        	System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
	        
        }while(kor < 0 || 100 < kor);
        
        do {
        	System.out.printf("영어 : ");
        	eng = scan.nextInt();
        	
        	if(eng < 0 || 100 < eng)
        		System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");
        	
        }while(eng < 0 || 100 < eng);
        
        do {
        	System.out.printf("수학 : ");
        	math = scan.nextInt();
        	
        	if(math < 0 || 100 < math)
        		System.out.println("수학성적은 0~100까지의 범위만 입력이 가능합니다.");
        	
        }while(math < 0 || 100 < math);
        
        exam.kor = kor;
        exam.eng = eng;
        exam.math = math;
	}
}
