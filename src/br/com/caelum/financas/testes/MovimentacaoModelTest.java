package br.com.caelum.financas.testes;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.financas.dao.BaseDAOImpl;
import br.com.caelum.financas.dao.ContaDAO;
import br.com.caelum.financas.dao.MovimentacaoDAO;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class MovimentacaoModelTest {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setAgencia("22244");
		conta.setNumero("333");
		conta.setTitular("Titular");
		conta.setBanco("banco1");
		
		Movimentacao mov = new Movimentacao();
		mov.setConta(conta);
		mov.setData(Calendar.getInstance());
		mov.setDescricao("Descrição1");
		mov.setValor(new BigDecimal("39.01"));
		
	 	EntityManager em = JPAUtil.getEm();
		
	 	MovimentacaoDAO dao = new MovimentacaoDAO(em, Movimentacao.class);
	 	ContaDAO daoConta = new ContaDAO(em, Conta.class);
	 	
		em.getTransaction().begin();
		dao.inserir(mov);
		daoConta.inserir(conta); // Caso você não persista esta conta ele ficará no estado transient
		List<Movimentacao> movimentos = dao.lista();
		
		em.getTransaction().commit();
		em.close();
		
		System.out.println("Total: " + movimentos.size());
		System.out.println("Conta Gravada com Sucesso");
	}
	
}
