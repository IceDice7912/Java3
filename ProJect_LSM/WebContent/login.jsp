<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인창</title>
</head>
<body>

				<form action = MemberController>
				<input type = 'hidden' name = 'action' value = 'login'>

	<form action="MemberController" method="post">
		<input type="hidden" name="action" value="login">
		ID <input name='id'><br>
		PW <input type='password' name='pw'><br>
		<input type="submit" value="login">
	</form>
</body>
</html>