package ch05;

public class Ex05_14 {

	public static void main(String[] args) {
		boolean t = true;
		
		First: {
			Second: {
				Third: {
					System.out.println("Third ��� 'break' ���� ��");
					if(t) break Second;
					System.out.println("Third ��� 'break' ���� ��");
				}
				System.out.println("Second ��� ����");
			}
			System.out.println("Second ��� ����");
		}
		System.out.println("main ��� ����");
	}

}
