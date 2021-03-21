package ex11.control2.elseif;

//import Class "Scanner"
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		int kor1, kor2, kor3;
		int total;
		int menu;
		float avg;

		Scanner scan = new Scanner(System.in);
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		
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
			
			//----------------------성적 입력 부분---------------------------
			
			if(menu == 1) {
				System.out.println("┌ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ┐");
				System.out.println("│         성적입력       │");
				System.out.println("└ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ┘");
				
				//국어1 성적 입력부분
				do {
					System.out.print("국어1:");
					kor1 = scan.nextInt();
					if(kor1<0 || kor1>100) {
						System.out.println("성적범위(0~100)를 벗어났습니다.");
					}
				} while(kor1<0 || kor1>100);
				
				//국어2 성적 입력부분
				do {
					System.out.print("국어2:");
					kor2 = scan.nextInt();
					if(kor2<0 || kor2>100) {
						System.out.println("성적범위(0~100)를 벗어났습니다.");
					}
				} while(kor2<0 || kor2>100);
				
				//국어3 성적 입력부분
				do {
					System.out.print("국어3:");
					kor3 = scan.nextInt();
					
					if(kor3<0 || kor3>100) {
						System.out.println("성적범위(0~10)을 벗어났습니다.");
					}
				} while(kor3<0 || kor3>100);
			}
			// 유효검사 (0~100 사이값만)
			//int validate = (0<=kor1 && 100>=kor1)?1:0;
			//System.out.println(validate);
			
			
			
			//----------------------성적 출력 부분----------------------
			else if(menu == 2) {
				total = kor1 + kor2 + kor3;
				//소수점 살리기(묵시적 형변환)
				avg = (float)(total / 3.0);  //or use "avg = total / 3.0f"
				
				System.out.println("┌ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ┐");
				System.out.println("│         성적출력       │");
				System.out.println("└ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ┘");
		
				//argument index
				//System.out.printf("%2$d %1$d %3$d\n", 1, 2, 3);
				//formating
				for(int i=0; i<3; i++) {
					System.out.printf("국어%d : %3d\n", 3-i, kor1);
													//for문의 패턴을 망가트리지 않는 방향으로.
													//주로 for문은 0부터 반복이 시작됨
				}
				
				System.out.printf("국어2 : %3d\n", kor2);
				System.out.printf("국어3 : %3d\n", kor3);
				System.out.printf("총점 : %3d\n", total);
				System.out.printf("평균 : %6.2f\n", avg);
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			}
			else if(menu == 3) {
				break;
			}
			else
				System.out.println("입력오류 1~3까지만 입력할 수 있습니다.");
		}
		System.out.println("종료되었습니다.");
	}
}
