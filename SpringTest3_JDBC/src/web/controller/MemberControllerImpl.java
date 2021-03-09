package web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import web.service.MemberService;

public class MemberControllerImpl implements MemberController {

		private MemberService memberService;

		public void setMemberService(MemberService memberService) {
			this.memberService = memberService;
		}
		
		public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception {}
		List memberList=memberService.listMembers();
		ModelAndView mav=new ModelAndView("listMembers");
		mav.addObject("membersList",membersList);
		return mav;
	}

}
