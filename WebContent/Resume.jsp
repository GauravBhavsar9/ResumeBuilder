<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resume</title>

<style>
h1 {
	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
	text-transform: uppercase;
	color: turquoise;
}

h2 {
	font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande',
		'Lucida Sans', Arial, sans-serif;
	color: grey;
}

h3 {
	font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande',
		'Lucida Sans', Arial, sans-serif;
}

span {
	font: x-large;
	font-size: 20px;
}

.left, .right {
	vertical-align: top;
	display: inline-block;
}

.left {
	width: 50%;
}

.right {
	text-align: right;
	width: 20%;
}
</style>

</head>
<body>
	<%
		String fname = request.getParameter("fname");
		String mname = request.getParameter("mname");
		String lname = request.getParameter("lname");
		String add = request.getParameter("add");
		String primaryed = request.getParameter("primary");
		String secondaryed = request.getParameter("highersecondary");
		String highered = request.getParameter("higher");
		String jobexp = request.getParameter("exp");
		String profile = request.getParameter("profile");
		String skills = request.getParameter("skills");
		String hobbies = request.getParameter("hobbies");
		String mob = request.getParameter("mob");
		String email = request.getParameter("email");
	%>

	<div style="margin-left: 20px;">
		<h1><%=fname+" "+mname+" "+lname %></h1>
		<h2>Contact Details</h2>

		<h3>Mobile No:</h3>
		<span><%=mob %></span>

		<h3>Email :</h3>
		<span><%=email %></span>
	</div>
	<hr>
	<div class="left" style="margin-left: 20px;">
		<h2>Educational Details</h2>
		<h3>Primary Education:</h3>
		<span><%=primaryed %></span>
		<h3>Higher Secondary :</h3>
		<span><%=secondaryed %></span>
		<h3>Higher Education :</h3>
		<span><%=highered %></span>
	</div>
	<div class="right">
		<h2>Experienced:</h2>
		<span>yes</span>
		<h2>Skills</h2>
		<span><%=skills %></span>
		<h2>Hobbies:</h2>
		<span><%=hobbies %></span>
	</div>

</body>
</html>