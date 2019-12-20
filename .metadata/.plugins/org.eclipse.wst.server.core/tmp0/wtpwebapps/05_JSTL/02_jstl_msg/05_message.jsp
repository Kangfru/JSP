<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<fmt:setLocale value="en"/>

<fmt:bundle basename="resource.message">

	<fmt:message key="title" var="tt"/>
	 <h2>${tt }</h2>
	<fmt:message key="greeting"/>
	<br>
	
	<c:if test="${! empty param.id }">
		<fmt:message key="visitor">
			<fmt:param value="${param.id }"/>
			<fmt:param value="${param.pw }"/>
		</fmt:message>
	</c:if>
</fmt:bundle>