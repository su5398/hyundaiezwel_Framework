<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>update</h1>
	<form action="update.do" method="post">
		<input type="hidden" name="myno" value="${dto.myno }">
		<table>
			<tr>
				<th>WRITER</th>
				<td>${dto.myname }</td>
			</tr>
			<tr>
				<th>TITLE</th>
				<td><input type="text" name="mytitle" value="${dto.mytitle }"></td>
			</tr>
			<tr>
				<th>CONTENT</th>
				<td><textarea rows="10" cols="40" name="mycontent">${dto.mycontent }</textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="submit" value="완료">
					<input type="button" value="취소" onclick="location.href='detail.do?myno=${dto.myno}'">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>