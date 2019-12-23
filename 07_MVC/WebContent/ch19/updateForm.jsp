<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/view/color.jspf" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>updateForm.jsp</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="script.js"></script>
</head>
<body>
<center><h2>글수정</h2></center>
<form name="writeform" method="post" action="${ctxpath}/ch19/updatePro.do?pageNum=${pageNum}">
<table width="400" border="1" align="center">

<tr>
<td width="70" bgcolor="${value_c}" align="center">이름</td>
<td width="330">
<input type="text" name="writer" size=12 value="${dto.writer}">
<input type="hidden" name="num" value="${dto.num}">
</td>
</tr>

<tr>
<td width="70" bgcolor="${value_c}" align="center">제목</td>
<td width="330">
<input type="text" name="subject" size=40 value="${dto.subject}">
</td>
</tr>

<tr>
<td width="70" bgcolor="${value_c}" align="center">Email</td>
<td width="330">
<input type="text" name="email" size=40 value="${dto.email}">
</td>
</tr>

<tr>
<td width="70" bgcolor="${value_c}" align="center">글내용</td>
<td width="330">
<textarea name="content" rows="10" cols="40">${dto.content}</textarea>
</td>
</tr>

<tr>
<td width="70" bgcolor="${value_c}" align="center">암호</td>
<td width="330">
<input type="password" name="passwd" size=8>
</td>
</tr>

<tr>
<td colspan="2" align="center">
<input type="button" value="글수정" onClick="writeSave()">
<input type="reset" value="다시작성">
<input type="button" value="목록보기" 
onclick="document.location.href='${ctxpath}/ch19/list.do?pageNum=${pageNum}'">
</td>
</tr>


</table>
</form>

</body>
</html>