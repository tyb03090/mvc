<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Insert</h2>
	<form action="/movie-info/insert" method="POST">
		<input type="text" name="miTitle" id="miTitle" placeholder="제목"><br>
		<textarea type="text" name="miDesc" id="miDesc" placeholder="내용" style="resize: none" cols="22" rows="15"></textarea><br>
		<td>
			<select id="miGenre" name="miGenre">
				<option value="">장르</option>
				<option value="코미디">코미디</option>
				<option value="액션">액션</option>
				<option value="호러">호러</option>
				<option value="S/F">S/F</option>
				<option value="드라마">드라마</option>
				<option value="재난">재난</option>
				<option value="사극">사극</option>
			</select><br>
		</td>
		<input type="text" name="miCnt" id="miCnt" placeholder="관객수"><br>
		<button>등록</button>
	</form>
</body>
</html>