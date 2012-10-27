package br.com.caelum.financas.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class ContaDAO implements BaseDAO<Conta>{
	
	private EntityManager em;
	
	public ContaDAO (EntityManager em) {
		this.em = em;
	}
	
	@Override
	public Conta inserir(Conta conta) {
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();
		em.close();
		return conta;
	}

	@Override
	public void excluir(Conta entidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Conta> lista() {
		EntityManager em = JPAUtil.getEm();
		em.getTransaction().begin();
		String string = "SELECT c FROM Conta c";
		List<Conta> contas = em.createQuery(string).getResultList();
		em.getTransaction().commit();
		em.close();
		return contas;
	}

	

}
