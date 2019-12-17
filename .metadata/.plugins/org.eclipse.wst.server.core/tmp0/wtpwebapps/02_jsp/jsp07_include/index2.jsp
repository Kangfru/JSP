<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index2.jsp</title>
</head>

<body bgcolor="#996600">
	<%@ include file="top.jsp" %>
	<table width="70%" align="center" height="90%" bgcolor="#ffff99">

		<%
			if(id != null){
				%>
				<tr>
					<td align="center">
						<%=id %>님 방문해주셔서 감사합니다.
					</td>
				</tr>
				
				<%
			} else {
				%>
				<tr>
					<td align="center">
					 로그인 하신 후에 방문해 주세요.
					</td>
				<%
			} // end of else
		%>

	</table>
	
	<%@ include file="bottom.jsp" %>
</body>
</html>