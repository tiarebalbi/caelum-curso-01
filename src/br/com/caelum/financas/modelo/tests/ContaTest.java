package br.com.caelum.financas.modelo.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.caelum.financas.modelo.Conta;

/**
 * Conta Model
 *
 * @author tiarebalbi
 * @date 27/10/2012
 * @package br.com.caelum.financas.modelo.tests
 */
public class ContaTest {

	private Conta conta;
	
	
	/**
	 * 
	 */
	@Before
	public void setUp() {
		conta = new Conta() ;
		conta.setAgencia("Agencia");
		conta.setId(new Long(1l));
		conta.setNumero("222");
		conta.setTitular("Titular");
		conta.setBanco("conta1");
	}
	
	/**
	 * 
	 */
	@Test
	public void deveTestarGet () {
		assertEquals("Agencia", conta.getAgencia());
		assertEquals(new Long(1l), conta.getId());
		assertEquals("222", conta.getNumero());
		assertEquals("Titular", conta.getTitular());
		assertEquals("conta1", conta.getBanco());
	}
}
