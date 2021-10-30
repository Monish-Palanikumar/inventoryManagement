<%@ page language="java"
	import="inventoryManagement.dto.Customer,inventoryManagement.daoImpl.CustomerDaoImpl"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deleting Customer</title>
</head>
<body>
	<jsp:useBean id="customer" class="inventoryManagement.dto.Customer" scope="request"></jsp:useBean>
	<jsp:setProperty property="customerId" name="customer" param="customerId" />
	<%
	CustomerDaoImpl customerDao = new CustomerDaoImpl();
	Boolean b = customerDao.delete(customer.getCustomerId());
	if (b)
		response.sendRedirect("../../success.jsp");
	else
		response.sendRedirect("../../error.jsp");
	%>
</body>
</html>