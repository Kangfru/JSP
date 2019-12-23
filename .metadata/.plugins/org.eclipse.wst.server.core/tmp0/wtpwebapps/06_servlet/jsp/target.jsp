<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- target.jsp --%>

<h2>Vector 사용</h2>
<h3>
<%= (String) request.getAttribute("user")%>님의 쇼핑 카트에 담긴 물건은 : 
</h3>
<h3>${user }님의 쇼핑카트에 담긴 물건은 :</h3>

<ol>
<%
// 이전 방식
Vector vec = (Vector) request.getAttribute("vec");
for(int i = 0; i < vec.size(); i++){
	%>
	<li><%=vec.get(i) %></li>
	<%
} // end of for
%>
</ol>

<%-- EL사용 --%>
<%-- HashMap --%>
<h3>${user2 } 님 쇼핑카트에 담긴 물건 : </h3>
품명 1 : ${map.pum1}<br>
품명 2 : ${map.pum2}<br>
품명 3 : ${map.pum3}<br>
<c:forEach var="m" items="${map}">
${m.key } = > ${m.value } <br>
</c:forEach>