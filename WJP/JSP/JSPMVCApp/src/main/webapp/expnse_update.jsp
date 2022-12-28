<%@page import="com.pooja.service.ExpenseServiceImpl"%>
<%@page import="com.pooja.service.ExpenseService"%>

<jsp:useBean id="expense" class="com.pooja.model.Expense"></jsp:useBean>
<jsp:setProperty property="*" name="expense"/>
<%
	ExpenseService expenseService =new ExpenseServiceImpl();
	expenseService.modify(expense);
	response.sendRedirect("expense_list.jsp");
	
%>