package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmetDao = DaoFactory.createDepartmentDao();
		
		
		System.out.println("=== TESTE 1: insert ===");
		Department dep = new Department(null, "Utensils");
		departmetDao.insert(dep);
		System.out.println("Inserted! New Id = " + dep.getId());

		System.out.println("=== TESTE 2: findById ===");
		Department depReference = departmetDao.findById(3);
		System.out.println(depReference);

		System.out.println("=== TESTE 3: update ===");
		depReference.setName("Clothing");
		departmetDao.update(depReference);
		System.out.println("Updated!");

		System.out.println("=== TESTE 4: delete ===");
		departmetDao.deleteById(6);
		System.out.println("Deleted");
		 
		System.out.println("=== TESTE 5: findAll ===");
		List<Department> list = departmetDao.findAll();
		for (Department department : list) {
			System.out.println(department);
		}
		
	}

}
