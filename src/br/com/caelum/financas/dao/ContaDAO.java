package br.com.caelum.financas.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class ContaDAO implements BaseDAO<Conta>{
	
	private BaseDAO<Conta> dao;
	
	private final EntityManager em;

	private final Class<Conta> classe;
	
	public ContaDAO (EntityManager em, Class<Conta> classe) {
		this.em = em;
		this.classe = classe;
		dao = new BaseDAOImpl<Conta>(em, classe);
	}
	
	@Override
	public Conta inserir(Conta conta) {
		dao.inserir(conta);
		return conta;
	}

	@Override
	public void excluir(Conta entidade) {
		dao.excluir(entidade);
	}

	@Override
	public List<Conta> lista() {
		return dao.lista();
	}

	@Override
	public Conta buscar(Long id) {
		return dao.buscar(id);
	}

	

}
