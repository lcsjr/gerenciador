package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.impl.AcaoImpl;
import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class ListaEmpresasOrdenadas implements AcaoImpl{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Listando Empresas Ordem Alfabética...");
		
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		lista.sort( (e1,e2) -> { return e1.getNome().compareTo(e2.getNome());} );
		
		request.setAttribute("empresas", lista);
		
		return "forward:listaEmpresas.jsp";
	}

}
