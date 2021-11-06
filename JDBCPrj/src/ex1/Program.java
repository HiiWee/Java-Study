package ex1;

// JDBC�� ����ϱ� ���� �������ִ� JDBC���̺귯��
// Connection, Statement, ResultSet
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Program {
// ����
	// 1. ����̹� �ε��ϱ� (�޸𸮻� ����̹��� �÷���)
	// 2. ������ Ȯ���� �� (�����̶�°��� �̷����)
	// 3. ���൵�� ����
	// 4. ����(����) �����ϱ� (����ڷκ��� �䱸���� ���� ����)
	// 5. ������� ����ϱ� (������ ����� �������(���ڵ� ���� ��ü�� �ƴ� ���ڵ� ������ �ϳ��� ����)���ڵ� �ϳ��� ����Ű�� Ŀ��(������)�� �ʿ�)

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// ���� ����
		String url = "jdbc:oracle:thin:@localhost:51521/xepdb1";
		// ����� ������
		String sql = "select * from NOTICE where HIT >= 10 order by ID";
		
		// ����̹� �ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// JDBC�� ������ �ִ� ���̺귯�� ���
		// ������ JDBC�� ����ϴ� ����̹� �ʿ�
		Connection con = DriverManager.getConnection(url, "HOSEOK", "1234");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		
		// �������� ����Ŵ(������) (�����°� ������ false ��ȯ, ������ true��ȯ)
		while (rs.next()) {
			int id = rs.getInt("ID");
			String title = rs.getString("TITLE");
			String writerId = rs.getString("WRITER_ID");
			String content = rs.getString("CONTENT");
			// java.sql �ƴ� java.util�� Date Ŭ���� �߰�
			Date regDate = rs.getDate("REGDATE");
			int hit = rs.getInt("HIT");
			
			System.out.printf("ID : %d, TITLE : %s, WRITER_ID : %s, CONTENT : %s, REGDATE : %s, HIT : %d\n", id, title, writerId, content, regDate, hit);
		}
		
		
		rs.close();
		st.close();
		con.close();
	}

}
