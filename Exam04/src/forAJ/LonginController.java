package forAJ;
import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.PostConstruct;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main")
public class LonginController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAJ(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAJ(request, response);
	}

	private void doAJ(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); 
		response.setContentType("text/html; charset=UTF-8"); 
		String id=request.getParameter("id");
		PrintWriter out=response.getWriter();
		out.print("<script>		var id=$('#id').val();	var a = (id+\"님 로그인 되셨습니다.\");	alert(a);	</script>");
		out.println(id+"님 로그인 되셨습니다.");
		System.out.println(id+"님 로그인 되셨습니다.");
		out.flush();
	}
}