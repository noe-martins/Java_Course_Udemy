package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbIntegrityException;

public class ProgramDemoDeletar {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.openConnection();
			
			/*
			 * COMANDO SQL PARA DELETAR
			 */
			st = conn.prepareStatement(
					"DELETE FROM department "
					+ "WHERE "
					+ "(Id = ?)"
					);
			st.setInt(1, 5);
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Done! Rows Affected: " + rowsAffected);
		} catch (SQLException e) {
			//EXCEÇÃO CASO O "Id" JÁ FOI USADO EM OUTRA TABELA COMO CHAVE ESTRANGEIRA
			throw new DbIntegrityException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
