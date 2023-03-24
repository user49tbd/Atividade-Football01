<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
input[type=submit]{
}
div{
	align:center;
	margin-left: auto;
	margin-right:auto;
	text-align: center;
}
#maintxt{
	background-color: rgba(0, 95,0, 0.4);
    backdrop-filter: blur(5px);
	font-size:25px;
	color:white;
	width:1300px;
	height:300px;;
}
input[type=submit]{
	border: 2px solid white;
	font-size:50px;
	color:white;
	background-color: rgba(0, 95,0, 0.4);
	transition: background-color 2s;
}
input[type=submit]:hover{
	background-color: rgba(255, 255,255, 0.4);
}
</style>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>
<br>
<div id="maintxt">
<p><b>BD-ATIVIDADE01</b></p>
<br>
<form action="GruposServlet" method="get">
<input type="submit" name="rodgen" id="rodgen" class="rodgen" value="Gerar Rodadas">
</form>
</div>
</body>
</html>