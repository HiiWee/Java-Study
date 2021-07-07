package codeUp;

import java.util.Scanner;

class Absolute {
	private long n;
	
	public Absolute(long n) {
		this.n = n;
		
		setAbsolute();
	}
	
	private void setAbsolute() {
		if (n < 0)
			n = -n;
	}
	
	public long getNum() {
		return n;
	}
	
}

public class CodeUp1549 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();

		Absolute ob = new Absolute(n);
		System.out.println(ob.getNum());

	}
}
