<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
<link rel="stylesheet" href="../../../styles/addEmployeeDesign.css"></link>
</head>
<body>
	<h1>Add Employee</h1>
		<form action="../implementation/addEmployeeImpl.jsp">
			<table>
				<tr>
					<td>Employee ID:</td>
					<td><input type="text" name="employeeId" /></td>
				</tr>
				<tr>
					<td>Employee Name:</td>
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
					<td colspan="2"><input type="submit" value="Add Employee" /></td>
				</tr>
			</table>	
		</form>
</body>
</html>