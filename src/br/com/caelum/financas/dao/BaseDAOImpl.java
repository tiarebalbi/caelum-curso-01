package br.com.caelum.financas.dao;

import java.util.List;

import javax.persistence.EntityManager;

public class BaseDAOImpl<T> implements BaseDAO<T>{

	private EntityManager em;
	
	private final Class<T> classe;
	
	public BaseDAOImpl (EntityManager em, Class<T> classe) {
		this.em = em;
		this.classe = classe;
	}
	
	@Override
	public T inserir(T entidade) {
		em.persist(entidade);
		return entidade;
	}

	@Override
	public void excluir(T entidade) {
		em.remove(entidade);
	}

	@Override
	public List<T> lista() {
		String string = "SELECT c FROM "+classe.getName()+" c";
		return em.createQuery(string).getResultList();
	}

	@Override
	public T buscar(Long id) {
		em.find(classe, id);
		
		return null;
	}

	/**
	 * @return the classe
	 */
	public Class<T> getClasse() {
		return classe;
	}

}
