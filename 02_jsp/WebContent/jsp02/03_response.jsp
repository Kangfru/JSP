<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>03_response.jsp</title>
</head>
<body>
<%
// 	out.println("현재 설정된 인코딩 문자 내용 알아보기<br>");
// 	out.println(response.getCharacterEncoding());
	
	// 2초 후에 네이버로 이동하기
// 	response.setHeader("Refresh", "2;URL=https://www.naver.com");
	
	// TCP 모두 끊기고 새로 연결됨(클라이언트 정보 재사용 불가) 로컬과 외부 URL 모두 가능
// 	response.sendRedirect("https://daum.net");
// 	response.sendRedirect("02_request.jsp");
%>
<%-- forward 액션 태그 --%>
<%-- 
<jsp:forward page="02_request.jsp"/>
--%>
<%-- <jsp:forward page="https://daum.net"/> --%>

</body>
</html>