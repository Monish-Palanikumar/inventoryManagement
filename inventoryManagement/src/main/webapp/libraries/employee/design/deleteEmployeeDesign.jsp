<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Employee</title>
<link rel="stylesheet" href="../../../styles/deleteEmployeeDesign.css">
</head>
<body>
	<h1>Delete Employee</h1>
	
	<form action="../implementation/deleteEmployeeImpl.jsp">
	<table>
		<tr>
			<td>Employee ID:</td>
			<td><input type="text" name="customerId" /></td>
		</tr>
		<tr style="text-align:center">
			<td colspan="2"><input type="submit" value="Delete" /></td>
		</tr>
	</table>
	</form>
	
</body>
</html>