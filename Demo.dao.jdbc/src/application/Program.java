package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TESTE 1: findById ===");
		// TODA MANIPULAÇÃO COM O OBJETO "seller" É FEITO ATRAVÉS DO SEU "Dao" (PARA MANIPULAÕES DE BANCO DE DADOS)
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TESTE 2: findByDepartment ===");
		List<Seller> list = sellerDao.findByDepartment(new Department(2, null));
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TESTE 3: findAll===");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TESTE 4: insert ===");
		Seller newSeller = new Seller(null, "Noé", "noe@gmail.com", new Date(), 4000.00, new Department(1, null));
		sellerDao.insert(newSeller);
		System.out.println("inserted! New id = " + newSeller.getId());
		
		System.out.println("\n=== TESTE 5: update ===");
		seller = sellerDao.findById(1); //PEGA OS DADOS QUE TEM O ID 1
		seller.setName("Rute Ester"); //MODIFICA O CAMPO DESEJADO
		sellerDao.update(seller); //ATUALIZA NO OBJETO E NO BD
		
	}

}
