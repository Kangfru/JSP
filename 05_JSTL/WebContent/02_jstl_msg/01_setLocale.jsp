<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%--
국제화 태그들이 사용할 로케일을 지정한다 
로케일이란 : 각 나라의 언어 표기를 설정 

로케일 지정 태그는 2가지가 있다

setLocale  : 국제화 태그들이 사용할 로케일을 지정한다 
requestEncoding : 요청 파라미터의 캐릭터 인코딩을 지정한다
request.setCharacterEncoding("UTF-8")
--%>
<h2>setLocale</h2>
<h2>언어_나라</h2>
<h2>ko_kr</h2>
<h2>ko_KR.eucKR</h2>

default locale:<%=response.getLocale()  %>
<pre>
디폴트 : 현재 컴퓨터 국가별 설정에 되어있는 언어_나라
제어판 -> 국가 및 언어 확인 가능
</pre>

<%-- 영문 locale --%>
<fmt:setLocale value="en"/>
<li>영문 locale : <%=response.getLocale() %></li>

<%-- 일어 locale --%>
<fmt:setLocale value="ja"/>
<li>일어 locale : <%=response.getLocale() %></li>