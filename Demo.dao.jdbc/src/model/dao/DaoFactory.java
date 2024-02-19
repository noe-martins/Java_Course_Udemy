package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

/**
 * INSTANCIA NA MEMÓRIA A CLASSE QUE IMPLEMENTOU A INTERFACE.
 */
public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		// COM O CONSTRUTOR NA "SellerDaoJDBC" EXIGINDO UM "conn", ENTÃO PASSA A ABERTURA DA CONEXÃO
		return new SellerDaoJDBC(DB.openConnection());
	}
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.openConnection());
	}
	
}
