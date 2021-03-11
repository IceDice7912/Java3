package web.dao;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import web.vo.MemberVO;

public class MemberDAO {
	
	SqlSessionFactory sqlMapper;
	

	public MemberDAO() {
		try {
			Reader reader=Resources.getResourceAsReader("mybatis/SqlMapConfig.xml");
			sqlMapper=new SqlSessionFactoryBuilder().build(reader);
		}catch(Exception e) {
			e.printStackTrace();			
		}
	}

	public List<MemberVO> selectAllMemberList() {
		SqlSession session=sqlMapper.openSession();
		List<MemberVO> list=session.selectList("mapper.member.selectAllMemberList");
		return list;
	}
	
	public String login(MemberVO m) {
		SqlSession session=sqlMapper.openSession();
		String name=(String) session.selectOne("mapper.member.login", m);
		return name;
	}
	
	public MemberVO selectMemberById(String id) {
		System.out.println("맴버 정렬 - 아이디");
		SqlSession session=sqlMapper.openSession();
		MemberVO m=(MemberVO) session.selectOne(
				"mapper.member.selectMemberById", id);
		return m;
	}
	
	public MemberVO selectMemberByPw(String pw) {
		System.out.println("맴버 정렬 - 비밀번호");
		SqlSession session=sqlMapper.openSession();
		MemberVO m=(MemberVO) session.selectOne(
				"mapper.member.selectMemberByPw", pw);
		return m;
	}

	public void memberInsert(MemberVO m) {
		System.out.println("맴버 등록 : " + m);
		SqlSession session=sqlMapper.openSession();
	
			int i=session.insert("mapper.member.memberInsert", m);
			session.commit();
	
	}
	
	public void updateMember(MemberVO m) {
		System.out.println("맴버 업데이트 : " + m);
		SqlSession session=sqlMapper.openSession();
	
			session.update("mapper.member.updateMember", m);
			session.commit();
	
	}
	
	public void deleteMember(String id) {
		System.out.println("맴버 죽임 : " + id);
		SqlSession session=sqlMapper.openSession();
	
			session.delete("mapper.member.deleteMember", id);
			session.commit();
	
	}

}
































