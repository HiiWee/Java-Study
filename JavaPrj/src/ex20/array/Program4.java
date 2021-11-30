package ex20.array;
import java.util.Random;
public class Program4 {
	public static void main(String[] args){
		
		int[] lotto = new int[6];
		Random rand = new Random();
		//0부터 지정한 값 보다 작은범위에서 임의의 수가 리턴
		for(int i=0; i<6; i++) {
			lotto[i] = rand.nextInt(45)+i;
			System.out.printf("%d ", lotto[i]);
		}
	}
}
