import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.util.*;
import java.text.*;

public class ServletTest02 extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter(); // �����ϱ� ���� out��ü ����
		
		java.util.Date date = new java.util.Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:mm:ss EEEE");
		
		// ����
		out.println("<html>");
		out.println("<body bgcolor = \'peru\'>");
		out.println("<font color='white' size='5'>");
		out.println("<center><br><br><br>");
		out.println("<img src=\'imgs/song.jpg\'>");
		out.println("<marquee>");// �ڸ�ó�� �������� �۾� �±�
		out.println("<h3>������ ��ſ� �ݿ���</h3>");
		out.println("</marquee>");
		out.println("<br><br><hr size=10 color=white><br>");
		out.println(date.toString()); // ��¥ ���
		out.println("<br>");
		out.println(sdf.format(date));
		out.println("</font>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
		
		
	}

}
