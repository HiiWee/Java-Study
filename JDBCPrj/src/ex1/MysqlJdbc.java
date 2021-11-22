package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
// DATA SELECT (DML : SELECT)
public class MysqlJdbc {

	public static void main(String[] args) {

		String url = "jdbc:mysql://127.0.0.1:3306/hoseok";
		String sql = "select * from notice where hit >= 10";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, "hoseok", "!dlghtjr4948");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while(rs.next()) {
				// �޾ƿ� Ʃ�õ��� �÷������� ���Ϲ޾� �� ������ ����
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String content = rs.getString("content");
				Date regdate = rs.getDate("regdate");
				int hit = rs.getInt("hit");
				String memberId = rs.getString("memberId");
				// �� ���ڵ���� ������ ������� �ڹٿ��� ó���ϱ� ���� sql���� ó��
				System.out.printf("id : %d\t title : %s\t content : %s\t regdate : %s\t hit : %d\t memberId : %s\n", id, title, content, regdate, hit, memberId);
		
			}
			rs.close();
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
