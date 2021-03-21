package ex15.marray.copy;

//import Class "Scanner"
import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {

		/*
		 * int kor1, kor2, kor3;
		 */	
		//1차원 배열 
		//int[] kors = new int[3*3];
		int[][] kors = new int[3][3];
		int total;
		int menu;
		float avg;

		Scanner scan = new Scanner(System.in);
		/*
		 * kor1 = 0; kor2 = 0; kor3 = 0;
		 */
		for(int j=0; j<3; j++)
			for(int i=0; i<3; i++)
				kors[j][i] = 0;
				//단위 이동 -> 3*j, +i 는 칸이동
		
		//break로 1개의 루프가 아니라 while루프를 벗어나는 break라벨 방법		
		exit:
		while(true) {
			
			//----------------------메인 메뉴 부분---------------------------
			System.out.println("┌ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ┐");
			System.out.println("│         메인메뉴       │");
			System.out.println("└ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ┘");
			System.out.println("\t1.성적입력");
			System.out.println("\t2.성적출력");
			System.out.println("\t3.종료");
			System.out.print("\t>");
			menu = scan.nextInt();
			
			switch(menu) {
			
			case 1: 
					//----------------------성적 입력 부분---------------------------
					
					
					  System.out.println("┌ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ┐");
					  System.out.println("│         성적입력       │");
					  System.out.println("└ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ┘");
					 
					
						/*
						 * //국어1 성적 입력부분 do { System.out.print("국어1:"); kor1 = scan.nextInt(); if(kor1<0
						 * || kor1>100) { System.out.println("성적범위(0~100)를 벗어났습니다."); } } while(kor1<0
						 * || kor1>100);
						 * 
						 * //국어2 성적 입력부분 do { System.out.print("국어2:"); kor2 = scan.nextInt(); if(kor2<0
						 * || kor2>100) { System.out.println("성적범위(0~100)를 벗어났습니다."); } } while(kor2<0
						 * || kor2>100);
						 * 
						 * //국어3 성적 입력부분 do { System.out.print("국어3:"); kor3 = scan.nextInt();
						 * 
						 * if(kor3<0 || kor3>100) { System.out.println("성적범위(0~10)을 벗어났습니다."); } }
						 * while(kor3<0 || kor3>100);
						 */
					for(int j=0; j<3; j++)
						for(int i=0; i<3; i++)
							do {
								System.out.printf("%d학년 국어%d:",j+1, i+1);
								kors[j][i] = scan.nextInt();
								
								if(kors[j][i]<0 || kors[j][i]>100) {
									System.out.println("성적범위(0~10)을 벗어났습니다.");
								}
							} while(kors[j][i]<0 || kors[j][i]>100);
						
				
				// 유효검사 (0~100 사이값만)
				//int validate = (0<=kor1 && 100>=kor1)?1:0;
				//System.out.println(validate);
					break;
				
				
				//----------------------성적 출력 부분----------------------
			case 2:
					System.out.println("┌ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ┐");
					System.out.println("│         성적출력       │");
					System.out.println("└ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ┘");
			
					//argument index
					//System.out.printf("%2$d %1$d %3$d\n", 1, 2, 3);
					//formating
					for(int j=0; j<3; j++) {
						total = kors[j][0] + kors[j][1] + kors[j][2];
						avg = (float)(total / 3.0);  //or use "avg = total / 3.0f"
						System.out.printf("<%d학년 국어성적>----------\n", j+1);
						for(int i=0; i<3; i++) {
							System.out.printf("\t국어%d : %3d\n", 3-i, kors[j][i]);
															//for문의 패턴을 망가트리지 않는 방향으로.
															//주로 for문은 0부터 반복이 시작됨
						}
						//소수점 살리기(묵시적 형변환)
						System.out.printf("총점 : %3d\n", total);
						System.out.printf("평균 : %6.2f\n", avg);
						System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					}
					break;

			case 3: 
					break exit;
					//while 내의 switch 구문만 벗어남 즉 while은 벗어나지못함
			default:	
					System.out.println("입력오류 1~3까지만 입력할 수 있습니다.");
			}
		}
		System.out.println("종료되었습니다.");
	}
}
