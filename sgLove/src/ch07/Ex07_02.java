package ch07;

public class Ex07_02 {
	public static void main(String[] args) {
		Ex07_01 obj = new Ex07_01();
		
		String ssum, sminus;
		
		ssum = obj.add(50, 30);
		sminus = obj.sub(50, 30);
		System.out.println(ssum);
		System.out.println(sminus);
	}
}
