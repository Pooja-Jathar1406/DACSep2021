<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<meta charset="ISO-8859-1">
<title>user login form</title>
<style>
	input, .loginbtn{
	width: 100%;
	padding:5px;
	}
</style>
</head>
<body>
<div class="container p-5 ">
	<div class="row ">
		<div class="col ">
			<div class="alert alert-success text-center">
				<h2 >Login Form</h2>
			</div>
			
		</div>
	</div>
	 
	<div class="row m-5 justify-content-center">
		<div class="col-md-6 border shadow p-3 mb-5 bg-body rounded">
			<form action="User_login.jsp" method="post" class="p-4">
				<div class="p-2">
				   <label>User name : </label>
				   <br>
				   <!-- name should be equal to names in bean -->
				   <input type="text" name="uname" placeholder="Enter Name">
				</div>
				<div class="p-2">
				   <label>Password : </label>
				   <br>
				   <input type="password" name="upass" placeholder="Enter password">
				</div>
			
				<div class=" p-2 pt-4 pb-4">
					<button class="loginbtn btn btn-success p-2" type="submit">Login</button>
				</div>
				<div class="text-center">
					<a href="User_reg_form.jsp">New user? Register yourself</a>
				</div>
				
			</form>
		</div>
	</div>
</div>
		
</body>
</html>