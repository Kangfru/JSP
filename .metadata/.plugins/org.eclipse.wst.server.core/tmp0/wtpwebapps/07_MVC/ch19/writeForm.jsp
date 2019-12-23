<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/view/color.jspf" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글쓰기 폼</title>

<link href="style.css" rel="stylesheet" type="text/css">

<script type="text/javascript" src="script.js"></script>
</head>
<body>
<center><h2>글쓰기</h2></center>

<form method="post" name="writeform" action="${ctxpath}/ch19/writePro.do">

 <input type="hidden" name="num" value="${num}"/>
 <input type="hidden" name="ref" value="${ref}"/>
 <input type="hidden" name="re_step" value="${re_step}"/>
 <input type="hidden" name="re_level" value="${re_level}"/>

 <table width="400" border="1" align="center">
 <tr>
  <td align="right" colspan="2" bgcolor="${value_c}">
    <a href="${ctxpath}/ch19/list.do">글목록</a>
  </td>
 </tr>
 
 <tr>
  <td width="70" bgcolor="${value_c}">이름</td>
  <td width="330">
   <input type="text" name="writer" size="12">
  </td>
 </tr>

<tr>
<td bgcolor="${value_c}">제목</td>
<td>
 <c:if test="${num==0}">
   <input type="text" name="subject" size="40">
 </c:if>

 <c:if test="${num!=0}">
  <input type="text" name="subject" size="40" value="[답변]">
 </c:if>
</td>
</tr>

<tr>
<td bgcolor="${value_c}">Email</td>
<td>
   <input type="text" name="email" size="40">
</td>
</tr>

<tr>
<td bgcolor="${value_c}">글내용</td>
<td>
<textarea name="content" rows="10" cols="40"></textarea>
</td>
</tr>

<tr>
<td bgcolor="${value_c}">암호</td>
<td>
<input type="password" name="passwd" size="8">
</td>
</tr>

<tr>
<td colspan="2" align="center">
 <input type="button" value="글쓰기" onClick="writeSave()">
 <input type="reset" value="다시작성">
 <input type="button" value="목록보기" 
 onclick="window.location='${ctxpath}/ch19/list.do'">
 
</td>
</tr>


 
 </table>

</form>
</body>
</html>