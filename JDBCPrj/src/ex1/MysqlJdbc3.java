package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//DATA UPDATE (DML : UPDATE)
public class MysqlJdbc3 {

	public static void main(String[] args) {
		// 2. 값을 입력받기 위한 변수 준비
		String title = "TEST4";
		String content = "hello, world!!!!!!!!!!!!!!!!!!!!!!";
		String files = "";
		int id = 18;
		
		String url = "jdbc:mysql://127.0.0.1:3306/hoseok";
		String sql = "update notice set title = ?, content = ?, files=?"
				+ "where id = ?";
		// 1. 자바는 사용자로부터 값을 입력받음 (콘솔, 외부, 윈도우, 파일 등등)
		// 3. 위와같이 문장을 꽂아넣기에는 실수가 많이 발생할 우려
		// 4. Statement에서 데이터를 문자열더하기가 아닌 꽂아넣을 수 있는 도구를 준다.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, "hoseok", "!dlghtjr4948");
			// Statement st = con.createStatement();
			// ResultSet rs = st.executeQuery(sql);
			// 5. 실행하기전에 ? 부분의 문자열을 채워준다.
			
			PreparedStatement st = con.prepareStatement(sql);
			// 실행도구 자체가 쿼리문을 가지고 있고 쿼리문을 세팅할 수 있는 능력이 포함된다.
			// 쿼리문 준비 (index start with 1, not 0)
			st.setString(1, title);
			st.setString(2, content);
			st.setString(3, files);
			st.setInt(4, id);
			
			// 실행단계 PreparedStatement를 사용하면 실행시 sql을 또 전달하지 않는다.
			int result = st.executeUpdate();
			System.out.println(result);
			
			st.close();
			con.close();
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
