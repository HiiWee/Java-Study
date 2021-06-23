package Ch02;
import java.util.Scanner;

public class Ex02_04 {
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
