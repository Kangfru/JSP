<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/view/color.jspf" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="style.css" rel="stylesheet" type="text/css">

</head>
<body>

<c:if test="${check==1}"> 
	<meta http-equiv="Refresh" 
	content="0;url=${ctxpath}/ch19/list.do?pageNum=${pageNum}">
</c:if>

<c:if test="${check==0}"> 
	비밀번호가 다릅니다.
	<br>
	<a href="javascript:history.go(-1)">
	[글삭제 폼으로 돌아가기]
	</a>
</c:if>

</body>
</html>