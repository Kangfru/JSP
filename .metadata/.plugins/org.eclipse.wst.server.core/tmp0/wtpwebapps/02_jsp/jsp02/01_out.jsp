<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page buffer = "10kb" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>01_out.jsp</title>
</head>
<body>
	<h2>01_out.jsp</h2>
	<%
		int total = out.getBufferSize();
		int rate = out.getRemaining();
		out.println("오늘은 화요일<br/>");
	%>
	전체버퍼 <%= total %><br/>
	남은버퍼 <%= rate %><br/>
	사용중인 버퍼:<%= total - rate %><br/>
</body>
</html>