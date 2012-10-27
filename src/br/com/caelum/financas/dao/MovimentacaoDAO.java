package br.com.caelum.financas.dao;

import java.util.List;
import javax.persistence.EntityManager;
import br.com.caelum.financas.modelo.Movimentacao;

public class MovimentacaoDAO implements BaseDAO<Movimentacao>{

	private BaseDAO<Movimentacao> dao;

	private final EntityManager em;

	private final Class<Movimentacao> classe;

	public MovimentacaoDAO (EntityManager em, Class<Movimentacao> classe) {
		this.em = em;
		this.classe = classe;
		dao = new BaseDAOImpl<Movimentacao>(em, classe);
	}
	
	@Override
	public Movimentacao inserir(Movimentacao entidade) {
		dao.inserir(entidade);
		return entidade;
	}

	@Override
	public void excluir(Movimentacao entidade) {
		dao.excluir(entidade);
	}

	@Override
	public List<Movimentacao> lista() {
		return dao.lista();
	}

	@Override
	public Movimentacao buscar(Long id) {
		return dao.buscar(id);
	}

}
