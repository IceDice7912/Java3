<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인덱스 창</title>
</head>
<body>
	일단은 테스트 중.<br>
	<hr><hr>
	<a href="MemberController?action=listMembers">회원 목록 보기</a><br>
	<a href="memberInsert.jsp">회원 가입 하기</a><br>
	<a href="login.jsp">로그인 하기</a><br>
	<br>
	현재 로그인 중인 아이디 : ${id }<br>
	...............................닉네임 : ${name }<br>
	
</body>