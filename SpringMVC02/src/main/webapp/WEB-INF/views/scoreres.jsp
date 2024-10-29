<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Score</h1>
	<table>
		<tr>
			<th>name</th>
			<th>kor</th>
			<th>eng</th>
			<th>math</th>
		</tr>
		<tr>
			<th>${dto.name }</th>
			<th>${dto.kor }</th>
			<th>${dto.eng }</th>
			<th>${dto.math }</th>
		</tr>
	</table>
</body>
</html>