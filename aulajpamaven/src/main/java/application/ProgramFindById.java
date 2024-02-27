package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.entities.Pessoa;

public class ProgramFindById {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		/*
		 * PARA CONSULTAS NÃO PRECISA FAEZR UMA TRANSAÇÃO
		 */
		Pessoa p = em.find(Pessoa.class, 2);
		
		System.out.println(p);
		
		em.close();
		emf.close();

	}

}
