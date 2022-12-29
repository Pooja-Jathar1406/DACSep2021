<%@page import="com.pooja.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ include file="cache_control_page.jsp" %> 
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
<title>Insert title here</title>
</head>
<body>
<%@ include file="User_menu.jsp" %>
	<div class="container p-5 ">
		<div class="row ">
			<div class="col ">
				<div class="alert alert-success text-center">
					<h2 >Welcome Home!!</h2>
				</div>
				
			</div>
		</div>
	 
		<div class="row m-3 justify-content-center">
			<h3>Hello <%=user.getUname() %>!!!</h3>
			<h3>You have logged in successfully!!!</h3>
		</div>
		<div>
			<!-- Button trigger modal -->
			<button type="button" class="btn btn-success" data-bs-toggle="modal" data-bs-target="#exampleModal">
			  Upload your image
			</button>
			
			<!-- Modal -->
			<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
			  <div class="modal-dialog odal-dialog-centered">
			    <div class="modal-content">
			      <div class="modal-header">
			        <h5 class="modal-title" id="exampleModalLabel">Select image</h5>
			        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
			      </div>
			      <div class="modal-body">
			        <form action="UploadImgServlet" method="post" ecctype="multipart/form-data">
						<div class="p-3">
						   <label>Choose file : </label>
						   <!-- name should be equal to names in bean -->
						   <input type="file" name="image" >
						</div>
					
			      <div class="modal-footer">
			        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
			        <button type="submit" class="btn btn-primary">Upload</button>
			      </div>
			      </form>
			      </div>
			    </div>
			  </div>
			</div>
		</div>
	</div>
</body>
</html>


<%}else{
	response.sendRedirect("Logout.jsp");
} %>
