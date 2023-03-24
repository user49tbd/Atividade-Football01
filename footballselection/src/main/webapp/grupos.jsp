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
.divflex{
	display: flex;
	justify-content: space-evenly;
	color: white;
	width: 100%;
}

#la{
	border-block: 1px solid white;
	background-clip:content-box;
	background-color: rgba(49,49,0, 0.4);
}
#lb{
	border-block: 1px solid white;
	background-clip:content-box;
	background-color: rgba(149,0,0, 0.4);
}
#lc{
	border-block: 1px solid white;
	background-clip:content-box;
	background-color: rgba(0,0,149, 0.4);
}
#ld{
	border-block: 1px solid white;
	background-clip:content-box;
	background-color: rgba(0, 71, 2, 0.4);
}
table {
  table-layout: fixed ;
  width: 100% ;
  height: 100% ;
  border-right-width: 20px;
  border-color: rgba(0,0,0,0);
  border-left-width: 20px;
}
td {
  width: 20% ;
  heigth: 20%;
}
</style>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>
<div align="center">
<form action="GruposServlet" method="post">
<table id="tab1">
<tr>
<td><p>Listar Grupos</p></td>
</tr>
<tr>
<td><input type="submit" name="btl" id="btl" value="LISTAR GRUPOS"></td>
</tr>
</table>
</form>
</div>
<br>

<div class="divflex">
<div align="center">
<c:if test="${not empty ListaA}">
<table border="1" id="la">
<thead>
<tr>
<td>Nome do Time</td>
<td>Grupo</td>
</tr>
</thead>
<tbody>
<c:forEach items="${ListaA}" var="a">
<tr>
<td><c:out value="${a.nomeTime}"></c:out></td>
<td><c:out value="${a.grupo}"></c:out></td>
</tr>
</c:forEach>
</tbody>
</table>
</c:if>
</div>
<div align="center">
<c:if test="${not empty ListaB}">
<table border="1" id="lb">
<thead>
<tr>
<td>Nome do Time</td>
<td>Grupo</td>
</tr>
</thead>
<tbody>
<c:forEach items="${ListaB}" var="b">
<tr>
<td><c:out value="${b.nomeTime}"></c:out></td>
<td><c:out value="${b.grupo}"></c:out></td>
</tr>
</c:forEach>
</tbody>
</table>
</c:if>
</div>
<div align="center">
<c:if test="${not empty ListaC}">
<table border="1" id="lc">
<thead>
<tr>
<td>Nome do Time</td>
<td>Grupo</td>
</tr>
</thead>
<tbody>
<c:forEach items="${ListaC}" var="c">
<tr>
<td><c:out value="${c.nomeTime}"></c:out></td>
<td><c:out value="${c.grupo}"></c:out></td>
</tr>
</c:forEach>
</tbody>
</table>
</c:if>
</div>
<div align="center">
<c:if test="${not empty ListaD}">
<table border="1" id="ld">
<thead>
<tr>
<td>Nome do Time</td>
<td>Grupo</td>
</tr>
</thead>
<tbody>
<c:forEach items="${ListaD}" var="d">
<tr>
<td><c:out value="${d.nomeTime}"></c:out></td>
<td><c:out value="${d.grupo}"></c:out></td>
</tr>
</c:forEach>
</tbody>
</table>
</c:if>
</div>
</div>

</body>
</html>