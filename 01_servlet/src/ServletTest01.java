import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletTest01 extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		// html 페이지의 표준 HTML 컨텐츠 타입 지정
		res.setContentType("text/html;charset=UTF-8");
		// 클라이언트로 응답하기 위해서 out 객체 생성
		PrintWriter out = res.getWriter();
		
		// 클라이언트로 응답
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Hello World!!</h2>");
		out.println("<h2>안녕하세요.</h2>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}// doGet end
	
} // class end
/*
MIME : Multi purpose Internet Mail Extensions
은 인터텟 전자우편으로 텍스트 이외의 음성, 동영상 등 
다양한 데이터를 보내기 위한 표준이다 

따라서 JSP 컨테이너가 클라이언트에게 문서를 보낼 때 
이 문서는 어떤 형식의 문서이다 (text/html) 라고 지정해 주어야 한다.
*/