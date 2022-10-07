<html>  
<body>  
<%! int data=50; 

int printData(){
	return ++data;
}
%>  
<%= "Value of the variable is:"+data %>  
<br>
<%=printData() %>

</body>  
</html>  