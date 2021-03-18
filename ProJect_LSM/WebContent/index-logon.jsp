<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  session="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8">
<title>인덱스 창</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<!--[if lte IE 8]><script src="css/ie/html5shiv.js"></script><![endif]-->
		<script src="js/jquery.min.js"></script>
		<script src="js/jquery.dropotron.min.js"></script>
		<script src="js/skel.min.js"></script>
		<script src="js/skel-layers.min.js"></script>
		<script src="js/init.js"></script>
		<noscript>
			<link rel="stylesheet" href="css/skel.css" />
			<link rel="stylesheet" href="css/style.css" />
			<link rel="stylesheet" href="css/style-wide.css" />
		</noscript>
		<!--[if lte IE 8]><link rel="stylesheet" href="css/ie/v8.css" /><![endif]-->
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
								<li><a href="Main?action=listMembers-logon">회원 목록 보기</a></li>
								<li>${name }님 환영합니다.</li>
								<li><a href="index.html">로그 아웃하기</a></li>
							</ul>
						</nav>
					</div>

				<!-- Banner -->
					<div id="banner" class="container">
						<section>
							<p>세상에는 숨겨진 명작 영화들과 그것을 알아보는 혜안을 가진 사람들이 많습니다.<br>
							이 사이트에서는 그런 영화들을 자유롭게 다운받고 회원들과 자유롭게 이야기 할 수 있습니다!</p>
						</section>
					</div>

				<!-- Extra -->
					<div id="extra">
						<div class="container">
							<div class="row no-collapse-1">
								<section class="4u"> <a href="movie01-logon.html" class="image featured"><img src="images/pic01.jpg" alt=""></a>
									<div class="box">
										<p><font color="Black">크리스마스 영화</font></p>
										<a href="movie01-logon.html" class="button">Read More</a> </div>
								</section>
								<section class="4u"> <a href="movie02-logon.html" class="image featured"><img src="images/pic02.jpg" alt=""></a>
									<div class="box">
										<p><font color="Black">자연 다큐멘터리</font></p>
										<a href="movie02-logon.html" class="button">Read More</a> </div>
								</section>
								<section class="4u"> <a href="movie03-logon.html" class="image featured"><img src="images/pic03.jpg" alt=""></a>
									<div class="box">
										<p><font color="Black">러브 스토리</font></p>
										<a href="movie03-logon.html" class="button">Read More</a> </div>
								</section>
							</div>
							<div class="row no-collapse-1">
								<section class="4u"> <a href="movie04-logon.html" class="image featured"><img src="images/pic04.jpg" alt=""></a>
									<div class="box">
										<p><font color="Black">SF 영화</font></p>
										<a href="movie04-logon.html" class="button">Read More</a> </div>
								</section>
								<section class="4u"> <a href="movie05-logon.html" class="image featured"><img src="images/pic05.jpg" alt=""></a>
									<div class="box">
										<p><font color="Black">재난 영화</font></p>
										<a href="movie05-logon.html" class="button">Read More</a> </div>
								</section>
								<section class="4u"> <a href="movie06-logon.html" class="image featured"><img src="images/pic06.jpg" alt=""></a>
									<div class="box">
										<p><font color="Black">느와르</font></p>
										<a href="movie06-logon.html" class="button">Read More</a> </div>
								</section>
							</div>
						</div>
					</div>	
</body>