<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/updatehere" method="post">

<h2>Old Data</h2><br><br>
<input type="hidden" name=id value="${isget.id}"><br><br>
<input type="text" name=name value="${isget.name}"><br><br>
<input type="number" name=capacity value="${isget.capacity}"><br><br>
<input type="number" name=loading value="${isget.loading}"><br><br>
<input type="text" name=route value="${isget.route}"><br><br>
<button type="submit">Change Here</button>


</form>
</body>
</html>