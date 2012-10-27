package br.com.caelum.financas.dao;

import java.util.List;

public interface BaseDAO<T> {
	
	 T inserir(T entidade);
	 
	 void excluir(T entidade);
	 
	 List<T> lista();
	 
	 T buscar(Long id);
}
