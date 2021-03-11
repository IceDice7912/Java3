package web.service;

import java.util.List;

import web.dao.MemberDAO;
import web.vo.MemberVO;

public class MemberServiceImpl implements MemberService {

	MemberDAO memberDAO;
	
	
	
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}



	@Override
	public List<MemberVO> listMembers() {
		return memberDAO.listMembers();
	}

	
	
}
