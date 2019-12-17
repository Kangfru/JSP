<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- template.jsp -->
<%
String pageFile = request.getParameter("page");

if(pageFile == null){
	pageFile = "newItem.jsp";
}
%>
<html>
	<body bgcolor="orange">
		<table width = 90% height=99% border="1" align="center">
		<!--상단메뉴 -->
			<tr>
				<td colspan="2" width="15%" align="right" valign="top">
				<jsp:include page="top.jsp"></jsp:include>
				</td>
			</tr>
		
			<tr>
			<!--왼쪽메뉴 -->
				<td width="15%" align="right" valign="top">
				<br><br>
				<jsp:include page="left.jsp"></jsp:include>
				</td>
			
			<!--중앙에 내용 표시  -->
				<td align="center">
				<jsp:include page="<%=pageFile %>"></jsp:include>		
				</td>
			</tr>
			<tr>
				<td colspan="2" height="40" align="center">
					<jsp:include page="bottom.jsp"></jsp:include>
				</td>
			</tr>
		
		</table>
	</body>
</html>