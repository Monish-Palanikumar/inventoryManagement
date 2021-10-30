<%@ page language="java"
	import="inventoryManagement.daoImpl.EmployeeDaoImpl, java.util.*, inventoryManagement.dto.Employee"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Employee</title>
<link rel="stylesheet" href="../../../styles/showEmployeesDesign.css"></link>
</head>
<body>
	<h1>All Employees</h1>
	<%
	List<Employee> list = new EmployeeDaoImpl().employeeList();
	request.setAttribute("list", list);
	%>
	<table border="1">
		<tr>
			<th>Employee ID</th>
			<th>Employee Name</th>
			<th>Employee Salary</th>
			<th>Job Title</th>
		</tr>
		<c:forEach items="${list}" var="empl">
			<tr>
				<td>${empl.employeeId}</td>
				<td>${empl.employeeName}</td>
				<td>${empl.salary}</td>
				<td>${empl.jobTitle}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>