package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
		String saida = null;
		
		if (acao.equals("ListaEmpresas")) {
			saida = new ListaEmpresas().execute(request, response);
		}else if (acao.equals("NovaEmpresa")) {
			saida = new NovaEmpresa().execute(request, response);
		}else if (acao.equals("RemoveEmpresa")) {
			saida = new RemoveEmpresa().execute(request, response);
		}else if (acao.equals("AlteraEmpresa")) {
			saida = new AlteraEmpresa().execute(request, response);
		}else if (acao.equals("MostraEmpresa")) {
			saida = new MostraEmpresa().execute(request, response);
		}
		
		String[] tipoSaida = saida.split(":");
		if(tipoSaida[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher(tipoSaida[1]);
			rd.forward(request, response);
		} else if (tipoSaida[0].equals("redirect")) {
			response.sendRedirect(tipoSaida[1]);
		}

	
	}

}
