/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2019-12-17 02:38:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.mysqlboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class writeForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/view/color.jsp", Long.valueOf(1576546738379L));
  }

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

      out.write('\r');
      out.write('\n');
 
 String bodyback_c="#e0ffff";
 String back_c="#8fbc8f";
 String title_c="#5f9ea0";
 String value_c="#b0e0e6";
 String bar="#778899";

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>writeForm.jsp</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"script.js\"></script>\r\n");
      out.write("</head>\r\n");

int num = 0; // 변수
int ref = 1; // 글 그룹
int re_step = 0; // 글 순서 정리
int re_level = 0; // 들여쓰기
String reg_date = "";

if(request.getParameter("num") != null){ // 답글
	num = Integer.parseInt(request.getParameter("num"));
	ref = Integer.parseInt(request.getParameter("ref"));
	re_step = Integer.parseInt(request.getParameter("re_step"));
	re_level = Integer.parseInt(request.getParameter("re_level"));
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<h2><center>글쓰기 답글쓰기</center></h2>\r\n");
      out.write("\t<form name=writeForm method=\"post\" action=\"writePro.jsp\" onSubmit=\"return writeSave()\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"num\" value=\"");
      out.print(num );
      out.write("\"/>\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"ref\" value=\"");
      out.print(ref );
      out.write("\"/>\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"re_step\" value=\"");
      out.print(re_step );
      out.write("\"/>\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"re_level\" value=\"");
      out.print(re_level );
      out.write("\"/>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<table width=\"500\" cellpadding=\"3\" bgColor=\"");
      out.print(bodyback_c );
      out.write("\" align=\"center\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\" align=\"right\" bgColr=\"");
      out.print(value_c);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<a href=\"list.jsp\">글 목록 보기</a>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr bgcolor=\"");
      out.print(value_c);
      out.write("\">\r\n");
      out.write("\t\t\t\t<td width=\"70\">이름</td>\r\n");
      out.write("\t\t\t\t<td width=\"330\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"writer\" id=\"writer\" size=\"12\"/>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr bgColor=\"");
      out.print(value_c);
      out.write("\">\r\n");
      out.write("\t\t\t\t<td>글 제목</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t");

						if(request.getParameter("num") == null){ // 원글
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"subject\" id=\"subject\" size=\"40\"/>\r\n");
      out.write("\t\t\t\t\t\t\t");

						}
						else{ // 답글
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"subject\" id=\"subject\" size=\"40\" value=\"[답글]\"/>\r\n");
      out.write("\t\t\t\t\t\t\t");

						} // end of else
					
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr bgColor=\"");
      out.print(value_c);
      out.write("\">\r\n");
      out.write("\t\t\t\t<td>이메일</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"email\" id=\"email\" size=\"30\" placeholder=\"example@instance.com\"/></td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t <tr bgColor=\"");
      out.print(value_c);
      out.write("\">\r\n");
      out.write("\t\t\t \t<td>글내용</td>\r\n");
      out.write("\t\t\t \t<td>\r\n");
      out.write("\t\t\t \t\t<textarea name=\"content\" id=\"content\" rows=\"10\" cols=\"50\">\r\n");
      out.write("\t\t\t \t\t</textarea>\r\n");
      out.write("\t\t\t \t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr bgColor=\"");
      out.print(value_c);
      out.write("\">\r\n");
      out.write("\t\t\t\t<td>비밀번호</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"password\" name=\"passwd\" id=\"passwd\" size=\"12\"/></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr bgColor=\"");
      out.print(value_c);
      out.write("\">\r\n");
      out.write("\t\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"글쓰기\"/>\r\n");
      out.write("\t\t\t\t\t<input type=\"reset\" value=\"취소\"/>\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" value=\"글목록보기\" onClick=\"window.location='list.jsp'\"/>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
