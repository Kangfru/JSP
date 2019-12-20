import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

//Servlet에서 JSP로 포워딩 하기 
public class ServletToJsp extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		// 클라이언트에 응답하기 위한 한글 처리
		res.setContentType("text/html;charset=UTF-8");
		// 아웃객체 생성
		PrintWriter out = res.getWriter();
		
		//Vector
		String user="아이유";
		Vector vec = new Vector();
		vec.add("이음 스킨");
		vec.add("청바지NO.3049");
		vec.add("소주 16.9도 참이슬 후레쉬");
		
		req.setAttribute("user", user);
		req.setAttribute("vec", vec);
		
		// servlet에서 JSP로 포워딩
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/target.jsp");
		rd.forward(req, res);
	} // end of doGet()
	
	
} // end of ServletToJsp Class
