<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- EmailUpload.jsp --%>

<%
	request.setCharacterEncoding("UTF-8");
%>

<jsp:useBean id="emailUpload" class="emailupload.EmailUpload"/>

<%
// 	emailupload.EmailUpload emailUpload = new emailupload.EmailUpload();
%>

<%=emailUpload.upload(request) %>