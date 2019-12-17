<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>main.jsp</title>
</head>
<body>
<jsp:forward page="template.jsp">
	<jsp:param name="contentPage" value="content.jsp"/>
</jsp:forward>
</body>
</html>