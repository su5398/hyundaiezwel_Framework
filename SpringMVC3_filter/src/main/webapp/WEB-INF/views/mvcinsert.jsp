<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>insert</h1>
	<form action="insert.do" method="post">
		<table>
			<tr>
				<th>WRITER</th>
				<td><input type="text" name="myname"></td>
			</tr>
			<tr>
				<th>TITLE</th>
				<td><input type="text" name="mytitle"></td>
			</tr>
			<tr>
				<th>CONTENT</th>
				<td><textarea rows="10" cols="40" name="mycontent"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="submit" value="완료">
					<input type="button" value="취소" onclick="location.href='list.do'">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>