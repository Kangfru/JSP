<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
// post 요청 인코딩 처리
request.setCharacterEncoding("UTF-8");
%>
<hr color="red" size="3">
<h2>copyright.jsp</h2>

<a href=mailto:<%@ include file="email.txt"%>>
	<%@ include file="name.txt"%>
</a>

<h2>copyright.jsp</h2>
<hr color="red" size="3"> 