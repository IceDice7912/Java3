package Web.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

@WebServlet("/main")
public class MainServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request,response);		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request,response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		BufferedReader br=request.getReader();
		JSONObject jsonObject=(JSONObject)JSONValue.parse(br);
		
		String sign=(String) jsonObject.get("sign");
		
		if(sign==null) {
			return ;			
		}else if(sign.equals("login")) {			
			String id=(String) jsonObject.get("id");
			String pw=(String) jsonObject.get("pw");

			//dao login
			//ok			
			HttpSession session=request.getSession();
			session.setAttribute("id", id);		
			
		
			JSONObject returnObject=new JSONObject();
			returnObject.put("id", id);
			returnObject.put("pw", pw);
			
			String returnString=returnObject.toJSONString();
			
			PrintWriter out=response.getWriter();
			out.append(returnString);

		}else if(sign.equals("logout")) {
			HttpSession session=request.getSession();
			session.invalidate();//세션 무효화
			RequestDispatcher disp=request.getRequestDispatcher("index.html");
			disp.forward(request, response);
		}
	}

}






