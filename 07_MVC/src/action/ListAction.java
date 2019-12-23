package action;

import javax.servlet.http.*;
import java.util.*;
import boardmysql.*;//DAO,DTO

//액션은 jsp처리 로직을  액셩에다 한다 
//액션 dao메서드 호출 , 결과를 request.setAttribute("키","값");

public class ListAction implements CommandAction{

	@Override
	public String requestPro(HttpServletRequest request,
			HttpServletResponse response) throws Throwable {
		 
		//처리
		String pageNum=request.getParameter("pageNum");
		if(pageNum==null){
			pageNum="1";
		}
		int pageSize=10;//한 페이지의 글 갯수
		int currentPage=Integer.parseInt(pageNum);//현재 페이지 
		
		int startRow=(currentPage-1)*pageSize+1;//한 페이지의 시작 글번호
		int endRow=currentPage*pageSize;//한페이지의 마지막 글번호

		int count=0;//총 글갯수 넣을 변수
		int number=0;//글번호 처리 하려고 
		int pageBlock=10;
	
		List articleList=null;
		BoardDAO dao=BoardDAO.getDAO();//dao객체얻기 
		count=dao.getArticleCount();//dao메서드 호출,총 글갯수얻기
		
		if(count>0){//글이 존재하면
			articleList=dao.getList(startRow, pageSize);
		}else{//글이 없으면
			articleList=Collections.EMPTY_LIST;
		}//else
		
		number=count-(currentPage-1)*pageSize;//글목록에 표시할 글번호
		int pageCount=count/pageSize+(count%pageSize==0?0:1);
	
		//list.jsp에서 ${currentPage}
		request.setAttribute("currentPage", new Integer(currentPage));
	    request.setAttribute("startRow", new Integer(startRow));
	    request.setAttribute("endRow", new Integer(endRow));
	    request.setAttribute("pageBlock", new Integer(pageBlock));
	    request.setAttribute("pageCount", new Integer(pageCount));

	    request.setAttribute("count", new Integer(count));
	    request.setAttribute("pageSize", new Integer(pageSize));
	    request.setAttribute("number", new Integer(number));
	    request.setAttribute("articleList", articleList);
	    
	    return "/ch19/list.jsp";//해당 뷰를 리턴
     
	}//requestPro() end
}//class
