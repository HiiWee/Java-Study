package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//DATA INSERT (DML : INSERT)
public class MysqlJdbc2 {

	public static void main(String[] args) {
		// 2. ���� �Է¹ޱ� ���� ���� �غ�
		String title = "TEST2";
		String memberId = "hoseok";
		String content = "hello, world!!!";
		String files = "";
		
		String url = "jdbc:mysql://127.0.0.1:3306/hoseok";
		String sql = "insert into notice(title, memberId, content, files)"
				+ "values(?, ?, ?, ?)";
		// 1. �ڹٴ� ����ڷκ��� ���� �Է¹��� (�ܼ�, �ܺ�, ������, ���� ���)
		// 3. ���Ͱ��� ������ �ȾƳֱ⿡�� �Ǽ��� ���� �߻��� ���
		// 4. Statement���� �����͸� ���ڿ����ϱⰡ �ƴ� �ȾƳ��� �� �ִ� ������ �ش�.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, "hoseok", "!dlghtjr4948");
			// Statement st = con.createStatement();
			// ResultSet rs = st.executeQuery(sql);
			// 5. �����ϱ����� ? �κ��� ���ڿ��� ä���ش�.
			
			PreparedStatement st = con.prepareStatement(sql);
			// ���൵�� ��ü�� �������� ������ �ְ� �������� ������ �� �ִ� �ɷ��� ���Եȴ�.
			// ������ �غ� (index start with 1, not 0)
			st.setString(1, title);
			st.setString(2, memberId);
			st.setString(3, content);
			st.setString(4, files);
			
			// ����ܰ� PreparedStatement�� ����ϸ� ����� sql�� �� �������� �ʴ´�.
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
