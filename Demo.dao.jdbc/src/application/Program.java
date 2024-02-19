package application;

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
		
		System.out.println("=== TESTE 2: findByDepartment ===");
		List<Seller> list = sellerDao.findByDepartment(new Department(2, null));
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== TESTE 3: findByDepartment ===");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}

	}

}
