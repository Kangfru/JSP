<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// post 요청 한글처리
request.setCharacterEncoding("UTF-8");
%>

<%
String name="홍길동";
String bloodType=request.getParameter("bloodType");
bloodType = bloodType+".jsp";
%>

<jsp:forward page="<%=bloodType %>">
	<jsp:param name="name" value="<%=name %>"/>
</jsp:forward>