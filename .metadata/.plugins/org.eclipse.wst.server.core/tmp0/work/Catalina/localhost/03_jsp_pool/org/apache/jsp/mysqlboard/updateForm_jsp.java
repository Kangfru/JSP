/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2019-12-18 03:46:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.mysqlboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import boardmysql.*;

public final class updateForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
 
 String bodyback_c="#e0ffff";
 String back_c="#8fbc8f";
 String title_c="#5f9ea0";
 String value_c="#b0e0e6";
 String bar="#778899";

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	request.setCharacterEncoding("UTF-8");

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\r\n");
      out.write("\t</head>\r\n");
      out.write("\t\t");

			int num = Integer.parseInt(request.getParameter("num"));
			String pageNum = request.getParameter("pageNum");
			
			BoardDAO dao = BoardDAO.getDAO();
			BoardDTO dto = dao.updateGetArticle(num);
		
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<center><b><font size=\"+2\">글 수정</font></b></center>\r\n");
      out.write("\t\t<form method=\"post\" action=\"updatePro.jsp?pageNum=");
      out.print(pageNum);
      out.write("\" name=\"writeForm\">\r\n");
      out.write("\t\t\t<table width=\"60%\" cellpadding=\"5\" align=\"center\">\r\n");
      out.write("\t\t\t\t<tr bgColor=\"");
      out.print(value_c);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<td width=\"70\" align=\"center\">이름</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"330\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"writer\" id=\"writer\" size=\"16\" value=\"");
      out.print(dto.getWriter() );
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"num\" value=\"");
      out.print(num);
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr bgColor=\"");
      out.print(value_c);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<td width=\"70\" align=\"center\">글제목</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"330\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"subject\" id=\"subject\" size=\"16\" value=\"");
      out.print(dto.getSubject() );
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr bgColor=\"");
      out.print(value_c);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<td width=\"70\" align=\"center\">이메일</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"330\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"email\" id=\"email\" size=\"16\" value=\"");
      out.print(dto.getEmail() );
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr bgColor=\"");
      out.print(value_c);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<td width=\"70\" align=\"center\">글내용</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"330\">\r\n");
      out.write("\t\t\t\t\t\t<textarea name=\"content\" id=\"content\" rows=\"10\" cols=\"50\">");
      out.print(dto.getContent() );
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr bgColor=\"");
      out.print(value_c);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<td width=\"70\" align=\"center\">암호</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"330\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" name=\"passwd\" id=\"passwd\" size=\"16\"/>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"글수정\"/>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"reset\" value=\"취소\"/>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" value=\"글 목록 보기\" onclick=\"document.location='list.jsp?pageNum=");
      out.print(pageNum );
      out.write("'\"/>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</body>\r\n");
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