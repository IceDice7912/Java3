package members;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MemberController")
public class MemberController extends HttpServlet {

	MemberDAO memberDAO;
	
	public void init() throws ServletException {
		memberDAO = new MemberDAO();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String action = request.getParameter("action");
		System.out.println("받은 액션 : " + action);
		
		if (action==null) {
			RequestDispatcher dispatch = request.getRequestDispatcher("index.jsp");
			dispatch.forward(request, response);
			System.out.println("액션값이 null입니다. index로 돌아갑니다.");
		}	else if(action.equalsIgnoreCase("listMembers")) {
		List<MemberVO> membersList = memberDAO.listMembers();
		request.setAttribute("membersList", membersList);
		RequestDispatcher dispatch = request.getRequestDispatcher("memberList.jsp");
		dispatch.forward(request, response);
		System.out.println("listMember 액션을 받았습니다. 맴버들을 출력합니다.");
		} else if (action.equalsIgnoreCase("addMember")) {
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			String name = request.getParameter("name");
			String sex = request.getParameter("sex");
			int age = request.getIntHeader("age");
			MemberVO memberVO = new MemberVO(id, pw, name, sex, age);
			memberDAO.addMember(memberVO);
			System.out.println("맴버 등록을 완료했습니다. 인덱스로 돌아갑니다.");
			RequestDispatcher dispatch = request.getRequestDispatcher("index.jsp");
			dispatch.forward(request, response);
		} else if (action.equalsIgnoreCase("login")) {
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			String name=memberDAO.login(id,pw);		
			if(name!=null) {						
				RequestDispatcher disp=request.getRequestDispatcher("login.jsp");
				request.setAttribute("name", name);
				disp.forward(request, response);
				System.out.println("로그인을 완료했습니다. 인덱스 화면으로 돌아갑니다. - " + name);	
			}else {
				System.out.println("login에 실패했습니다. 처음 화면으로 돌아갑니다.");
				RequestDispatcher dispatch = request.getRequestDispatcher("index.jsp");
				dispatch.forward(request, response);
			}
		}

	}

}
