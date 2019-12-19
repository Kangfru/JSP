<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--04_chooseTag.jsp--%>
<%--
choose 태그 : java의 switch-case 문과 유사

choose 태그 형식

<c:choose>
	<c:when test="${조건1}">
	조건 1 처리내용
	</c:when>
	<c:when test="${조건2}">
	조건 2 처리내용
	</c:when>
	<c:when test="${조건3}">
	조건 3 처리내용
	</c:when>
	<c:otherwise>
	위의 조건에 해당 사항이 없을 때 처리 -> default
	</c:otherwise>
	설명 : 조건이 true이면 when 태그 바디 부분을 처리
	모든 조건이 false -> <c:otherwise>의 태그 실행
</c:choose>
--%>

<h2>choose 태그 실습</h2>
<ul>
	<c:choose>
		<c:when test="${param.name == 'park'}">
			<li>당신의 이름은 ${param.name }입니다.</li>
		</c:when>
		<c:when test="${param.age > 18}">
			<li>당신의 나이는 ${param.age }이므로 성인입니다.</li>
		</c:when>
		<c:when test="${param.age <= 18}">
			<li>당신의 나이는 ${param.age }이므로 미성년자입니다.</li>
		</c:when>
		<c:otherwise>
			<li>당신의 이름은 ${param.name }이 아닙니다.</li>
		</c:otherwise>
	</c:choose>
</ul>
<%--
http://localhost:9000/05_JSTL/01_jstl/04_chooseTag.jsp?name=park
http://localhost:9000/05_JSTL/01_jstl/04_chooseTag.jsp?name=junv&age=15
 --%>
 