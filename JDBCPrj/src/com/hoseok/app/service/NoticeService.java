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

// CRUD�� ����ϴ� ���� Ŭ����
public class NoticeService {
	// ���������� ����ϴ� �������� ���� �����Ͽ� ���
	// sql ��ü���� �Ź� ���ට���� ���� ������ �־���Ѵ�.
	private String url = "jdbc:mysql://127.0.0.1:3306/hoseok";
	private String uid = "hoseok";
	private String pwd = "!dlghtjr4948";
	private String driver = "com.mysql.cj.jdbc.Driver";	//SET MYSQL DRIVER
	
	// �⺻������ ���ܴ� UI���� ó���ϱ� ������ ���񽺿��� ������.
	public List<Notice> getList() throws ClassNotFoundException, SQLException {

		String sql = "select * from notice";

		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, uid, pwd);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);

		// ��ȯ�ϱ� ���� �غ�
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
			// ����Ʈ �߰�
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
		// 1. �ڹٴ� ����ڷκ��� ���� �Է¹��� (�ܼ�, �ܺ�, ������, ���� ���)
		// 3. ���Ͱ��� ������ �ȾƳֱ⿡�� �Ǽ��� ���� �߻��� ���
		// 4. Statement���� �����͸� ���ڿ����ϱⰡ �ƴ� �ȾƳ��� �� �ִ� ������ �ش�.
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, uid, pwd);
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

		st.close();
		con.close();
		return result;
	}

	public int update(Notice notice) throws ClassNotFoundException, SQLException {
		// 2. ���� �Է¹ޱ� ���� ���� �غ�
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