<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
PrintWriter ps=response.getWriter();

if(request.getParameter("msg")!=null)
{
	ps.write(request.getParameter("msg"));
}
%>
<body>
<form action="/truck" method="post">
<h3>Truck Loading details</h3><br><br>
<input type="text" name=name placeholder="Enter the Driver Name:"><br><br>
<input type="number" name=capacity placeholder="Enter the Driver capacity:"><br><br>
<input type="number" name=loading placeholder="Enter the Driver load:"><br><br>
<select name=route>
<option>Choose List:</option>
<option>Pune</option>
<option>Mumbai</option>
<option>Karad</option>


</select>
<button type="submit">Load Truck</button>

</form><br>
<button type="submit"><a href="/fetch">See Details</a></button>
</body>
</html>