
<%@page import="com.pooja.service.ExpenseServiceImpl"%>
<%@page import="com.pooja.service.ExpenseService"%>
<%
	String p1=request.getParameter("id");
	int id=Integer.parseInt(p1);
	
	ExpenseService expenseService = new ExpenseServiceImpl();
	expenseService.removeById(id);
	response.sendRedirect("expense_list.jsp");
%>