import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

//Servlet���� JSP�� ������ �ϱ� 
public class ServletToJsp extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		// Ŭ���̾�Ʈ�� �����ϱ� ���� �ѱ� ó��
		res.setContentType("text/html;charset=UTF-8");
		// �ƿ���ü ����
		PrintWriter out = res.getWriter();
		
		//Vector
		String user="������";
		Vector vec = new Vector();
		vec.add("���� ��Ų");
		vec.add("û����NO.3049");
		vec.add("���� 16.9�� ���̽� �ķ���");
		
		req.setAttribute("user", user);
		req.setAttribute("vec", vec);
		
		// servlet���� JSP�� ������
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/target.jsp");
		rd.forward(req, res);
	} // end of doGet()
	
	
} // end of ServletToJsp Class