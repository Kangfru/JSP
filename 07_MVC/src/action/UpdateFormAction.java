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
		 
		 BoardDAO dao=BoardDAO.getDAO();//dao ��ü ��� 
		 BoardDTO dto=dao.updateGetArticle(num);//dao�޼��� ȣ��
		 
		 request.setAttribute("pageNum", pageNum);
		 request.setAttribute("dto", dto);
		 
		 return "/ch19/updateForm.jsp";//�丮��
		

	}//requestPro() end

}//class
