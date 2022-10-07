<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%="Fita Academy" %>
<%=8+6 %>

<% for(int i=1;i<10;i++){ %>

<%=i %>
<br>
<%} %>

Current Time: <%= java.util.Calendar.getInstance().getTime() %> 
</body>
</html>