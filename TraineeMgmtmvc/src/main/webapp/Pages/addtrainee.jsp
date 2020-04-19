<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Enter Trainee Details</h3>
<form method="get" action="processtrainee">
	Trainee Id<input type="number" id="id" name="traineeid"><br>
	Trainee Name<input type="text" id="nameid" name="traineename"><br>
	Trainee Location<input type="radio" name="loc">Chennai
	<input type="radio" name="loc">Bangalore<br>
	TraineeDomain<select name="domain">
		<option>Java</option>
		<option>Python</option>
		<option>Android</option>
	</select><br>
	<input type="submit" value="Add Employee">
</form>
</body>
</html>