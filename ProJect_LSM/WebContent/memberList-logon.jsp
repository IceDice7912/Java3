<%@ page language="java" contentType="text/html; charset=UTF-8"
	import=" java.util.*,web.controller.*"
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
   		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<script src="js/jquery.min.js"><	/script>
		<script src="js/jquery.dropotron.min.js"></script>
		<script src="js/skel.min.js"></script>
		<script src="js/skel-layers.min.js"></script>
		<script src="js/init.js"></script>
		<script>
			<link rel="stylesheet" href="css/skel.css" />
			<link rel="stylesheet" href="css/style.css" />
			<link rel="stylesheet" href="css/style-wide.css" />
		</script> 
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
				<form action = Main>
				<input type = 'hidden' name = 'action' value = 'listMembers-logon'>
  
</head>
<body>

		<!-- Wrapper -->
			<div class="wrapper style1">

				<!-- Header -->
					<div id="header" class="skel-panels-fixed">
						<div id="logo">
							<h1><a href="index-logon.jsp">영화 무료 다운로드</a></h1>
							<span class="tag">by IceDice</span>
						</div>
						<nav id="nav">
							<ul>
								<li class="active"><a href="index-logon.jsp">Homepage</a></li>
								<li><a href="index.html">로그 아웃</a></li>
							</ul>
						</nav>
					</div>

	<header class="major">
	 <p class="cls1"><h2>Top 500 명예 회원</h2></p>
	 </header>
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
      			<div class="container">
        <tr align="center">
          <td>${mem.id }</td>
          <td>****</td>
          <td>${mem.name}</td>     
          <td>${mem.sex }</td>     
          <td>${mem.age}</td>     
       </tr>
       			</div>
     </c:forEach>
     </c:when>
</c:choose>
	</table>
   <a href="index.html">홈으로 돌아가기</a>
</body>
</html>