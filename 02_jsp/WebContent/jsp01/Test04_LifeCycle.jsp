<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test04_LifeCycle.jsp</title>
</head>
<body>
<h3>
jspInit(), jspDestroy() 메서드는 프로그래머가 선언부에 선언 후 사용해야함
</h3>
<%!
// 전역변수
String str = "Hello!!";
%>
<%!
public void jspInit(){
	str+=" jspInit() ";
	System.out.println("jspInit() method called..");
}
%>
<%!
	// jspDestroy()
	public void jspDestroy(){
	System.out.println("jspDestroy() method called..");
}
%>
<%
str+="  jspService() method called..  ";
%>
<%= str %> <%-- 표현식 --%>
</body>
</html>