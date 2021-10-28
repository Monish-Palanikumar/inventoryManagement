<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modify Employee Details</title>
<link rel="stylesheet" href="../../../styles/modifyProductDesign.css"></link>
</head>
<body>
	<h1> Modify Employee</h1>
	
	<form action="../implementation/modifyProducImpl.jsp">
		<table>
			<tr>
				<td> Product ID:</td>
				<td><input type="text" name="productId" /></td>
			</tr>
			<tr>
				<td>New Product Name:</td>
				<td><input type="text" name="productName" /></td>
			</tr>
			<tr>
				<td>New Product Prize:</td>
				<td><input type="text" name="productPrize" /></td>
			</tr>
			<tr>
				<td>New Product Availability:</td>
				<td><input type="text" name="productAvailability" /></td>
			</tr>
			<tr style="text-align:center">
				<td colspan="2"><input type="submit" value="Modify Details" /></td>
			</tr>
		</table>
		
	</form>
</body>
</html>