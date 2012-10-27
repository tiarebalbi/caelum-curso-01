package br.com.caelum.financas.testes;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.financas.dao.ContaDAO;
import br.com.caelum.financas.dao.BaseDAOImpl;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class ContaModelTest {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setAgencia("22244");
		conta.setNumero("333");
		conta.setTitular("Titular");
		conta.setBanco("banco1");
		
	 	EntityManager em = JPAUtil.getEm();
		
	 	ContaDAO dao = new ContaDAO(em, Conta.class);
		em.getTransaction().begin();
		
		Conta insert = dao.inserir(conta);
		
		dao.excluir(insert);
		
		em.getTransaction().commit();
		List<Conta> contas = dao.lista();
		
		
		em.close();
		
		System.out.println("Total: " + contas.size());
		System.out.println("Conta Gravada com Sucesso");
	}
	
}
