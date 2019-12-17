<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage  = "09_err.jsp" %>
    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>09_exception.jsp</title>
</head>
<body>
	<%--
		09_exception.jsp 에서 발하면 09_error.jsp로 오도록 한다.
	 --%>
	 <%
	 int a=7;
	 int b=0;
	 %>
	 a+b = <%= a + b%><br/>
	 a-b = <%= a - b%><br/>
	 a*b = <%= a * b%><br/>
	 a/b = <%= a / b%><br/>
	 a%b = <%= a % b%><br/>
	 
</body>
</html>