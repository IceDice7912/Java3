<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shopping Site</title>
</head>
<body>
<%
	String name = "guest";
	Cookie []all = request.getCookies(); 
	for(Cookie c:all) {
		if(c.getName().equals("login_name")){
			name = c.getValue();
		}
	}
%>


	..님 즐거운 쇼핑 되세요.
	<hr>
	<table>
		<tr><td><img src='img/냉장고.jpg' style="max-width: 100%; height: auto;"></td>
		    <td><img src='img/TV.jpg' style="max-width: 100%; height: auto;"></td>
		    <td><img src='img/세탁기.jpg' style="max-width: 100%; height: auto;"></td>
		</tr>
		<tr><td><input type='radio' name="product" value="냉장고"></td>
		    <td><input type='radio' name="product" value="TV"></td>
		    <td><input type='radio' name="product" value="세탁기"></td>
		</tr>
	</table>
</body>
</html>
