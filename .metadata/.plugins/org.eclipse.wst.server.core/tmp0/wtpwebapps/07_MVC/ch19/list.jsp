<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ include file="/view/color.jspf" %>

<fmt:requestEncoding value="UTF-8"/>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>list.jsp</title>

<link href="style.css" rel="stylesheet" type="text/css">

</head>
<body>
<center><b>글목록(전체 글:${count})</b></center>

<table width="700" align="center">
<tr>
 <td align="right" bgcolor="${value_c }">
    <a href="${ctxpath}/ch19/writeForm.do">글쓰기</a>
 </td>
 </tr>
</table>

<c:if test="${count==0}">
 <table width="700" border="1" align="center">
    <tr>
    <td align="center">
         게시판에 저장된 글이 없습니다
    </td>
    </tr>
  </table>
</c:if>

<c:if test="${count>0 }">
 <table border="1" width="700" align=center>
  <tr height="30" bgcolor="${value_c}">
   <td align="center" width=50>번 호</td>
   <td align="center" width=250>글제목</td>
   <td align="center" width=100>작성자</td>
   <td align="center" width=150>작성일</td>
   <td align="center" width=50>조 회</td>
   <td align="center" width=100>IP</td>
  </tr>
  
  <c:forEach var="dto" items="${articleList}">
  <tr>
   <td align="center">
    <c:out value="${number}"/>
    <c:set var="number" value="${number-1 }"/>
   </td>
  
  <td>
  <c:if test="${dto.re_level>0}">
     <img src="../imgs/level.gif" width="${5*dto.re_level }" height="16"/>
     <img src="../imgs/re.gif">
  </c:if>
   
  <c:if test="${dto.re_level==0}">
    <img src="../imgs/level.gif" width="${5*dto.re_level }" height="16"/>
  </c:if>
  
  <a href="${ctxpath}/ch19/content.do?num=${dto.num}&pageNum=${currentPage}">
  ${dto.subject}
  </a>
  
  <c:if test="${dto.readcount>=20}">
    <img src="../imgs/hot.gif" border="0" height="16"/>
  </c:if>
  </td>
  
  <td>
  <a href="mailto:${dto.email}">${dto.writer}</a>
  </td>
  
  <td>
   ${dto.reg_date}
  </td>
  
  <td>
  ${dto.readcount}
  </td>
  
  <td>
  ${dto.ip}
  </td>
  </tr>
  </c:forEach>
  </table>
</c:if><%--실행 --%>
<%-- 블럭처리,페이지처리 --%>
<table width="700" align="center">
<tr>
<td>
<c:if test="${count>0}">
 
 <fmt:parseNumber var="result" value="${currentPage/10}"  integerOnly="true"/>
 <c:set var="startPage" value="${result*10+1 }"/>
 <c:set var="endPage" value="${startPage+pageBlock-1}"/>

 <c:if test="${endPage>pageCount}">
   <c:set var="endPage" value="${pageCount}"/>
 </c:if>

  <%--이전블럭 --%>
  <c:if test="${startPage>10}">
   <a href="${ctxpath}/ch19/list.do?pageNum=${startPage-10 }">
   [이전블럭]</a>
  </c:if>
  
 <%--페이지 처리--%>
  <c:forEach var="i" begin="${startPage}" end="${endPage}">
   <a href="${ctxpath}/ch19/list.do?pageNum=${i}">
   [${i}]
   </a>
  </c:forEach>
  
  <%--다음블럭 --%>
  <c:if test="${endPage<pagecount }">
  <a href="${ctxpath}/ch19/list.do?pageNum=${startPage+10 }">
   [다음블럭]
  </a>
  </c:if>
  
</c:if>

</td>
</tr>
</table>

</body>
</html>