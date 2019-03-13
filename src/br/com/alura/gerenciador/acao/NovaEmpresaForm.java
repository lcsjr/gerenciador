package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.impl.AcaoImpl;

public class NovaEmpresaForm implements AcaoImpl {

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		return "forward:formNovaEmpresa.jsp";
	}
}
