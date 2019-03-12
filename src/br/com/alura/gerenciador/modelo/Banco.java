package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	public static Integer chaveSequencial = 1;
	
	static {
		Empresa empresa = new Empresa(chaveSequencial++, "Alura" );
		Empresa empresa2 = new Empresa(chaveSequencial++, "Caelum");
		lista.add(empresa);
		lista.add(empresa2);
	}

	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) {
		Iterator<Empresa> it = lista.iterator();
		while (it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() ==id)
					it.remove();
		}
	}

	public Empresa buscaEmpresaId(Integer id) {
		Iterator<Empresa> it = lista.iterator();
		while (it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() ==id)
					return emp;
		}
		
		return null;
	}

}
