import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletTest01 extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		// html �������� ǥ�� HTML ������ Ÿ�� ����
		res.setContentType("text/html;charset=UTF-8");
		// Ŭ���̾�Ʈ�� �����ϱ� ���ؼ� out ��ü ����
		PrintWriter out = res.getWriter();
		
		// Ŭ���̾�Ʈ�� ����
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Hello World!!</h2>");
		out.println("<h2>�ȳ��ϼ���.</h2>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}// doGet end
	
} // class end
/*
MIME : Multi purpose Internet Mail Extensions
�� ������ ���ڿ������� �ؽ�Ʈ �̿��� ����, ������ �� 
�پ��� �����͸� ������ ���� ǥ���̴� 

���� JSP �����̳ʰ� Ŭ���̾�Ʈ���� ������ ���� �� 
�� ������ � ������ �����̴� (text/html) ��� ������ �־�� �Ѵ�.
*/