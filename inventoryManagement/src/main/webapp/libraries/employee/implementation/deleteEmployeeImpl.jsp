<%@ page language="java"
	import="inventoryManagement.dto.Employee,inventoryManagement.daoImpl.EmployeeDaoImpl"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deleting Employee</title>
</head>
<body>
	<jsp:useBean id="employee" class="inventoryManagement.dto.Employee" scope="request"></jsp:useBean>
	<jsp:setProperty property="employeeId" name="employee" param="employeeId" />
	<%
	EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
	Boolean b = employeeDao.delete(employee.getEmployeeId());
	if (b)
		response.sendRedirect("../../success.jsp");
	else
		response.sendRedirect("../../error.jsp");
	%>
</body>
</html>