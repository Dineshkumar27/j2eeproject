	<jsp:useBean id="u" class="com.fita.User" scope="session"></jsp:useBean>  
Secondpage:<br>  
<jsp:getProperty property="name" name="u"/><br>  
<jsp:getProperty property="password" name="u"/><br>  
<jsp:getProperty property="email" name="u" /><br>  