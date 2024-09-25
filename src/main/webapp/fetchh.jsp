<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<button type="submit"><a href="index.jsp">Back</a></button>
<table border="2">
<tr>
<th>ID</th>
<th>NAME</th>
<th>CAPACITY</th>
<th>LOAD</th>
<th>ROUTE</th>
<th>Delivery</th>
<th>Update_Order</th>
<th>Delete_Order</th>


</tr>
<c:forEach var="std" items="${isdata}">

<tr>

<td>${std.id}</td>
<td>${std.name}</td>
<td>${std.capacity}</td>
<td>${std.loading}</td>
<td>${std.route}</td>
<td><a href="/delivery/${std.id}">Delivery Start</a></td>
<td><a href="<c:url value='/${std.id}'/>">Update_Delevery</a></td>
<td><a href="<c:url value='/del/${std.id}'/>">Delete_Delivery</a></td>

</tr>
</c:forEach>
</table>
</body>
</html>