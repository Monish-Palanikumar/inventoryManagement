<%@ page language="java"
	import="inventoryManagement.dto.Product,inventoryManagement.daoImpl.ProductDaoImpl"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deleting Product</title>
</head>
<body>
	<jsp:useBean id="product" class="inventoryManagement.dto.Product" scope="request"></jsp:useBean>
	<jsp:setProperty property="productId" name="product" param="productId" />
	<%
	ProductDaoImpl productDao = new ProductDaoImpl();
	Boolean b = productDao.delete(product.getProductId());
	if (b)
		response.sendRedirect("../../success.jsp");
	else
		response.sendRedirect("../../error.jsp");
	%>
</body>
</html>