package web.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import web.util.MemberVO;
import web.util.MyException;

public class MemberDAO {
	DataSource dataFactory;
	Connection conn;
	PreparedStatement pstmt;

	public MemberDAO() throws MyException {
		try {
			Context ic=new InitialContext();
			Context ic2=(Context) ic.lookup("java:comp/env");
			dataFactory=(DataSource) ic2.lookup("jdbc/oracle");
			System.out.println("드라이버 접속 성공");
		} catch (NamingException e) {
			System.out.println("드라이버 접속 실패");
			throw new MyException("connection pool 찾기 오류");
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
//				System.out.println("받은 rs.getString1 값 : " + rs.getString(1));
//				System.out.println("받은 rs.getString2 값 : " + rs.getString(2));
//				System.out.println("받은 rs.getString3 값 : " + rs.getString(3));
//				System.out.println("받은 rs.getString4 값 : " + rs.getString(4));
//				System.out.println("받은 rs.getString5 값 : " + rs.getString(5));
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

	public String login(String id, String pw) throws MyException {

		ResultSet rs = null;		
		
		try {
			conn=dataFactory.getConnection();
			String sql = "select name from member where id=? and pw=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs=pstmt.executeQuery();
			System.out.println("DAO - 받고나서 입력하는 아이디와 비번 : " + id + " " + pw);
			if(rs.next()) {
				System.out.println("받은 rs.getString1 값 : " + rs.getString(1));
				return rs.getString(1);
			} else {
			System.out.println("result set에 값이 없습니다. null을 리턴합니다.");
			return null;
			}
		}catch(SQLException e) {
			e.printStackTrace();
			throw new MyException("로그인 처리 실패");
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				System.out.println("에러 : " + e.getMessage());
			}
		}		
	}
}
	

