<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.mvc.repository.BrandListRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	BrandListRepository blRepo = new BrandListRepository();

	List<Map<String, String>> brandInfoList = blRepo.selectBrandList();

	for (Map<String, String> brandList : brandInfoList) {
	%>

	<%
	}
	%>
</body>
</html>