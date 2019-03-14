<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="br.com.alura.gerenciador.servlet.ControllerServlet"%>
<c:url value="/${ControllerServlet.nomeController}"
	var="linkServletControllerServlet" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="${linkServletControllerServlet}" method="post">

		Login: <input type="text" name="login" /> 
		Senha: <input type="password" name="psw" /> 
		<input type="hidden" name="acao"value="Login"> 
		<input type="submit" />
	</form>

</body>
</html>