<%@page import="com.technoelevate.EMPLOYEECONTROLLER.DTO.EmployeeDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> EMPLOYEE DETAILS</title>
<%EmployeeDetails empd=(EmployeeDetails)session.getAttribute("empd"); %>
</head>
<body>
<h2>DETAILS</h2>
EMPLOYEE ID :<%=empd.getEmpid() %><br><br>
FIRST NAME :<%=empd.getFirst_name()%><br><br>
LAST NAME :<%=empd.getLast_name() %><br><br>
USERNAME :<%=empd.getUser() %><br><br>
PASSWORD :<%=empd.getPasskey() %><br><br>
MOBILE NO. :<%=empd.getNumber() %><br><br>
<form action="./logout" method="post">
<input type="submit" value="LOGOUT">
</form>
</body>
</html>