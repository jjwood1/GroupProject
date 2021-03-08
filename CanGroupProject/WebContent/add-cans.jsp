<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form action = "addCansServlet" method="post">
		Company: <input type ="text" name="company" value="${canToEdit.company}">
		Content: <input type="text" name="content" value="${canToEdit.content}">
		Price: <input type="text" name="price" value="${canToEdit.price}">
		<br />
		Quantity: <input type="text" name="quantity" value="${canToEdit.quantity}">
		<input type ="hidden" name ="id" value="${canToEdit.id}">
		<input type = "submit" value="Add and/or edit cans">
		<br />
		<a href = "index.html">to index</a>
</body>
</html>