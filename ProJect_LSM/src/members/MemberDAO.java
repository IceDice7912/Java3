package members;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	private DataSource dataFactory;
	private Connection conn;
	private PreparedStatement pstmt;

	public MemberDAO() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
			System.out.println("오라클 드라이버 접속 성공");
		} catch (Exception e) {
			System.out.println("오라클 드라이버 접속 실패 : " + e);
		}
	}

	public List<MemberVO> listMembers() {
		List<MemberVO> membersList = new ArrayList<MemberVO>();
		try {
			conn = dataFactory.getConnection();
			String query = "select * from member";
			System.out.println(query);
			pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String sex = rs.getString("sex");
				int age = rs.getInt("age");
				MemberVO memberVO = new MemberVO(id, pw, name, sex, age);
				membersList.add(memberVO);
				System.out.println(id+" "+pw+" "+name+" "+sex+" "+age);
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return membersList;
	}

}
