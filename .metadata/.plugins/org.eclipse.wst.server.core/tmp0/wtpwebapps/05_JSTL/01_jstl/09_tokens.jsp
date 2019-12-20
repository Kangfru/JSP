<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<%--09_tokens.jsp--%>

<%--
forTokens 태그는
java.util.StringTokenizer 클래스와 같은 기능을ㅈ ㅔ공한다.

forTokens 태그 형식
<c:forTokens var="token" items="문자열, 문자열, 문자열" delims="구분기호">
--%>

<h2>실습 구분기호를 , / 두 가지 사용</h2>
<c:forTokens var="token" items="빨강색,주황색/노랑색,파랑색/녹색/남색,보라색" delims=",/">
${token }&nbsp;
</c:forTokens>