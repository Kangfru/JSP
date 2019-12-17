import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.util.*;
import java.text.*;

public class ServletTest02 extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter(); // 응답하기 위해 out객체 생성
		
		java.util.Date date = new java.util.Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:mm:ss EEEE");
		
		// 응답
		out.println("<html>");
		out.println("<body bgcolor = \'peru\'>");
		out.println("<font color='white' size='5'>");
		out.println("<center><br><br><br>");
		out.println("<img src=\'imgs/song.jpg\'>");
		out.println("<marquee>");// 자막처럼 지나가는 글씨 태그
		out.println("<h3>오늘은 즐거운 금요일</h3>");
		out.println("</marquee>");
		out.println("<br><br><hr size=10 color=white><br>");
		out.println(date.toString()); // 날짜 출력
		out.println("<br>");
		out.println(sdf.format(date));
		out.println("</font>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
		
		
	}

}
