package ch05;

public class Ex05_15 {

	public static void main(String[] args) {
		
		int i = 2;
		Loop: while (true) {
			
			int j = 1;
			if(i < 10)
				System.out.println(i + "단");
			innerLoop: while (true) {
				
				if (i > 9) break Loop;
				if (j > 9) break;
				
				System.out.println(i + "*" + j + "=" + i*j);
				j++;
			}
			i++;
		}
	}

}
