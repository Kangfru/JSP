<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- menu.jsp -->

<h2>구매CD를 고르세요</h2>

<form method="post">

	<select name="item">
		<option value="레드벨벳CD" selected>레드벨벳CD</option>
		<option value="오마이걸CD">오마이걸CD</option>
		<option value="AoACD">AoACD</option>
		<option value="아이유CD">아이유CD</option>
		<option value="아이즈원CD">아이즈원CD</option>
		<option value="러블리즈CD">러블리즈CD</option>
		<option value="IOICD">IOICD</option>
	
	</select>
	
	<!-- 장바구니에 추가  -->
	<input type="hidden" name="step" value="add">
	<input type="submit" value="선택 ">

</form>
