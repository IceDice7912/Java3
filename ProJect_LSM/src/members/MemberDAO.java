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
//				System.out.println(id+" "+pw+" "+name+" "+sex+" "+age);
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return membersList;
	}

	public void addMember(MemberVO m) {
		try {
			conn = dataFactory.getConnection();
			String id = m.getId();
			String pw = m.getPw();
			String name = m.getName();
			String sex = m.getSex();
			int age = m.getAge();
			String query = "insert into member(id, pw, name, sex, age)" + "values(?, ?, ?, ?, ?)";
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);	
			pstmt.setString(4, sex);
			pstmt.setInt(5, age);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("맴버 등록 실패 : " + e);
		}
	}
	
	public String login(String id, String pw) 	{
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		DataSource dbcp = null;
		
		try {
			con=dbcp.getConnection();
			stmt=con.prepareStatement("select name from member where id=? and pw=? ");
			stmt.setString(1, id);
			stmt.setString(2, pw);
			rs=stmt.executeQuery();
			if(rs.next()) {
				return rs.getString(1);
			}
			return null;		
		}catch(SQLException e) {
			System.out.println("로그인 실패 : " + e);
		}finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				System.out.println("에러 : " + e.getMessage());
			}
		}
		return id;	
	}

}
