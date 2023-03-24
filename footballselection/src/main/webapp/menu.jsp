<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<style>
body{
	background-image: url("./IMG/Header_Soccer.jpg");
	background-repeat: no-repeat;
	background-size: 100% 700px;
}
b{
	font-size:120px;
	border-bottom: 2px solid white;
}
nav {
	display:flex;
	justify-content:left;
	border-bottom: 2px solid white;
}
ul{
	list-style:none;
	display:flex;
	justify-content:left;
	padding:0px;
}
a{
	text-decoration:none;
	color: white;
	padding:10px;
	background-color: none;
	transition:background-color 2s;
}
a:hover{
	background-color: white;
   	color:green;
}
</style>
</head>
<body>
<nav>
<ul>
<li><a href="index.jsp">Home</a></li>
<li><a href="grupos.jsp">Grupos</a></li>
<li><a href="times.jsp">Times</a></li>
<li><a href="rodadas.jsp">Rodadas</a></li>
</ul>
</nav>
</body>
</html>