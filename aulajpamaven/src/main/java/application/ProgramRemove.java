package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.entities.Pessoa;

public class ProgramRemove {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		/*
		 * SÓ É POSSÍVEL REMOVER ELEMENTOS MONITORADOS (QUE FORAM DECLARADOS).
		 * POR ISSO É NECESSÁRIO CHAMAR O find() E CRIAR UM OBJETO.
		 */
		Pessoa p = em.find(Pessoa.class, 2);
		
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Removido!");
		
		em.close();
		emf.close();
	}

}
