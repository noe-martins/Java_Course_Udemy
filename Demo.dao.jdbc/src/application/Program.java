package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		// TODA MANIPULAÇÃO COM O OBJETO "seller" É FEITO ATRAVÉS DO SEU "Dao" (PARA MANIPULAÕES DE BANCO DE DADOS)
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);

	}

}
