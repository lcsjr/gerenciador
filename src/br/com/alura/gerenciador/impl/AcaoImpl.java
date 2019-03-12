package br.com.alura.gerenciador.impl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface AcaoImpl {
	
	String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException ;

}
