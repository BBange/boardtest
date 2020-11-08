<%@page import="kr.co.bangji.model.ClientData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN_WINDOW</title>
<meta name="viweport" content="width=device-width" >
<link rel="stylesheet" href="resources/css/bootstrap.css">
</head>
<body>

	<nav class="navbar navbar-default">
		<a class="navbar-brand" href="/bangji/main">로그인페이지</a>
		<div class="navbar-header"></div>
	</nav>

	<div class="container">
		<div class="col-lg-4"></div>
		<div class="col-lg-4">
			<div class="jumbotron" style="padding-top: 20px;">
				<form:form modelAttribute="clientData" action="createId" method="post">

					<h3 style="text-align: center;">회원가입</h3>
					<div class="form-group">
						ID:<form:input type="text" class="form-control" maxlength="20" path="id" />
					</div>
					<div class="form-group">
						PASSWORD:<form:input type="password" class="form-control"
							maxlength="20" path="password" />
					</div>
					<div class="form-group">
						EMAIL:<form:input type="text" class="form-control" maxlength="20"
							path="email" />
					</div>


					<input type="submit" class="btn btn-primary form-control"
						value="가입하기" />
					</form:form>
				
			</div>

		</div>
	</div>


</body>
</html>