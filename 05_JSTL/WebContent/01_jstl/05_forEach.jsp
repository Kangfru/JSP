<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%--05_forEach.jsp--%>

<%--
forEach 태그는 배열이나, Collection, Map에 저장된 값들을 순차적으로 처리할 때 사용

java의 for, while, do-while문과 유사

forEach 태그 형식

<c:forEach var="변수" items="아이템">
처리내용
변수 내용 출력
</c:forEach>

설명
items 속성에 올 수 있는 것 : Map, [], Collection(List 등) 등등이 있다.
배열일 경우 기본 데이터는 Wrapper 클래스<Integer, Double, Long> 등등을 사용하여 처리
--%>

<%-- 실습1 --%>
<h3>1~10까지 출력</h3>
<c:forEach var="i" begin="1" end="10" step="1">
${i }&nbsp;
</c:forEach>

<%-- 실습2 --%>
<h3>1~10까지 짝수만 출력</h3>
<c:forEach var="i" begin="2" end="10" step="2">
${i }&nbsp;
</c:forEach>

<%-- 실습2 --%>
<h3>1~10까지 합구하기</h3>
<c:set var="sum" value="0"/>
<c:forEach var="i" begin="1" end="10" step="1">
	<c:set var="sum" value="${sum + i }"/>
</c:forEach>
1 ~ 10 까지의 합 : ${sum }






