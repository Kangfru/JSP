<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");

session.setAttribute("id", "dkdlel");
session.setAttribute("pw", qlalfqjsgh);
%>

<h2>${sessionScope.id } 님 안녕하세요.</h2>

이름 : ${param.name }<br/><%-- =request.getParameter("name") --%>
주소 : ${param.addr }<br/>
전화 : ${param.tel }<br/>
취미<br>
<hr>
${paramValues.hobby[0] }<br><%-- request.getParameterValues("hobby") --%>
${paramValues.hobby[1] }<br>