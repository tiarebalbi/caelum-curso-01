package br.com.caelum.financas.testes;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.financas.dao.ContaDAO;
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
		
		ContaDAO dao = new ContaDAO(em);
		dao.inserir(conta);
		List<Conta> contas = dao.lista();
		
		System.out.println("Total: " + contas.size());
		System.out.println("Conta Gravada com Sucesso");
	}
	
}
