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
input{
	height: 100%;
	font-size:30px;
	width: 100%;
	border: 2px solid white;
	color:white;
	background-color: rgba(0, 95,0, 0.4);
	transition: background-color 2s;
}
input:hover{
	background-color: rgba(255, 255,255, 0.4);
}
#maintxt{
	background-color: rgba(0, 95,0, 0.4);
    -webkit-backdrop-filter: blur(5px);
    backdrop-filter: blur(5px);
	color:white;
}
#txt{
	color:white;
	font-size:50px;
}
</style>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>
<br>
<div align="center">
<form action="RodadaServ" method="post">
<table border="1">
<tr>
<td><input type="date" id="datatxt" class="datatxt" name="datatxt" required></td>
<td><input type="submit" id="btd" class="btd" value="Listar Rodada"></td>
</tr>
</table>
</form>
</div>
<br>
<div align="center" id="txt">
<c:if test="${not empty msg }">
<c:out value="${msg }"></c:out>
</c:if>
</div>
<br>
<div align="center">
<c:if test="${not empty list }">
<table border="1" id="maintxt">
<thead><tr><th>Time_A</th><th>Gols_A</th><th>Time_B</th><th>Gols_B</th>
<th>Data</th></tr></thead><tbody>
<c:forEach items="${list }" var="a">
<tr><td><c:out value="${a.timeNomeA }"></c:out></td>
<td><c:out value="${a.golsA }"></c:out></td>
<td><c:out value="${a.timeNomeB}"></c:out></td>
<td><c:out value="${a.golsB }"></c:out></td>
<td><c:out value="${a.data }"></c:out></td>
</tr>
</c:forEach></tbody></table>
</c:if>
</div>
</body>
</html>