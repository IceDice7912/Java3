<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 완료!</title>
</head>
<body>
	${id } 님 로그인 되셨습니다.
	<form>
		<input type ="hidden" name="sign" value="로그 아웃">
		<input type ="submit" value="로그 아웃">
	</form>
	
	<hr>
	
	<form actioin = "main">
		<input type="hidden" name = "sign" value = "basketInsert">
		<input type="radio" name="product" value="apple"> apple <br>
		<input type="radio" name="product" value="banana"> banana <br>
		<input type="radio" name="product" value="grape"> grape <br>
		<input type ="submit" value = "장바구니 넣기">
	</form>
</body>
</html>