package br.com.caelum.financas.testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.caelum.financas.modelo.Conta;

public class ContaTest {

	private Conta conta;
	
	@Before
	public void setUp() {
		conta = new Conta() ;
		conta.setAgencia("Agencia");
		conta.setId(new Long(1l));
		conta.setNumero("222");
		conta.setTitular("Titular");
	}
	
	@Test
	public void deveTestarGet () {
		assertEquals("Agencia", conta.getAgencia());
		assertEquals(new Long(1l), conta.getId());
		assertEquals("222", conta.getNumero());
		assertEquals("Titular", conta.getTitular());
		assertEquals("conta1", conta.getBanco());
	}
}
