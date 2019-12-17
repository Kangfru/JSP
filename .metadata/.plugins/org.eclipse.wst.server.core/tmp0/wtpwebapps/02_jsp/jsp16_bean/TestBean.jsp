<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="mybean.TestBean"%>
<%
request.setCharacterEncoding("UTF-8");
%>

<jsp:useBean id="tb" class="mybean.TestBean">
	<jsp:setProperty name="tb" property="*"/>
</jsp:useBean>

ID:<jsp:getProperty name="tb" property="id"/><br>
PASSWORD:<jsp:getProperty name="tb" property="pwd"/><br>
NAME:<jsp:getProperty name="tb" property="name"/><br>
ADDRESS:<jsp:getProperty name="tb" property="addr"/><br>
EMAIL:<jsp:getProperty name="tb" property="email"/><br>
TEL:<jsp:getProperty name="tb" property="tel"/><br>
<br/>

아이디 : <%= tb.getId()%><br>
비밀번호 : <%= tb.getPwd()%><br>
이름 : <%= tb.getName()%><br>
주소 : <%= tb.getAddr()%><br>
이메일: <%= tb.getEmail()%><br>
전화번호 : <%= tb.getTel()%><br>