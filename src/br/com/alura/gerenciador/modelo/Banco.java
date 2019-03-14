package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> listaEmpresa = new ArrayList<>();
	private static List<Usuario> listaUsuario = new ArrayList<>();
	public static Integer chaveSequencial = 1;
	
	static {
		listaEmpresa.add(new Empresa(chaveSequencial++, "Caelum"));
		listaEmpresa.add(new Empresa(chaveSequencial++, "Alura" ));
		
		listaUsuario.add(new Usuario("Luiz","123"));
		listaUsuario.add(new Usuario("Davi","456"));
	}

	public void adiciona(Empresa empresa) {
		Banco.listaEmpresa.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.listaEmpresa;
	}

	public void removeEmpresa(Integer id) {
		Iterator<Empresa> it = listaEmpresa.iterator();
		while (it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() ==id)
					it.remove();
		}
	}

	public Empresa buscaEmpresaId(Integer id) {
		Iterator<Empresa> it = listaEmpresa.iterator();
		while (it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() ==id)
					return emp;
		}
		
		return null;
	}

	public Usuario buscaUsuario(String login, String senha) {
		Iterator<Usuario> it = listaUsuario.iterator();
		while (it.hasNext()) {
			Usuario user = it.next();
			if(user.getLogin().equals(login)) {
				if ( user.valida(senha) )
					return user;
			}
		}

		return null;
	}

}
