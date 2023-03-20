package br.com.loja.controller;

import java.sql.Connection;
import java.util.List;

import br.com.loja.dao.CategoriaDAO;
import br.com.loja.factory.ConnectionFactory;
import br.com.loja.modelo.Categoria;

public class CategoriaController {

	private CategoriaDAO categoriaDAO;

	public CategoriaController() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.categoriaDAO = new CategoriaDAO(connection);
	}

	public List<Categoria> listar() {
		return this.categoriaDAO.listar();
	}
}
