<%@page import="com.pooja.service.StudentServiceImpl"%>
<%@page import="com.pooja.service.StudentService"%>

<jsp:useBean   id="student" class="com.pooja.model.Student"></jsp:useBean>
<jsp:setProperty property="*" name="student"/>
<%
	StudentService studentService=new StudentServiceImpl();
	studentService.add(student);
	response.sendRedirect("Add_student_form.jsp");
%>