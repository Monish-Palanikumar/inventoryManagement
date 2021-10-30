<%@ page language="java"
	import="inventoryManagement.daoImpl.CustomerDaoImpl, java.util.*, inventoryManagement.dto.Customer"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Customer</title>
<link rel="stylesheet" href="../../../styles/showCustomersDesign.css"></link>
</head>
<body>
	<h1>All Customers</h1>
	<%
	List<Customer> list = new CustomerDaoImpl().customerList();
	request.setAttribute("list", list);
	%>
	<table border="1">
		<tr>
			<th>Customer ID</th>
			<th>Customer Name</th>
			<th>Customer Age</th>
			<th>Customer Phone Number</th>
		</tr>
		<c:forEach items="${list}" var="cust">
			<tr>
				<td>${cust.customerId}</td>
				<td>${cust.customerName}</td>
				<td>${cust.customerAge}</td>
				<td>${cust.customerPhone}</td> 
			</tr>
		</c:forEach>
	</table>
</body>
</html>