<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN_WINDOW</title>
<meta name="viweport" content="width=device-width" , initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
</head>
<body>

	<nav class="navbar navbar-default">
		<a class="navbar-brand" href="Login.jsp">LOGIN_PAGE</a>
		<div class="navbar-header"></div>
	</nav>

	<div class="container">
		<div class="col-lg-4"></div>
		<div class="col-lg-4">
			<div class="jumbotron" style="padding-top: 20px;">
			<form action="/Board/LogServlet" method="post">
			<!-- <form action="/Board/LoginServlet" method="post"> -->
			<h3 style="text-align: center;"> 회원가입</h3>
			<div class="form-group">
			ID:<input type="text" class="form-control"  name="userID" maxlength="20" onkeydown="idcheck()">
			
			
			</div>
			<div class="form-group">
			PASSWORD:<input type="password" class="form-control"  name="userPassword" maxlength="20">
			</div>
			<div class="form-group">
			NAME:<input type="text" class="form-control"  name="userName" maxlength="20">
			</div>
			<div class="form-group">
			AGE:<input type="text" class="form-control"  name="userAge" maxlength="20">
			</div>
			<input type="submit" class="btn btn-primary form-control" value="가입하기">
			<input type="hidden" name="method" value="signup" />
			</form>
			</div>
		
		</div>
	</div>


</body>
</html>