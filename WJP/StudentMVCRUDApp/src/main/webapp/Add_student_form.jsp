<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>
<body>
<div class="container p-5">
	<div class="row">
		<div class="col">
			<div class="alert alert-success">
			 	<h1>Add new Student</h1>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-4">
			 <form action="Add_Student.jsp" method="post">
			 	 <div class="mb-3">
				    <label class="form-label">Roll</label>
				    <input type="text" class="form-control" name="roll" placeholder="Enter roll no ">
				  </div>
				  <div class="mb-3">
				    <label class="form-label">Name</label>
				    <input type="text" class="form-control" name="name" placeholder="Enter roll no ">
				  </div>
				  <div class="mb-3">
				    <label class="form-label">Marks</label>
				    <input type="text" class="form-control" name="marks" placeholder="Enter roll no ">
				  </div>
				  <div class="mb-3">
				    <label class="form-label">Std</label>
				    <input type="text" class="form-control" name="std" placeholder="Enter roll no ">
				  </div>
				  <div class="mb-3">
				    <label class="form-label">City</label>
				    <input type="text" class="form-control" name="city" placeholder="Enter roll no ">
				  </div>
				  <button type="submit" class="btn btn-success">Save</button>
			 </form>
		</div>
	</div>
</div>
</body>
</html>