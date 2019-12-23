<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/view/color.jspf"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>deleteForm.jsp</title>

<link href="style.css" rel="stylesheet" type="text/css">

<script type="text/javascript">
function deleteSave(){
	if(document.delForm.passwd.value==''){
		alert("암호를 입력 하시요 ");
		document.delForm.passwd.focus();
		return false;
	}
}
</script>
</head>
<body>
<center><h2>글삭제 폼</h2></center>

<form name="delForm" method="post" action="${ctxpath}/ch19/deletePro.do?pageNum=${pageNum}" onSubmit="return deleteSave()">
 <table border="1" align="center" width="360">
   
   <tr height="30">
    <td align="center" bgcolor="${value_C}">
     <b>암호를 입력해 주세요 </b>
    </td>
   </tr>
 
 	<tr height="30">
   <td align="center" bgcolor="${value_C}">
    비밀번호:
    <input type="password" name="passwd" size="8">
    <input type="hidden" name="num" value="${num}">
  </td>
  </tr>
  
 <tr height="30">
 <td align="center" bgcolor="${value_C}">
  <input type="submit" value="글삭제">
  <input type="button" value="글목록" onClick="document.location.href='${ctxpath}/ch19/list.do?pageNum=${pageNum}'">
 </td>
 </tr>
 
 </table>
</form>
</body>
</html>