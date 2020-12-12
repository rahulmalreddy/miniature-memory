<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="b1"  class= "demomyProject.Bean" scope = "request"></jsp:useBean>
<jsp:setProperty property="firstname" name="b1" value= '<%= request.getParameter("Firstname") %>'/>
<jsp:setProperty property="secondname" name="b1" value= '<%= request.getParameter("Secondname") %>'/>

<%

RequestDispatcher rd = request.getRequestDispatcher("loginnow.jsp");
//session.setAttribute("b",b);
rd.forward(request,response);
%> 


</body>
</html>