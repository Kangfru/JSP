/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2019-12-19 00:54:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.mysqlboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class deleteForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

	int num = Integer.parseInt(request.getParameter("num"));
	String pageNum = request.getParameter("pageNum");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tfunction deleteSave() {\r\n");
      out.write("\t\t\t\tif(document.delForm.passwd.value == ''){\r\n");
      out.write("\t\t\t\t\talert(\"암호를 입력하세요\");\r\n");
      out.write("\t\t\t\t\tdocument.delForm.passwd.focus();\r\n");
      out.write("\t\t\t\t\treturn false;\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}// delete save end\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<b><center><font size=\"+2\">글 삭제</font></center></b>\r\n");
      out.write("\t\t<form name=\"delForm\" method=\"post\" action=\"deletePro.jsp?pageNum=");
      out.print(pageNum);
      out.write("\" onSubmit='return deleteSave()'>\r\n");
      out.write("\t\t\t<table cellpadding=\"5\" width=\"360\" align=\"center\">\r\n");
      out.write("\t\t\t\t<tr height=\"30\">\r\n");
      out.write("\t\t\t\t\t<td align=\"center\" bgcolor=\"");
      out.print(value_c);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<b>암호를 입력하세요.</b>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr height=\"30\">\r\n");
      out.write("\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" name=\"passwd\" id=\"passwd\" size=\"10\"/>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"num\" value=\"");
      out.print(num );
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr height=\"30\">\r\n");
      out.write("\t\t\t\t\t<td align=\"center\" bgcolor=\"");
      out.print(value_c);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"글 삭제\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" value=\"글 목록\" onclick=\"document.location='list.jsp?list=");
      out.print(pageNum);
      out.write("'\">\r\n");
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