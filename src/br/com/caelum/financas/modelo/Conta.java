package br.com.caelum.financas.modelo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;

/**
 * Entidade Conta
 *
 * @author tiarebalbi
 * @date 27/10/2012
 * @package br.com.caelum.financas.modelo
 */
@Entity
public class Conta {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable=false)
	private String agencia;
	
	@Column(nullable=false)
	private String numero;
	
	private String titular;

	private String banco;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the agencia
	 */
	public String getAgencia() {
		return agencia;
	}

	/**
	 * @param agencia the agencia to set
	 */
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the titular
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * @param titular the titular to set
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * @param string
	 */
	public void setBanco(String string) {
		this.banco = string;
	}
	
	/**
	 * @return <String>
	 */
	public String getBanco() {
		return this.banco;
	}
	

}
