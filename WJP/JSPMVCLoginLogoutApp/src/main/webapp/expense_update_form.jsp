<%@page import="com.pooja.model.User"%>
<%@page import="com.pooja.model.Expense"%>
<%@page import="com.pooja.service.ExpenseServiceImpl"%>
<%@page import="com.pooja.service.ExpenseService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ include file="cache_control_page.jsp" %> 
 <%
 	String p1=request.getParameter("id");
 	int id= Integer.parseInt(p1);
  	ExpenseService expenseService = new ExpenseServiceImpl();
    Expense expense = expenseService.getById(id);
 %>
 <!-- to check if user obj is present or not -->
<%
	User user=(User)session.getAttribute("user");
	if(user!=null && user.getUname()!=null){
%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Expense Add</title>
<style>
	input, .updatebtn{
	width: 100%;
	padding:5px;
	}
</style>
</head>
<body>
<%@ include file="User_menu.jsp" %>
<div class="container p-5">
	<div class="row ">
		<div class="col ">
			<div class="alert alert-warning text-center">
				<h2 >Update Item</h2>
			</div>
		</div>
	</div>
	<div class="row m-5 justify-content-center">
		<div class="col-md-6 border shadow p-3 mb-5 bg-body rounded">
			<form action="expnse_update.jsp" method="post">
				<input type="hidden" name="id" value="<%=expense.getId() %>">
				<div class="p-3">
				   <label>Item : </label>
				   <!-- name should be equal to names in bean -->
				   <input type="text" name="item" value="<%=expense.getItem() %>">
				</div>
				<div class="p-3">
				   <label>Price : </label>
				   <input type="text" name="price" value="<%=expense.getPrice() %>">
				</div>
				<div class="p-3">
				   <label>Quantity : </label>
				   <input type="text" name="quantity" value="<%=expense.getQuantity()%>">
				</div>
				<div class="p-3">
				   <label>Date : </label>
				   <input type="text" name="edate" value="<%=expense.getEdate() %>">
				</div>
				<div class="p-3">
					<button  type="submit" class="btn btn-success updatebtn">Update</button>
				</div>
		
			</form>
		</div>
	</div>
</div>
	
</body>
</html>
<% }else{
	response.sendRedirect("Logout.jsp");
} %>