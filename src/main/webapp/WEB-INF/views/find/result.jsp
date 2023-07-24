<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>결과 <%=request.getAttribute("msg") %></h2>
	<h3>시도 횟수 <%=request.getAttribute("c") %></h3>
	<h3>정답 : <%=request.getAttribute("rNum") %></h3>
</body>
</html>