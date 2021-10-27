<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Customer</title>
<link rel="stylesheet" href="../../../styles/addCustomerDesign.css"></link>
</head>
<body>
	<h1>Add Customer</h1>
	<form action="../implementation/addCustomerImpl.jsp">
		<table>
			<tr>
				<td>Customer ID:</td>
				<td><input type="text" /></td>
			</tr>
			<tr>
				<td>Customer Name:</td>
				<td><input type="text" /></td>
			</tr>
			<tr>
				<td>Customer Phone:</td>
				<td><input type="text" /></td>
			</tr>
			<tr>
				<td>Customer Age:</td>
				<td><input type="text" /></td>
			</tr>
			<tr style="text-align:center">
				<td colspan="2"><input type="submit" value="Add Customer" /></td>
			</tr>
		</table>
		
	</form>
</body>
</html>