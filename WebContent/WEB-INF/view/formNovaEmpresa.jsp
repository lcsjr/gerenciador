<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="br.com.alura.gerenciador.servlet.ControllerServlet"%>
<c:url value="/${ControllerServlet.nomeController}" var="linkServletControllerServlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="${linkServletControllerServlet}" method="post">
	
		Nome: <input type="text" name="nome"  />
		Data Abertura: <input type="text" name="data"  />
		<input type="hidden" name="acao" value="NovaEmpresa">
		<input type="submit" />
	</form>

</body>
</html>