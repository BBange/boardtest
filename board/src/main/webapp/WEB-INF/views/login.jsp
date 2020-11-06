<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN_PAGE</title>
<meta name="viweport" content="width=device-width" >
<link rel="stylesheet" href="resources/css/bootstrap.css">
</head>
<body>

	<nav class="navbar navbar-default">
		<!-- <a class="navbar-brand" href="Login.jsp">LOGIN_WINDOW</a>
		<a class="navbar-brand" href="Signup.jsp">SIGNUP_PAGE</a>
		<a class="navbar-brand" href="Board.jsp">BOARD_PAGE</a> -->
		<div class="navbar-header"></div>
	</nav>

	<div class="container">
		<div class="col-lg-4"></div>
		<div class="col-lg-4">
			<div class="jumbotron" style="padding-top: 20px;">
			<form action="" method="post">
			<!-- <form action="/Board/LoginServlet" method="post"> -->
			<h3 style="text-align:center;"> 로그인 화면</h3>
			<div class="form-group">
			<input type="text" class="form-control"  placeholder="아이디" name="userID" maxlength="20">
			</div>
			<div class="form-group">
			<input type="password" class="form-control"  placeholder="패스워드" name="userPassword" maxlength="20">
			</div>
			<input type="submit" class="btn btn-primary form-control" value="로그인">
			<input type="hidden" name="method" value="login" />
			</form>
			</div>
		
		</div>
	</div>


</body>
</html>