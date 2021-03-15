<%@ page language="java" contentType="text/html; charset=UTF-8"
	import=" java.util.*, members.*"
	pageEncoding="UTF-8"
	isELIgnored="false" 
%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
request.setCharacterEncoding("UTF-8");
%>    
<html>
<head>
   <meta  charset="UTF-8">
   <title>회원 정보 출력창</title>
   
   <style>
     .cls1 {
       font-size:40px;
       text-align:center;
     }
    
     .cls2 {
       font-size:20px;
       text-align:center;
     }
  </style>

				<form action = MemberController>
				<input type = 'hidden' name = 'action' value = 'listMembers'>
  
</head>
<body>
	 <p class="cls1">회원정보</p>
   <table align="center" border="1" >
      <tr align="center" bgcolor="lightgreen">
         <td width="7%" ><b>아이디</b></td>
         <td width="7%" ><b>비밀번호</b></td>
         <td width="7%" ><b>이름</b></td>
         <td width="7%"><b>성별</b></td>
         <td width="7%" ><b>나이</b></td>
   </tr>
   <c:choose>
    <c:when test="${ empty membersList}" >
      <tr>
        <td colspan="5" align="center">
          <b>DB로부터 정보를 받는데 실패하였습니다.</b>
       </td>  
      </tr>
   </c:when>  
   <c:when test="${!empty membersList}" >
      <c:forEach  var="mem" items="${membersList }" >
        <tr align="center">
          <td>${mem.id }</td>
          <td>${mem.pw }</td>
          <td>${mem.name}</td>     
          <td>${mem.sex }</td>     
          <td>${mem.age}</td>     
       </tr>
     </c:forEach>
     </c:when>
</c:choose>
	</table>
   <a href="index.html">홈으로 돌아가기</a>
</body>
</html>