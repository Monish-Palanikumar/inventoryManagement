<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="inventoryManagement.daoImpl.ProductDaoImpl, java.util.*, inventoryManagement.dto.Product"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Product List</title>
<link rel="stylesheet" href="../../../styles/showProductsDesign.css"></link>
</head>
<body>
	<h1>All Products</h1>
	<%
	List<Product> list = new ProductDaoImpl().productList();
	request.setAttribute("list", list);
	%>
	<table border="1">
		<tr>
			<th>Product ID</th>
			<th>Product Name</th>
			<th>Product Price</th>
			<th>Product Availability</th>
		</tr>
		<c:forEach items="${list}" var="prod">
			<tr>
				<td>${prod.productId}</td>
				<td>${prod.productName}</td>
				<td>${prod.productPrice}</td>
				<td>${prod.productAvailability}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>