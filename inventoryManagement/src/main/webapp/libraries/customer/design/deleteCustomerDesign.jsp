<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Customer</title>
<link rel="stylesheet" href="../../../styles/deleteCustomerDesign.css">
</head>
<body>
	<h1>Delete Customer</h1>
	
	<form action="../implementation/deleteCustomerImpl.jsp">
	<table>
		<tr>
			<td>Customer ID:</td>
			<td><input type="text" name="customerId" /></td>
		</tr>
		<tr style="text-align:center">
			<td colspan="2"><input type="submit" value="Delete" /></td>
		</tr>
	</table>
	</form>
	
</body>
</html>