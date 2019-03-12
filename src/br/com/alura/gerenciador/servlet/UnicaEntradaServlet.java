package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acao.AlteraEmpresa;
import br.com.alura.gerenciador.acao.ListaEmpresas;
import br.com.alura.gerenciador.acao.MostraEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresa;
import br.com.alura.gerenciador.acao.RemoveEmpresa;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String acao = request.getParameter("acao");
		
		if (acao.equals("ListaEmpresas")) {
			new ListaEmpresas().execute(request, response);
		}else if (acao.equals("NovaEmpresa")) {
			new NovaEmpresa().execute(request, response);
		}else if (acao.equals("RemoveEmpresa")) {
			new RemoveEmpresa().execute(request, response);
		}else if (acao.equals("AlteraEmpresa")) {
			new AlteraEmpresa().execute(request, response);
		}else if (acao.equals("MostraEmpresa")) {
			new MostraEmpresa().execute(request, response);
		}
	
	}

}
