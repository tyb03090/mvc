<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Input</h2>
<form id="frm" action="/calc/p">
	<input type="text" name="num1">
	<select onchange="changeOp(this)">
		<option value="p">+</option>
		<option value="s">-</option>
		<option value="m">x</option>
		<option value="d">/</option>
	</select>
	<input type="text" name="num2"><br>
	
	<button>계산</button>
</form>
<script>
function changeOp(obj){
	var action = '/calc/' + obj.value;
	document.getElementById('frm').action = action;
}
</script>
</body>
</html>