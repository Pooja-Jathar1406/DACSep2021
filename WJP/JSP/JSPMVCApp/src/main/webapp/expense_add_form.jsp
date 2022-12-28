<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<meta charset="ISO-8859-1">
<title>Expense Add</title>
</head>
<body>
<div class="container p-5">
	<div class="row ">
		<div class="col ">
			<div class="alert alert-success text-center">
				<h2 >Add Expense</h2>
			</div>
		</div>
	</div>
	<div class="row border m-5">
		<div class="col">
			<form action="expense_add.jsp" method="post">
				<div class="p-3">
				   <label>Item : </label>
				   <!-- name should be equal to names in bean -->
				   <input type="text" name="item" placeholder="Enter Item Name">
				</div>
				<div class="p-3">
				   <label>Price : </label>
				   <input type="text" name="price" placeholder="Enter price">
				</div>
				<div class="p-3">
				   <label>Quantity : </label>
				   <input type="text" name="quantity" placeholder="Enter quantity">
				</div>
				<div class="p-3">
				   <label>Date : </label>
				   <input type="text" name="edate" placeholder="Enter date">
				</div>
				<div class="p-3">
					<button type="submit">Add</button>
				</div>
				
			</form>
		</div>
		<div class="p-3  bg-dark"><a href="expense_list.jsp">Expense list</a> </div>
	</div>
</div>
		
</body>
</html>