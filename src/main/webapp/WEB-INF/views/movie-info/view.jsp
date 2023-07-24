<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Movie View</h2>

	<table border="1">
		<tr>
			<th>번호</th>
			<td>${movieInfo.miNum}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${movieInfo.miTitle}</td>
		</tr>
		<tr>
			<th>설명</th>
			<td>${movieInfo.miDesc}</td>
		</tr>
		<tr>
			<th>장르</th>
			<td>${movieInfo.miGenre}</td>
		</tr>
		<tr>
			<th>상영일</th>
			<td>${movieInfo.miCredat}</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${movieInfo.miCnt}</td>
		</tr>
	</table>
</body>
</html>