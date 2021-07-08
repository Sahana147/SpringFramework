<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Spring MVC world..</h1>
	<h2>${ResponseMessage}</h2>
	<form action="mobile.do" method ="post">
		<pre>
        <label>Name</label><input type="text" name="mobileName">
        <label>Brand</label><input type="text" name="mobileBrand">
        <label>RAM</label><input type="number" name="ram">
        <label>Cost</label><input type="number" name="cost">
        </pre>
        <input type = "submit" value= "submit">
    </form>
        
</body>
</html>