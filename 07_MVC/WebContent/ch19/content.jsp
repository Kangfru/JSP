<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/view/color.jspf" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글내용보기</title>
</head>
<body>
<center><h1>글내용보기 </h1></center>
<table width="500" cellpadding="3" align="center">
 
<tr height="30">
<td align="center" width="125" bgcolor="${value_c}">글번호</td>
<td align="center" width="125">${dto.num}</td>

<td align="center" width="125" bgcolor="${value_c}">조회수</td>
<td align="center" width="125">${dto.readcount}</td>
</tr>

<tr height="30">
<td align="center" width="125" bgcolor="${value_c}">작성자</td>
<td align="center" width="125">${dto.writer}</td>

<td align="center" width="125" bgcolor="${value_c}">작성일</td>
<td align="center" width="125">${dto.reg_date}</td>
</tr>

<tr height="30">
<td align="center" width="125" bgcolor="${value_c}">글제목</td>
<td align="center" width="375" colspan="3">${dto.subject}</td>
</tr>

<tr height="30">
<td align="center" width="125" bgcolor="${value_c}">글내용</td>
<td align="center" width="375" colspan="3" bgcolor="${value_c}">
 ${content}
</td>
</tr>

<tr height="30">
<td colspan="4" bgcolor="${value_c}" align="right">

<input type="button" value="글수정" onClick="document.location.href='${ctxpath}/ch19/updateForm.do?num=${num}&pageNum=${pageNum}'">
<input type="button" value="글삭제" onClick="document.location.href='${ctxpath}/ch19/deleteForm.do?num=${num}&pageNum=${pageNum}'">
<input type="button" value="답글쓰기" onClick="document.location.href='${ctxpath}/ch19/writeForm.do?num=${num}&pageNum=${pageNum}&ref=${ref}&re_step=${re_step}&re_level=${re_level}'">
<input type="button" value="리스트" onClick="document.location.href='${ctxpath}/ch19/list.do?pageNum=${pageNum}'">

</td>
</tr>
</table>
</body>
</html>