<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--01_set_remove.jsp --%>

변수선언<br>
<c:set var="num1" value="${20}" scope="page"></c:set>
<c:set var="num2" scope="page">
 12.5
</c:set>

<c:set var="date" value="<%=new java.util.Date() %>"/>

num1 : ${num1}<br>
num2 : ${num2}<br>
date : ${date}<br>
연산(num1 + num2) : ${num1 + num2}

<br>변수 제거
<c:remove var="num1" scope="page"/>
num1 : ${num1}<br>