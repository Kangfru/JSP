<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>05_application.jsp</title>
</head>
<body>
이름:<%= application.getInitParameter("name") %>
TEL:<%= application.getInitParameter("tel") %>
주소:<%= application.getInitParameter("addr") %>
</body>
</html>