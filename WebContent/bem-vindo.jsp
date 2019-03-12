<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="br.com.alura.gerenciador.modelo.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
<body>

	Bem Vindo!
	<br />

	<ul>
		<li>${empresa.nome } - <fmt:formatDate
				value="${empresa.dataAbertura }" pattern="dd/MM/yyyy" /> <a
			href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id}">
				editar </a> <a
			href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.id}">
				remover </a>
		</li>
	</ul>

</body>
</html>