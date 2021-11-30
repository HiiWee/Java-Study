package kongju.ac.kr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteCustomer {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/2021_3_2_dbp";
		String uid = "root";
		String pwd = "!dlghtjr4948";
		String driver = "com.mysql.cj.jdbc.Driver";

		Connection con = null;
		Statement st = null;

		String sql = "delete from Customer "
					+ "where customer_id = 'C-1005'";

		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(url, uid, pwd);
			st = con.createStatement();
			int result = st.executeUpdate(sql);

			if (result > 0) {
				System.out.printf("%d행이 삭제 되었습니다.", result);
			} else {
				System.out.printf("아무행도 삭제 되지 않았습니다.  : result = %d", result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null)
					st.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
