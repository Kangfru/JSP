/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2019-12-13 02:47:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp18_005fupload;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.oreilly.servlet.*;
import com.oreilly.servlet.multipart.*;
import java.util.*;
import java.io.*;

public final class fileUpload_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

request.setCharacterEncoding("UTF-8");
String savePath = "c:/_jsp/upload";
int sizeLimit = 5 * 1024 * 1024;

try{
	MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "UTF-8", new DefaultFileRenamePolicy());
	// 폼에서 전송된 파일 정보 가져오기
	Enumeration formNames = multi.getFileNames();
	
	// 파일 업로드가 여러개 일 경우 while 문 사용
	String formName = (String)formNames.nextElement();
	
	//서버에 저장된 파일 이름를 리턴 (파일의 이름 얻기)
	String fileName=multi.getFilesystemName(formName); 
	
	if(fileName == null) {// 파일이 업로드 되지 않았을때
	    out.print("파일 업로드 되지 않았음");
	}else{  // 파일이 업로드 되었을때
		// 웹 브라우저에 출력
		// 일반 자료
		out.print("Name:"+multi.getParameter("name")+"<BR>");//★★★
		out.print("ID:"+multi.getParameter("id")+"<BR>");//★★★
		out.print("PWD:"+multi.getParameter("pwd")+"<BR>");//★★★

		// 참고
		out.print("Form 안의  Name : " + formName + "<BR>");//별의미 없음
		out.print("File Name  : " + fileName);//별의미 없음

		//input 태그속성이 file인것,//서버에 저장된 파일 이름  
		String fileName2=multi.getFilesystemName("upfile");

		// 전송된 원래 파일 이름
		String original=multi.getOriginalFileName("upfile");
		  
		//input 항목이름에 해당하는 
		//파일 정보를 File형으로 리턴합니다
		File file = multi.getFile("upfile"); 
		String type = multi.getContentType("upfile");
		
		out.print("<br><br>실제 파일 이름 : " + original + "<br>");
		out.print("저장된 파일 이름 : " + fileName2+"<br>");
		out.print("file getFile : "+ file + "<br>");
		out.print("파일 타입 : " + type +"<br>");
		
		if(file != null){
			out.println("파일 size : " + file.length() + "<br>");
		}
	}
} catch(Exception e){
	out.println("파일 업로드 실패");
	e.printStackTrace();
}// end of catch

    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
