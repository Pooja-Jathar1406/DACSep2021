<%@page import="com.pooja.model.Expense"%>
<%@page import="java.util.List"%>
<%@page import="com.pooja.service.ExpenseServiceImpl"%>
<%@page import="com.pooja.service.ExpenseService"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
	ExpenseService expenseService = new ExpenseServiceImpl();

	//data which we want to show in this page will be received in List of Exppense obj 
    List<Expense>  expenses= expenseService.getAll(0);
%>    

<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<meta charset="ISO-8859-1">
<title>Expense List</title>
</head>
<body>

<div class="container p-5">
	<div class="row ">
		<div class="col ">
			<div class="alert alert-primary text-center">
				<h2 >Expenses List</h2>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col ">
			<table class="table table-striped table-bordered">
				<thead >
					<tr>
					    <th>Item</th>
					    <th>Price</th>
					    <th>Quantity</th>
					    <th>Date</th>
					    <th>Delete</th>
					    <th>Update</th>
					</tr>
				</thead>
				<tbody>
					<!--  data is present in List so to traverse it use fro each loop  -->
					
					<%  for(Expense expense:expenses){ %>
					<tr>
						<td><%=expense.getItem() %></td>
						<td><%=expense.getPrice() %></td>
						<td><%=expense.getQuantity() %></td>
						<td><%=expense.getEdate() %></td>
						<td><a href="expense_delete.jsp?id=<%=expense.getId()%>">Delete</a> </td> 
						<td><a href="expense_update_form.jsp?id=<%=expense.getId()%>">Update</a> </td> 
					
					</tr>
					<% } %>
				</tbody>
			</table>
			<div class="p-3  bg-dark"><a href="expense_add_form.jsp">Add expense</a> </div>
		</div>
	</div>
</div>
			
</body>
</html>