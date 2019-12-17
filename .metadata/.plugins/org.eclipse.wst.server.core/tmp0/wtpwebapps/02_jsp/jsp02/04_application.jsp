<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>04_application.jsp</title>
</head>
<body>
<%
	out.println("서버정보 <br>");
	out.println(application.getServerInfo());
	out.println("<br>");
	
	out.println("aa.html MIME TYPE 은 <br>");
	out.println(application.getMimeType("aa.html"));
%>
<br/><br/>
메이저버젼 : <%= application.getMajorVersion() %><br>
마이너버젼 : <%= application.getMinorVersion() %><br>
실제경로 : <%= application.getRealPath("/") %><br>

<%
	application.log("이제 겨우 화요일 잠와 죽겠네");
%>
</body>
</html>