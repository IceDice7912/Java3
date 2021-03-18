package web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web.model.MemberDAO;
import web.util.MemberVO;
import web.util.MyException;


@WebServlet("/Main")
public class MemberController extends HttpServlet {

	MemberDAO memberDAO;
	
	@Override
	public void init() throws ServletException {		
		super.init();
		try {
			memberDAO=new MemberDAO();
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String action = request.getParameter("action");
		System.out.println("받은 액션 : " + action);
		PrintWriter out = response.getWriter();	
		
		if (action==null) {
			RequestDispatcher dispatch = request.getRequestDispatcher("index.html");
			dispatch.forward(request, response);
			System.out.println("액션값이 null입니다. index로 돌아갑니다.");
		} //아무 값도 못 받았을 때
		
		else if(action.equalsIgnoreCase("listMembers")) {
		List<MemberVO> membersList = memberDAO.listMembers();
		request.setAttribute("membersList", membersList);
		RequestDispatcher dispatch = request.getRequestDispatcher("memberList.jsp");
		dispatch.forward(request, response);
		System.out.println("listMember 액션을 받았습니다. 맴버들을 출력합니다.");
		} //맴버 출력
		
		else if(action.equalsIgnoreCase("listMembers-logon")) {
		List<MemberVO> membersList = memberDAO.listMembers();
		request.setAttribute("membersList", membersList);
		RequestDispatcher dispatch = request.getRequestDispatcher("memberList-logon.jsp");
		dispatch.forward(request, response);
		System.out.println("listMember 액션을 받았습니다. 맴버들을 출력합니다.");
		} //맴버 출력-로그인 상태
		
		else if (action.equalsIgnoreCase("addMember")) {
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			String name = request.getParameter("name");
			String sex = request.getParameter("sex");
			int age = Integer.parseInt(request.getParameter("age"));
			MemberVO memberVO = new MemberVO(id, pw, name, sex, age);
			System.out.println("controller - vo로부터 건네받은 age값 : " + age);
			memberDAO.addMember(memberVO);
			System.out.println("맴버 등록을 완료했습니다. 인덱스로 돌아갑니다.");
			RequestDispatcher dispatch = request.getRequestDispatcher("index.html");
			dispatch.forward(request, response);
		} //회원 가입
		
		else if(action.equalsIgnoreCase("login")) {
			String id=request.getParameter("id");
			String pw=request.getParameter("pw");
			String name = memberDAO.login(id, pw);
			System.out.println("받은 아이디 : " + id);
			System.out.println("받은 비번 : " + pw);
			System.out.println("산출 이름 : " + name);
			if(name!=null) {
				RequestDispatcher disp=request.getRequestDispatcher("index-logon.jsp");
				request.setAttribute("name", name);
				disp.forward(request, response);
				out.append("#namehere").println(name+"sir, welcome");
			}else {
				RequestDispatcher disp=request.getRequestDispatcher("login-fail.html");
				disp.forward(request, response);
			}
		} //로그인
		

		
	}	
		catch(MyException e) {
		System.out.println("에러 발생 - 홈으로 되돌아갑니다. " + e);
		RequestDispatcher disp=request.getRequestDispatcher("index.html");
		disp.forward(request, response);
		}
	}
}
