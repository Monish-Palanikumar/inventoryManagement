<%@ page language="java" import="inventoryManagement.dto.Employee,inventoryManagement.daoImpl.EmployeeDaoImpl" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding Employee</title>
</head>
<body>
	<jsp:useBean id="employee" class="inventoryManagement.dto.Employee"></jsp:useBean>
	<jsp:setProperty property="*" name="employee" />
	<%
		EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
		Boolean b = employeeDao.add(employee);
		if (b)
			response.sendRedirect("../../success.jsp");
		else
			response.sendRedirect("../../error.jsp");
	%>
</body>
</html>