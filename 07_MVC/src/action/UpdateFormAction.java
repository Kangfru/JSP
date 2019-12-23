package action;
import javax.servlet.*;
import javax.servlet.http.*;
import boardmysql.*;

public class UpdateFormAction implements CommandAction{

	@Override
	public String requestPro(HttpServletRequest request,
			HttpServletResponse response) throws Throwable {
		 

		 int num=Integer.parseInt(request.getParameter("num"));
		 String pageNum=request.getParameter("pageNum");
		 
		 BoardDAO dao=BoardDAO.getDAO();//dao 객체 얻기 
		 BoardDTO dto=dao.updateGetArticle(num);//dao메서드 호출
		 
		 request.setAttribute("pageNum", pageNum);
		 request.setAttribute("dto", dto);
		 
		 return "/ch19/updateForm.jsp";//뷰리턴
		

	}//requestPro() end

}//class
