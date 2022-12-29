<% 
	session.removeAttribute("user");
	session.invalidate();
	response.sendRedirect("User_login_form.jsp");
%>