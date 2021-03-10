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
				Reader reader = Resources.getResourceAsReader("mybatis/SqlMapConfig.xml");
				sqlMapper = new SqlSessionFactoryBuilder().build(reader);
				reader.close();
			} catch (Exception e) {
				System.out.println("에러 발생 : " + e);
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
}
