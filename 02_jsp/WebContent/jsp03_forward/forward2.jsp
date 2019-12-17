<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("UTF-8");

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>forward2</title>
</head>
<body>
	<jsp:forward page="forward3.jsp">
		<jsp:param name="tel" value="010-2222-3333"/>
		<jsp:param name="email" value="ppp@naver.com"/>
	</jsp:forward>
</body>
</html>