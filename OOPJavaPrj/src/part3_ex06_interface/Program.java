package part3_ex06_interface;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {
//예외처리들은 던짐(throw)
	public static void main(String[] args)
			throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("src/part3_ex06_interface/setting.txt");
		Scanner scan = new Scanner(fis);
		String className = scan.nextLine();
		scan.close();
		fis.close();
		// String을 읽어서 clazz에 클래스에 대한 정보를 얻음
		Class clazz = Class.forName(className);
		A a = new A();
		X x = (X) clazz.newInstance();
		// X x = clazz.getDeclaredConstructor().newInstance(); << 1.8버젼 아닐경우

		a.setX(x);

		a.print();
	}

}