<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro</title>
</head>
<body>
	<form method="post" action="ServletCadastro">
		Nome: <input type="text" name="nome"/><br>
		Email: <input type="text" name="email"/><br>
		Senha: <input type="password" name="senha"/><br>
		<input type="submit" value="Enviar"/>		
	</form>
	<a href="login.jsp"> Login</a>
</body>
</html>