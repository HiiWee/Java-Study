package ex1;

// JDBC를 사용하기 위해 제공해주는 JDBC라이브러리
// Connection, Statement, ResultSet
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Program {
// 순서
	// 1. 드라이버 로드하기 (메모리상에 드라이버가 올려짐)
	// 2. 연결이 확립이 됨 (연결이라는것이 이루어짐)
	// 3. 실행도구 생성
	// 4. 문장(쿼리) 실행하기 (사용자로부터 요구받은 쿼리 실행)
	// 5. 결과집합 사용하기 (쿼리가 실행된 결과집합(레코드 집합 전체가 아닌 레코드 단위로 하나씩 받음)레코드 하나를 가리키는 커서(포인터)가 필요)

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 서버 접속
		String url = "jdbc:oracle:thin:@localhost:51521/xepdb1";
		// 사용자 쿼리문
		String sql = "select * from NOTICE where HIT >= 10 order by ID";
		
		// 드라이버 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// JDBC가 가지고 있는 라이브러리 사용
		// 하지만 JDBC가 사용하는 드라이버 필요
		Connection con = DriverManager.getConnection(url, "HOSEOK", "1234");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		
		// 다음줄을 가리킴(가져옴) (가져온게 없으면 false 반환, 있으면 true반환)
		while (rs.next()) {
			int id = rs.getInt("ID");
			String title = rs.getString("TITLE");
			String writerId = rs.getString("WRITER_ID");
			String content = rs.getString("CONTENT");
			// java.sql 아닌 java.util의 Date 클래스 추가
			Date regDate = rs.getDate("REGDATE");
			int hit = rs.getInt("HIT");
			
			System.out.printf("ID : %d, TITLE : %s, WRITER_ID : %s, CONTENT : %s, REGDATE : %s, HIT : %d\n", id, title, writerId, content, regDate, hit);
		}
		
		
		rs.close();
		st.close();
		con.close();
	}

}
