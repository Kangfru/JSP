<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <jsp:useBean id="bb" class="upload.FileUploadBean" scope="request"/><%--객체생성 기능이다 --%>
  
  <%= bb.upload(request) %>

</body>
</html>