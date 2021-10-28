<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
<link rel="stylesheet" href="../../../styles/addProductDesign.css"></link>
</head>
<body>
	<h1>Add Product</h1>
		<form action="../implementation/addProductImpl.jsp">
			<table>
				<tr>
					<td>Product ID:</td>
					<td><input type="text" name="productId" /></td>
				</tr>
				<tr>
					<td>Product Name:</td>
					<td><input type="text" name="productName" /></td>
				</tr>
				<tr>
					<td>Product Price:</td>
					<td><input type="text" name="productPrice" /></td>
				</tr>
				<tr>
					<td>Product Availability:</td>
					<td><input type="text" name="productAvailability" /></td>
				</tr>
				<tr style="text-align:center">
					<td colspan="2"><input type="submit" value="Add Product" /></td>
				</tr>
			</table>	
		</form>
</body>
</html>