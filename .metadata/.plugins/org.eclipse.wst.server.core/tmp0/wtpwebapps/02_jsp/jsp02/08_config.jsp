<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>08_config</title>
</head>
<body>

서블릿이름 : <%=config.getServletName() %> <br/>
서블릿 Context : <%=config.getServletContext() %> <br/>

이름 : <%=config.getServletContext().getInitParameter("name") %> <br/>
이름 : <%=application.getInitParameter("name") %> <br/>

</body>
</html>