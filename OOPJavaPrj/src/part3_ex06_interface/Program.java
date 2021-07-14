package part3_ex06_interface;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {
//����ó������ ����(throw)
	public static void main(String[] args)
			throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("src/part3_ex06_interface/setting.txt");
		Scanner scan = new Scanner(fis);
		String className = scan.nextLine();
		scan.close();
		fis.close();
		// String�� �о clazz�� Ŭ������ ���� ������ ����
		Class clazz = Class.forName(className);
		A a = new A();
		X x = (X) clazz.newInstance();
		// X x = clazz.getDeclaredConstructor().newInstance(); << 1.8���� �ƴҰ��

		a.setX(x);

		a.print();
	}

}