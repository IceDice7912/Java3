<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	isELIgnored="false" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"  />     
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <title>회원 가입창</title>
<body>
				<form action = Main>
				<input type = 'hidden' name = 'action' value = 'addMember'>
<h1  style="text-align:center">회원 가입창</h1>
<table  align="center">
    <tr>
       <td width="200"><p align="right">아이디</td>
       <td width="400"><input type="text" name="id"></td>
    </tr>
    <tr>
        <td width="200"><p align="right">비밀번호</td>
        <td width="400"><input type="password"  name="pw"></td>
    </tr>
    <tr>
        <td width="200"><p align="right">이름</td>
        <td width="400"><p><input type="text"  name="name"></td>
    </tr>
    <tr>
        <td width="200"><p align="right">성</td>
        <td width="400"><p><input type="text"  name="sex"></td>
    </tr>
    <tr>
        <td width="200"><p align="right">나이</td>
        <td width="400"><p><input type="text"  name="age"></td>
    </tr>
    <tr>
        <td width="200"><p>&nbsp;</p></td>
        <td width="400">
	       <input type="submit" value="가입하기" onclick="alert('가입되었습니다.')">
	       <input type="reset" value="다시입력">
       </td>
    </tr>
</table>
</form>
</body>
</html>
