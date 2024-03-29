﻿package part2_ex01_SplitGradeInput;

import java.util.Scanner;

public class StructuredGradeInput01 {
	
	public static void main(String[] args) {
		
    	int[] korList = new int[3];
        int menu;
        boolean keepLoop = true;			
		//스캐너는 굳이 전역변수로 공유할필요없다.
		Scanner scan = new Scanner(System.in);
				
		while(keepLoop)
		{
			menu = inputMenu();
	        
	        switch(menu) {	        
	        case 1:
	        	inputKors(korList);
		        break;
	        case 2:
	        	printKors(korList);
		        break;
	        case 3:
	        	System.out.println("Bye~~");
	        	
	        	keepLoop = false;
				break;
	        
	        default:
	        	System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지입니다.");
	       
	        }
	        
		}
    }
    
    static int inputMenu() {
    	
    	int menu;
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("┌───────────────────────────┐");
        System.out.println("│           메인 메뉴       │");
        System.out.println("└───────────────────────────┘");
        System.out.println("\t1. 성적입력 ");
        System.out.println("\t2. 성적출력 ");
        System.out.println("\t3. 종료 ");
        System.out.println("\t선택> ");
        menu = scan.nextInt();
        
        return menu;
    }
    
    static void printKors(int[] kors) {
    	
    	int total = 0;
        float avg;
        
        for(int i=0; i<3; i++)
	        total += kors[i];
	        
        avg = total / 3.0f;
	        
        System.out.println("┌───────────────────────────┐");
        System.out.println("│           성적  출력      │");
        System.out.println("└───────────────────────────┘");
        System.out.println();		        
	       
        for(int i=0;i<3;i++)
        	System.out.printf("국어 %d : %3d\n", 3-i, kors[i]);	        	
	        	        
        System.out.printf("총점 : %3d\n", total);
        System.out.printf("평균 : %6.2f\n", avg);
        System.out.println("─────────────────────────────");
    }
    
    static void inputKors(int[] kors) {
    	
    	int kor;
    	Scanner scan = new Scanner(System.in);
    	
		System.out.println("┌───────────────────────────┐");
        System.out.println("│           성적  입력      │");
        System.out.println("└───────────────────────────┘");
        System.out.println();
       		        
        for(int i=0; i<3; i++) {
	        do {
		        System.out.printf("국어%d : ", i+1);
		        kor = scan.nextInt();
	        
		        if(kor < 0 || 100 < kor)
		        	System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
		        
	        }while(kor < 0 || 100 < kor);
	        kors[i] = kor;
        }
        System.out.println("─────────────────────────────");

	}
}
