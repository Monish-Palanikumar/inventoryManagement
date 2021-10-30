<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Product</title>
<link rel="stylesheet" href="../../../styles/deleteProductDesign.css">
</head>
<body>
	<h1>Delete Product</h1>

	<form action="../implementation/deleteProductImpl.jsp">
		<table>
			<tr>
				<td>Product ID:</td>
				<td><input type="text" name="productId" /></td>
			</tr>
			<tr style="text-align: center">
				<td colspan="2"><input type="submit" value="Delete" /></td>
			</tr>
		</table>
	</form>

</body>
</html>