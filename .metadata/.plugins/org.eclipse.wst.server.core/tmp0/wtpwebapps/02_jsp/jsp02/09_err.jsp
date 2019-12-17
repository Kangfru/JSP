<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isErrorPage = "true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>09_err.jsp</title>
</head>
<body>

<% 
String msg=exception.getMessage(); 
String obj=exception.toString();
%>

<%=msg %><br/>
<%=obj %>
</body>
</html>