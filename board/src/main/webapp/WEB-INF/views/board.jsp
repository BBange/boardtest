<%@page import="kr.co.bangji.repository.BoardDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="kr.co.bangji.model.BoardData"%>
<%@ page import="kr.co.bangji.repository.BoardDao"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board_PAGE</title>
<meta name="viweport" content="width=device-width" >
<link rel="stylesheet" href="resources/css/bootstrap.css">
</head>
<body>
	<%
		String name = (String) session.getAttribute("NAME");
	int pageNumber =1;
	if(request.getParameter("pageNumber") != null){
		pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
	}
	request.setAttribute("page", pageNumber );
	%>
	<nav class="navbar navbar-default">
		<!--  <a class="navbar-brand" href="Login.jsp">LOGIN_WINDOW</a>-->
		<a class="navbar-brand" href="Signup.jsp">SIGNUP_PAGE</a> <a
			class="navbar-brand" href="Login.jsp">LOGIN_PAGE</a>
		<div class="navbar-header"></div>
	</nav>
	<% if(name != null){%>
	<%=name%> 님 어서오세요.
	<%} else { %>
	비회원으로 접속하셨습니다
	<% }%>
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
				<%
			BoardDaoImpl bdao= new BoardDaoImpl();
			ArrayList<BoardData> list = bdao.getList(pageNumber);
			out.print(pageNumber);
			
			for(int i = 0; i< list.size() ; i++){
				%>
				<tr>
					<td><%= list.get(i).getBoardid() %></td>
					<td><a href="writeResult.jsp?bid=<%=list.get(i).getBoardid() %>"><%= list.get(i).getTitle() %></a></td>
					<td><%= list.get(i).getUserid() %></td>
					<td><%= list.get(i).getDate() %></td>


				</tr>
				<% }
			%>
			</tbody>
		</table>
		<% 
			if(pageNumber != 1){
		%>
		 	<a href="Board.jsp?pageNumber=<%=pageNumber - 1 %>" class="btn btn-success btn-arraw-left">이전</a>
		<%
			} if(bdao.nextPage(pageNumber)){ 
		%>
			<a href="Board.jsp?pageNumber=<%=pageNumber + 1 %>" class="btn btn-success btn-arraw-left">다음</a>
		<%
			}
		%>				
		
		<a href="/Board/write.jsp" class="btn btn-primary pull-right">글쓰기</a>
	</div>

</body>
</html>