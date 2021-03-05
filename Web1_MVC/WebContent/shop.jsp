<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shopping Site</title>
</head>
<body>
<%
	String name = "";
	name = (String)session.getAttribute("login_name");
	if (name == null) {
		name = "No name men";
	}
	
	
	/* String name = "guest";
	Cookie []all = request.getCookies(); 
	if(all!=null){
		for(Cookie c:all) {
			if(c.getName().equals("login_name")){
				name = c.getValue();
			}
		}
	} */
%>


	<%= name %> ,Welcome	<a href="basketView.jsp"><%=name %>'s Pocket Search</a>
	<hr>
	
	<form action="main">
	<input type = "hidden" name="key" value="basketInsert">
	<table>
		<tr><td><img src='img/Refregerator.jpg' style="max-width: 100%; height: auto;"></td>
		    <td><img src='img/TV.jpg' style="max-width: 100%; height: auto;"></td>
		    <td><img src='img/Haujen.jpg' style="max-width: 100%; height: auto;"></td>
		</tr>
		<tr><td><input type='radio' name="product" value="냉장고"></td>
		    <td><input type='radio' name="product" value="TV"></td>
		    <td><input type='radio' name="product" value="세탁기"></td>
		</tr>
	</table>
		<br>
		<input type="submit" value="Put in pocket">
	</form>
</body>
</html>
