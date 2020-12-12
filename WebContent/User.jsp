<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "demomyProject.Bean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name = request.getParameter("name");
String password = request.getParameter("password");

Bean br = new Bean();
br.setName(name);
br.setPassword(password);




%>
<%= out.println(br.getName()) %>
<%= out.println(br.getPassword()) %>

</body>
</html>