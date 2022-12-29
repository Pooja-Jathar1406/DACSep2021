<!--controller -->

<!-- if you don't specify the scope in useBean, by default it is page  -->

<%@page import="com.pooja.service.ExpenseServiceImpl"%>
<%@page import="com.pooja.service.ExpenseService"%>

<!--  creating bean object using useBean  -->

<jsp:useBean   id="expense" class="com.pooja.model.Expense"></jsp:useBean>
<jsp:setProperty property="*" name="expense"/>

<!-- whatever data entered by user will be stored in bean obj 
bcz of useBean and setProperty tags -->

 
<%
	//when we create obj of ExpenseServiceImpl, its constructor will be 
	//called(which is written in ExpenseServiceImpl) 
	//and ExpenseDao obj is created
	ExpenseService expenseService = new ExpenseServiceImpl();

	//expense is a bean obj which contains all the infro entered by user
	//calling add method of expenseService by passing this object
	expenseService.add(expense);                 
	response.sendRedirect("expense_add_form.jsp");
%>