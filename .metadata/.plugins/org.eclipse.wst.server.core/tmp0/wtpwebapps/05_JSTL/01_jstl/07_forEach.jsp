<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="boardmysql.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%-- 07_forEach.jsp--%>
<%
BoardDAO dao = BoardDAO.getDAO();
List list = dao.getList(1, 10);
request.setAttribute("list", list);
%>

<%-- EL로 메서드를 호출할려면 public static으로 메서드를 만든 후 TLD 파일을 만들어야함. --%>
<%-- <c:set var="list" value="${dao.getList(1, 10) "/> --%>
<c:set var="list2" value="<%=list %>"/>

<c:forEach var="dto" items="${list2 }">
${dto.writer }&nbsp;&nbsp;
${dto.subject }&nbsp;&nbsp;
${dto.content }<br/>
</c:forEach>