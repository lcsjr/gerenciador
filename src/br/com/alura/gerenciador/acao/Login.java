package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.impl.AcaoImpl;
import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Usuario;
import br.com.alura.gerenciador.servlet.ControllerServlet;

public class Login implements AcaoImpl{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
		String usuario = request.getParameter("login");
		String senha = request.getParameter("psw");
		
		Banco banco = new Banco();
		Usuario user = banco.buscaUsuario(usuario, senha);
		
		if ( user != null ) {
			System.out.println("Logando.." + user.getLogin() );
			return "redirect:"+ControllerServlet.nomeController+"?acao=ListaEmpresas";	
		}else {
			System.out.println("Acesso negado.");
			return "redirect:"+ControllerServlet.nomeController+"?acao=AcessoNegado";	
		}
		
	}

}
