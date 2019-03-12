package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;

public class RemoveEmpresa {

	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

		Integer id = Integer.valueOf(request.getParameter("id"));
		
		Banco banco = new Banco();
		banco.removeEmpresa(id);
		
		response.sendRedirect("entrada?acao=ListaEmpresas");
	}

}