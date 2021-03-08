<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table> 
<c:forEach items="${requestScope.allPurchases}" var="currentpurchases"> 
<tr> 
	<td> <input type = "radio" name="id" value="${currentEmployee.id}"></td>
	<td> ${currentpurchases.can.company}</td>
	<td> ${currentpurchases.can.content}</td>
	<td> ${currentpurchases.can.price}</td>
	<td> ${currentpurchases.employee.name}</td>
	<td> ${currentpurchases.date}</td>
</tr>
</c:forEach>
</table>

			<br />
		<a href = "index.html">to index</a>
</body>
</html>