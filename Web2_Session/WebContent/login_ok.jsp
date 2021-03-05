<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login OK!</title>
</head>
<body>
	<% 
		System.out.println(session.getId());
		String id =  (String)session.getAttribute("login_id");
	%>
	<%= id %> 님 로그인 하셨습니다.<br>
	<%= id %> is login.<br>	
	
	<form action="main">
		<input type="hidden" name="sign" value="logout">
		<input type="submit" value="로그아웃">
	</form>
</body>
</html>