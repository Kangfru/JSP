

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
	// ��������
	public int count=0;

	
	public void init(ServletConfig conf) throws ServletException {
		System.out.println("Init() method ȣ��");
	}// end of init
	
	// service() : Ŭ���̾�Ʈ�� ��û�� ������ ���������� ȣ�� -> ������ ����
	 public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("Service() method called...........");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter(); // �����ϱ� ���� out ��ü ����
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
