package br.com.caelum.financas.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("controlefinancas");
	
	/**
	 * @return the em
	 */
	public static EntityManager getEm() {
		return emf.createEntityManager();
	}
}
