package web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import web.vo.MemberVO;

public class MemberDAOImpl implements MemberDAO {

	SqlSession sqlSession;
	

	
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}




	@Override
	public List<MemberVO> listMembers() {
		return sqlSession.selectList("mapper.member.selectAllMemberList");
	}

	
	@Override
	public List selectAllMemberList() throws DataAccessException {
		List<MemberVO> membersList = null;
		membersList = sqlSession.selectList("mapper.member.selectAllMemberList");
		return membersList;
	}

	@Override
	public int insertMember(MemberVO memberVO) throws DataAccessException {
		int result = sqlSession.insert("mapper.member.insertMember", memberVO);
		return result;
	}

	@Override
	public int deleteMember(String id) throws DataAccessException {
		int result =  sqlSession.delete("mapper.member.deleteMember", id);
		return result;
	}

}
