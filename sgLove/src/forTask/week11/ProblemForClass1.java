package forTask.week11;

class Date {
	private int year;
	private String month;
	private int day;

	public Date() {
		System.out.println("객체생성");
	}

	public Date(int y) {
		year = y;
	}

	public Date(int y, String m, int d) {
		year = y;
		month = m;
		day = d;
	}

	public void printDate() {
		System.out.println(year + "년" + " " + month + " " + day + "일");
	}
}

public class ProblemForClass1 {

	public static void main(String[] args) {
		Date date1 = new Date();
		Date date2 = new Date(2021);
		Date date3 = new Date(2021, "7월", 2);
		
		date1.printDate();
		date2.printDate();
		date3.printDate();

	}

}
