<%@page import="com.pooja.service.UserServiceImpl"%>
<%@page import="com.pooja.service.UserService"%>
<jsp:useBean id="user" class="com.pooja.model.User"></jsp:useBean>
<jsp:setProperty property="*" name="user"/>

<%
	UserService userService=new UserServiceImpl();
	userService.register(user);
	response.sendRedirect("User_login_form.jsp");

%>