<%@page import="kr.co.bangji.repository.BoardDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board_PAGE</title>
<meta name="viweport" content="width=device-width" , initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
</head>
<body>
	<%
		String name = (String) session.getAttribute("sessionid");
	%>
	<nav class="navbar navbar-default">

		<a class="navbar-brand" href="Signup.jsp">SIGNUP_PAGE</a> <a
			class="navbar-brand" href="Login.jsp">LOGIN_PAGE</a>
		<div class="navbar-header"></div>
	</nav>
	<%
		if (name != null) {
	%>
	<%=name%>
	님 어서오세요.
	<%
		} else {
	%>
	비회원으로 접속하셨습니다
	<%
		}
	%>
	<br>
	<br>
	<div class="container">
		<table class="table table-striped"
			style="text-align: center; border: 1px solid #dddddd">
			<thead>
				<tr>
					<th style="background-color: #eeeeee; text-align: center;">번호</th>
					<th style="background-color: #eeeeee; text-align: center;">제목</th>
					<th style="background-color: #eeeeee; text-align: center;">
						작성자</th>
					<th style="background-color: #eeeeee; text-align: center;">
						작성일</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="list" items="${boardlist}">
					<a href="/bangji/board/id/${boardlist.bnumber}">${boardlist.title},${boardlist.clientid }<br></a>
				</c:forEach>

			</tbody>
		</table>


		<a href="/Board/write.jsp" class="btn btn-primary pull-right">글쓰기</a>
	</div>

</body>
</html>