package action;
import javax.servlet.*;
import javax.servlet.http.*;
import boardmysql.*;

public class ContentAction implements CommandAction{

	@Override
	public String requestPro(HttpServletRequest request,
			HttpServletResponse response) throws Throwable {
		
		int num=Integer.parseInt(request.getParameter("num"));
		String pageNum=request.getParameter("pageNum");
		
		BoardDAO dao=BoardDAO.getDAO();//dao객체 얻기 
		BoardDTO dto=dao.getArticle(num);//num에 해당하는 레코드
		
		//해당 뷰에서 사용할 속성 
		request.setAttribute("num", new Integer(num));
		request.setAttribute("pageNum", new Integer(pageNum));
		
		String content=dto.getContent();
		content=content.replace("\n", "<br>");
		request.setAttribute("content", content);
 		
		int ref=dto.getRef();
		int re_step=dto.getRe_step();
		int re_level=dto.getRe_level();

		 
		request.setAttribute("ref", new Integer(ref));
		request.setAttribute("re_step", new Integer(re_step));
		request.setAttribute("re_level", new Integer(re_level));
		
		request.setAttribute("dto", dto);	
		return "/ch19/content.jsp";//뷰리턴
	}//requestPro() end

}//class
