<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>

	로그인부터 하세요.

	<%-- 
		String name = (String)session.getAttribute("login_name");
		if(name==null) {
			
		}
	--%>
	<form action="main" method="post">
		<input type="hidden" name="key" value="login">
		ID <input name='id'><br>
		PW <input type='password' name='pw'><br>
		<input type="submit" value="login">
	</form>
</body>
</html>