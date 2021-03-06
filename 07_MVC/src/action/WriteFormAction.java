package action;
import javax.servlet.*;
import javax.servlet.http.*;

public class WriteFormAction implements CommandAction{

	@Override
	public String requestPro(HttpServletRequest request,
			HttpServletResponse response) throws Throwable {
		
		//원글 ,답글 처리 
        int num=0, ref=1, re_step=0, re_level=0;  
        try{
        	 if(request.getParameter("num")!=null){//답글이면
           	  num=Integer.parseInt(request.getParameter("num"));
          	  ref=Integer.parseInt(request.getParameter("ref"));
          	  re_step=Integer.parseInt(request.getParameter("re_step"));
          	  re_level=Integer.parseInt(request.getParameter("re_level"));	 
           		 
           	 }//if
        }catch(Exception ex){
        	ex.printStackTrace();
        }

		//해당 뷰에서 사용할 속성 

        request.setAttribute("num", new Integer(num));
        request.setAttribute("ref", new Integer(ref));
        request.setAttribute("re_step", new Integer(re_step));
        request.setAttribute("re_level", new Integer(re_level));

        return "/ch19/writeForm.jsp";//해당 뷰를 리턴한다 
        
		
	}//requestPro() end

}//class---
