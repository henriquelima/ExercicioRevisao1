<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
	<jsp:useBean id="dao" class="br.edu.ifpb.dao.UsuarioDAO"/>   
	
		<h1>Bem vindo,${usuario.nome}</h1>
	
	<form method="post" action="ServletLogout">
		<input type="submit" value="Logout"/>
	</form>
	<table>
	<c:forEach var="usuario" items="${dao.consulta()}"> 
		<tr> 
			<td>${usuario.nome}</td>
			<td>${usuario.email}</td>
			<td>${usuario.senha}</td>		
		</tr>		 
	</c:forEach>	
	</table>
	<form method="post" action="atualizar.jsp">
		<input type="submit" value="Atualizar"/>
	</form>
	
</body>
</html>