package com.hoseok.app.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.hoseok.app.entity.Notice;

// CRUD를 담당하는 서비스 클래스
public class NoticeService {
	// 공통적으로 사용하는 변수들은 따로 선언하여 사용
	// sql 객체들은 매번 실행때마다 따로 가지고 있어야한다.
	private String url = "jdbc:mysql://127.0.0.1:3306/hoseok";
	private String uid = "hoseok";
	private String pwd = "!dlghtjr4948";
	private String driver = "com.mysql.cj.jdbc.Driver";	//SET MYSQL DRIVER
	
	// 기본적으로 예외는 UI에서 처리하기 때문에 서비스에선 던진다.
	public List<Notice> getList() throws ClassNotFoundException, SQLException {

		String sql = "select * from notice";

		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, uid, pwd);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);

		// 반환하기 위한 준비
		List<Notice> list = new ArrayList<Notice>();
		while (rs.next()) {
			int id = rs.getInt("id");
			String title = rs.getString("title");
			String memberId = rs.getString("memberId");
			String content = rs.getString("content");
			Date regdate = rs.getDate("regdate");
			int hit = rs.getInt("hit");
			String files = rs.getString("files");

			Notice notice = new Notice(id, title, memberId, content, regdate, hit, files);
			// 리스트 추가
			list.add(notice);
			

		}
		rs.close();
		st.close();
		con.close();

		return list;
	}

	public int insert(Notice notice) throws ClassNotFoundException, SQLException {
		String title = notice.getTitle();
		String memberId = notice.getMemberId();
		String content = notice.getContent();
		String files = notice.getFiles();

		String sql = "insert into notice(title, memberId, content, files)" + "values(?, ?, ?, ?)";
		// 1. 자바는 사용자로부터 값을 입력받음 (콘솔, 외부, 윈도우, 파일 등등)
		// 3. 위와같이 문장을 꽂아넣기에는 실수가 많이 발생할 우려
		// 4. Statement에서 데이터를 문자열더하기가 아닌 꽂아넣을 수 있는 도구를 준다.
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, uid, pwd);
		// Statement st = con.createStatement();
		// ResultSet rs = st.executeQuery(sql);
		// 5. 실행하기전에 ? 부분의 문자열을 채워준다.

		PreparedStatement st = con.prepareStatement(sql);
		// 실행도구 자체가 쿼리문을 가지고 있고 쿼리문을 세팅할 수 있는 능력이 포함된다.
		// 쿼리문 준비 (index start with 1, not 0)
		st.setString(1, title);
		st.setString(2, memberId);
		st.setString(3, content);
		st.setString(4, files);

		// 실행단계 PreparedStatement를 사용하면 실행시 sql을 또 전달하지 않는다.
		int result = st.executeUpdate();

		st.close();
		con.close();
		return result;
	}

	public int update(Notice notice) throws ClassNotFoundException, SQLException {
		// 2. 값을 입력받기 위한 변수 준비
		String title = notice.getTitle();
		String content = notice.getContent();
		String files = notice.getFiles();
		int id = notice.getId();

		String sql = "update notice set title = ?, content = ?, files=?" + "where id = ?";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, uid, pwd);
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, title);
		st.setString(2, content);
		st.setString(3, files);
		st.setInt(4, id);

		int result = st.executeUpdate();

		st.close();
		con.close();

		return result;
	}

	public int delete(int id) throws ClassNotFoundException, SQLException {

		String sql = "delete from notice where id = ?";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, uid, pwd);
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, id);

		int result = st.executeUpdate();

		st.close();
		con.close();

		return result;
	}
}
