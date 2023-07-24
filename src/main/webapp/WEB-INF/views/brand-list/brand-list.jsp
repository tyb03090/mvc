<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="b" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>The Brand List</h2>

	<table border="1">
		<tr>
			<th>번호</th>
			<th>브랜드 명</th>
			<th>타입</th>
			<th>소속 국가</th>
		</tr>

		<b:forEach items="${brandInfoList}" var="brandList">
			<tr>
				<td>${brandList.blNum}</td>
				<td>${brandList.blBrand}</td>
				<td>${brandList.blType}</td>
				<td>${brandList.blCountry}</td>
			</tr>
		</b:forEach>
	</table>
</body>
</html>