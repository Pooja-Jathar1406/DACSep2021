<%@page import="com.pooja.service.UserServiceImpl"%>
<%@page import="com.pooja.service.UserService"%>
<jsp:useBean id="user" class="com.pooja.model.User" scope="session"></jsp:useBean> 
<jsp:setProperty property="*" name="user"/>

<%
	UserService userService=new UserServiceImpl();
	boolean b=userService.login(user);
	if(b){
		response.sendRedirect("UserHome.jsp");
		
	}
	else{
		response.sendRedirect("User_login_form.jsp?msg=Incorrect username/password!");
	}
%>