package br.com.fiap.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExercicioJPA3");

	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}