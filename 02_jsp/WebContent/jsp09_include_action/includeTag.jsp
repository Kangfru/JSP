<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	request.setCharacterEncoding("UTF-8");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>includeTag.jsp</title>
</head>
<body>
includeTag.jsp<br>
includeTag.jsp<br>
includeTag.jsp<br>

<jsp:include page="includeTagTop.jsp">
	<jsp:param name="name" value="벤틀리"/>
	<jsp:param name="addr" value="서울 구로구"/>
	<jsp:param name="tel" value="010-1234-5678"/>
</jsp:include>

includeTag.jsp<br>
includeTag.jsp<br>
includeTag.jsp<br>
</body>
</html>