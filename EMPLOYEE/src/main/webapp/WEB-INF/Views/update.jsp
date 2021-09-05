<%@page import="com.technoelevate.EMPLOYEECONTROLLER.DTO.EmployeeDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update data</title>
<%EmployeeDetails empd=(EmployeeDetails)session.getAttribute("empd"); %>
</head>
<body>
<h2>Update Data</h2>
<form action="./updated" method="post">
EMPLOYEE ID :<input value="<%=empd.getEmpid()%>" name="empid"><br><br>
FIRST NAME :<input type="text" name="first_name"><br><br>
LAST NAME :<input type="text" name="last_name"><br><br>
USERNAME :<input type="text" name="user"><br><br>
PASSWORD :<input type="text" name="passkey"><br><br>
MOBILE NO. :<input type="text" name="number"><br><br>
<input type="submit"  value="SUBMIT">
</form>
</body>
</html>