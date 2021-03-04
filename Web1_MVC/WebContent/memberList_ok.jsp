<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List, web.util.Member"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>맴버 리스트</title>
</head>
<body>
				<form action = main>
				<input type = 'hidden' name = 'key' value = 'memberDelete'>
				<form><input name = 'id'><input type = 'submit' value = '회원 삭제'></form>
				<table border = '1' width='300'>
				<tr><th>ID</th><th>Name : PW</th>
				
				<%
				List<Member> list=(List<Member>)request.getAttribute("list");
				for(Member m:list) {
					out.append("<tr><td>"+m.getId()+"</td><td>"+m.getName()+" : "+m.getPw()+"</td><tr>");
				}
				%>
				 </tr>
				 </table>
				 </form>
		<br><a href='index.html'>돌아가기</a>
</body>
</html>