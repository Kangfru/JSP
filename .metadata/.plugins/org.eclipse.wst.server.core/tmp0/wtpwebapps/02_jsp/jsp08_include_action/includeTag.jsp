<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>includeTag.jsp</title>
</head>
<body>
<%-- include 액션 태그는 처리 결과가 돌아온다. --%>
includeTag.jsp<br/>
includeTag.jsp<br/>
<hr>
<jsp:include page="includeTagTop.jsp"/>
<hr>
<%
	String name = "Korea Football";
%>
<%=name %><br/><br/>
includeTag.jsp<br/>
includeTag.jsp<br/>
</body>
</html>