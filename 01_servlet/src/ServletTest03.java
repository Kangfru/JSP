

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletTest03")
public class ServletTest03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		// 응답하기 위한 out객체 생성
		PrintWriter out = response.getWriter();
		
		//클라이언트가 보내준 자료 받기
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String content = request.getParameter("content");
		
		// 서버에서 처리를 하여 클라이언트로응답
		out.println("<html><body bgcolor=peru>");
		out.println("당신의 이름은 " + name + "<br>");
		out.println("당신의 이메일은 " + email + "<br>");
		out.println("글 내용" + content + "<br>");
		out.println("</body></html>");
		out.close();		

	} // end of doGet
}
