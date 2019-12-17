<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String contentPage = request.getParameter("contentPage");
%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>template.jsp</title>
</head>
<body>
<table align="center" width="90%" height="90%" border=3 bgColor="orange">
	<%-- 탑 --%>
	<tr>
		<td colspan="2" bgColor="margenta" height="10%">
			<jsp:include page="top.jsp" flush="false"/>
		</td>
	</tr>
	<tr>
		<%-- 왼쪽 --%>
		<td width="10%" valign="top" bgColor="peru">
			<jsp:include page="left.jsp" flush="false"/>
		</td>
		<%-- 중앙 --%>
		<td width="80%" valign="top">
			<jsp:include page="<%= contentPage %>" flush="false"/>
		</td>
	</tr>
	<tr>
		<td colspan="2" align="center" bgColor="lightGray" height="10%">
			<jsp:include page="bottom.jsp" flush="false"/>
		</td>
	</tr>	
</table>
</body>
</html>