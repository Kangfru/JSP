<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page info="page객체 예제" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>07_page.jsp</title>
</head>
<body>
<h2>page객체 실습</h2>
info : <%=this.getServletInfo() %><br/>
서블릿 이름 : <%=this.getServletName() %><br/>
클래스 : <%=this.getClass() %><br/>
</body>
</html>