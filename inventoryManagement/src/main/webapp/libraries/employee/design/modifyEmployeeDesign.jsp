<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modify Employee details</title>
<link rel="stylesheet" href="../../../styles/modifyEmployeeDesign.css"></link>
</head>
<body>

	<h1>Modify Employee</h1>
	<form action="../implementation/modifyEmployeeImpl.jsp">
		<table>
			<tr>
				<td>Employee ID:</td>
				<td><input type="text" name="employeeId" /></td>
			</tr>
			<tr>
				<td>New Employee Name:</td>
				<td><input type="text" name="employeeName" /></td>
			</tr>
			<tr>
				<td>Salary:</td>
				<td><input type="text" name="salary" /></td>
			</tr>
			<tr>
				<td>Job Title:</td>
				<td><input type="text" name="jobTitle" /></td>
			</tr>
			<tr style="text-align:center">
				<td colspan="2"><input type="submit" value="Modify Details" /></td>
			</tr>
		</table>
		
	</form>
</body>
</html>