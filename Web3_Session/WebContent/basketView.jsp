<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니 출력</title>
</head>
<body>
	${ id } 님의 장바구니.<br>
	
	<form action="main">
		<input type="hidden" name="sign" value="logout">
		<input type="submit" value="로그아웃">
	</form>
	
	<hr>
	
	<% 
		ArrayList<String> list = (ArrayList<String>)session.getAttribute("basket");
		for (String product:list) {
			out.write(product+"<br>");
		}
	%>
	
</body>
</html>