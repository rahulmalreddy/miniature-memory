<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="demomyProject.dao.Usedao"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="u" class="demomyProject.bean.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
Usedao.delete(u);  
response.sendRedirect("viewusers.jsp");  
%>  

</body>
</html>