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
//Bean b = (Bean)session.getAttribute("b");
//String fullname =(String)request.getAttribute("fullname");
//out.println(fullname);

//out.println(b.getFirstname());
//out.println(b.getSecondname());
%>
<jsp:useBean id="b1"  class= "demomyProject.Bean" scope = "request"></jsp:useBean>
<jsp:getProperty property="firstname" name="b1"/>
<jsp:getProperty property="secondname" name="b1"/>


</body>
</html>