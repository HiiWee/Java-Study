package Ch02;
import java.util.Scanner;
/**
*이 클래스는 값을 3개 입력받아 순서대로 문자열, 정수, 실수로 출력함
* @author 이호석
* @see Ex02_04.java
*/
public class Ex02_05 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름, 나이, 몸무게를 공간(Space)로 구분하여 입력 : ");
		
		String name = scan.next();
		int age = scan.nextInt();
		double weight = scan.nextDouble();
		
		System.out.println(name + " 씨의 나이는 " + age + "세이고");
		System.out.println("몸무게는 " + weight + "Kg 입니다.");
	}
	
}
