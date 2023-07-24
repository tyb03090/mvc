<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>List</h3>

	<table border="1">
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>ID</th>
			<th>비밀번호</th>
		</tr>

		<c:forEach items="${userInfoList}" var="userInfo">
			<tr>
				<td>${userInfo.uiNum}</td>
				<td><a href="/user-info/view?uiNum=${userInfo.uiNum}">${userInfo.uiName}</a></td>
				<td>${userInfo.uiId}</td>
				<td>${userInfo.uiPwd}</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>