<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modify Customer details</title>
<link rel="stylesheet" href="../../../styles/modifyCustomerDesign.css"></link>
</head>
<body>
	
	<h1>Modify Customer</h1>
	<form action="../implementation/modifyCustomerImpl.jsp">
		<table>
			<tr>
				<td>Customer ID:</td>
				<td><input type="text" name="customerId" /></td>
			</tr>
			<tr>
				<td>New Customer Name:</td>
				<td><input type="text" name="customerName" /></td>
			</tr>
			<tr>
				<td>New Customer Phone:</td>
				<td><input type="text" name="customerPhone" /></td>
			</tr>
			<tr>
				<td>New Customer Age:</td>
				<td><input type="text" name="customerAge" /></td>
			</tr>
			<tr style="text-align:center">
				<td colspan="2"><input type="submit" value="Modify Details" /></td>
			</tr>
		</table>
		
	</form>
</body>
</html>