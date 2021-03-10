<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>맴버 리스트</title>
</head>
<body>
	<talbe border="1">
		<tr align="center">
			<th>id</th>
			<th>name</th>
			<th>subject</th>
			<th>pw</th>
		</tr>
		
		<c:forEach var="m" items="${memberList }" varStatus="1">
			<tr>
				<td>${i.count }</td> 				
				<td>${m.id }</td> 
				<td>${m.name }</td>	
				<td>${m.sb }</td>
				<td>${m.pw }</td>
			</tr>	
		</c:forEach>
	</talbe>
</body>
</html>