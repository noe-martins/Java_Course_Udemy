package model.dao;

import model.dao.impl.SellerDaoJDBC;

/**
 * INSTANCIA NA MEMÓRIA A CLASSE QUE IMPLEMENTOU A INTERFACE.
 */
public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
	
}
