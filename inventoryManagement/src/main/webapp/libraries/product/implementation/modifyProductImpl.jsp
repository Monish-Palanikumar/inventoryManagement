<%@ page language="java"
	import="inventoryManagement.dto.Product,inventoryManagement.daoImpl.ProductDaoImpl"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modifying Product</title>
</head>
<body>
	<jsp:useBean id="product" class="inventoryManagement.dto.Product"></jsp:useBean>
	<jsp:setProperty property="*" name="product" />
	<%
	Boolean b = new ProductDaoImpl().update(product);
	if (b)
		response.sendRedirect("../../success.jsp");
	else
		response.sendRedirect("../../error.jsp");
	%>
</body>
</html>