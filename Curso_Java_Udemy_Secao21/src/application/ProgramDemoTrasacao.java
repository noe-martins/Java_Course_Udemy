package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class ProgramDemoTrasacao {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		
		try {
			conn = DB.openConnection();
			
			//RETIRA O AUTO COMMIT
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			
			int rows = st.executeUpdate("UPDATE seller SET BaseSalary = 1000.00 WHERE DepartmentId = 1");
			
			//ERRO CRIADO
			int x = 1;
			if (x < 2) {
				throw new SQLException("Fake error!");
			}
			
			//DÁ O COMMIT DA TRANSAÇÃO
			conn.commit();
			
			System.out.println("Done! Rows Affected: " + rows);
		} catch (SQLException e) {
			try {
				//RETORNA A TRANSAÇÃO PARA O ESTADO ANTERIOR
				conn.rollback();
				throw new DbException("Trasaction rolled back! Caused by: " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Error trying to rollback! Caused by: " + e.getMessage());
			}
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
