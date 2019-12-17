<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- JSP 주석 --%>
<%
// JAVA 주석
/* JAVA 주석 */
%> <%-- 스크립트릿 --%>
<!-- HTML 주석 -->

<h2>JSP주석</h2>
<%--
JSP 주석은 숨은주석이라 한다. -> 웹 상에서 소스보기를 이용해 볼 때 보이지 않음.
 --%>
 <h2>JAVA주석</h2>
 <%
 // out.println("안녕");
 /* out.println("hello"); */
 %>
 <h2>HTML주석</h2>
 <!-- 안녕<br> 헬로<br> 보임<br> -->

</body>
</html>