<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#tab1{
	font-size:40px;
	color:white;
	text-align:center;
	width: 50%;
}
input[type=submit]{
	height: 100%;
	font-size:30px;
	width: 100%;
	border: 2px solid white;
	color:white;
	background-color: rgba(0, 95,0, 0.4);
	transition: background-color 2s;
}
input[type=submit]:hover{
	background-color: rgba(255, 255,255, 0.4);
}
#maintxt{
	background-color: rgba(0, 95,0, 0.4);
    -webkit-backdrop-filter: blur(5px);
    backdrop-filter: blur(5px);
	color:white;
}
</style>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>
<div align="center">
<form action="Times" method="post">
<table id="tab1">
<tr>
<td><p>Listar times</p></td>
</tr>
<tr>
<td><input type="submit" name="btl" id="btl" value="LISTAR TIMES"></td>
</tr>
</table>
</form>
</div>

<br>

<div align="center">
<c:if test="${not empty Lista}">
<table border="1" id="maintxt">
<thead>
<tr>
<td>Nome do Time</td>
<td>Cidade</td>
<td>Estadio</td>
<td>Material</td>
</tr>
</thead>
<tbody>
<c:forEach items="${Lista}" var="c">
<tr>
<td><c:out value="${c.nomeTime}"></c:out></td>
<td><c:out value="${c.cidade}"></c:out></td>
<td><c:out value="${c.estadio}"></c:out></td>
<td><c:out value="${c.material}"></c:out></td>
</tr>
</c:forEach>
</tbody>
</table>
</c:if>
</div>
</body>
</html>