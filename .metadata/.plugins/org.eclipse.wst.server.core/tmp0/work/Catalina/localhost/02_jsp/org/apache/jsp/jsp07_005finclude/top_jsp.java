/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2019-12-11 01:39:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp07_005finclude;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');

String id=(String)session.getAttribute("id");
String log="";

if(id==null){
	log="<a href=Login.jsp>로그인</a>";
} else {
	log = "<a href=Logout.jsp>로그아웃</a>";
}

String mem="";
if(id==null){
	mem="<a href=Register.jsp>회원가입</a>";
} else {
	mem="<a href=MemberUpdate.jsp>회원정보수정</a>";
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"70%\" align=center border=1>\r\n");
      out.write("\t<tr bgcolor=\"peru\">\r\n");
      out.write("\t\t<td align=center><b>");
      out.print(log );
      out.write("</b></td>\r\n");
      out.write("\t\t<td align=center><b>");
      out.print(mem );
      out.write("</b></td>\r\n");
      out.write("\t\t<td align=center>\r\n");
      out.write("\t\t\t<b>\r\n");
      out.write("\t\t\t\t<a href=\"Product.jsp\">상품목록</a>\r\n");
      out.write("\t\t\t</b>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td align=center>\r\n");
      out.write("\t\t\t<b>\r\n");
      out.write("\t\t\t\t<a href=\"CartList.jsp\">장바구니</a>\r\n");
      out.write("\t\t\t</b>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td align=center>\r\n");
      out.write("\t\t\t<b>\r\n");
      out.write("\t\t\t\t<a href=\"OrderList.jsp\">구매목록</a>\r\n");
      out.write("\t\t\t</b>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>");
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
