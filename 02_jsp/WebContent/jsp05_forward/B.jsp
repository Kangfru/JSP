<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h2>B.jsp</h2>
<%
	String bloodType=request.getParameter("bloodType"); // html에서 보낸 데이터
	String name=request.getParameter("name"); // jsp에서 보낸 데이터
%>

<b><%=name %></b>님의 혈액형은
<b><%=bloodType %></b>형입니다.