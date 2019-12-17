<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="boardmysql.*"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<%-- dto 셋터 작업 --%>
<jsp:useBean id="dto" class="boardmysql.BoardDTO">
	<jsp:setProperty name="dto" property="*"/>
</jsp:useBean>

<%
dto.setIp(request.getRemoteAddr());

BoardDAO dao = BoardDAO.getDAO();
dao.insertArticle(dto);
response.sendRedirect("list.jsp");
%>