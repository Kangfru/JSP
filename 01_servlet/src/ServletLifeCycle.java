

import java.io.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLifeCycle
 */
@WebServlet("/ServletLifeCycle")
public class ServletLifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 전역변수
	public int count=0;

	
	public void init(ServletConfig conf) throws ServletException {
		System.out.println("Init() method 호출");
	}// end of init
	
	// service() : 클라이언트가 요청할 때마다 병행적으로 호출 -> 쓰레드 가능
	 public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("Service() method called...........");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter(); // 응답하기 위해 out 객체 생성
		out.println("<html><body>");
		count++;
		out.println("<h2>service() method called : " + count + "</h2>");
		out.println("</body></html>");
		
	 }
	 
	 // destroy()
	 public void destroy(){
		 System.out.println("destroy() method called.");
	 }
	 
	 
}// end of class
