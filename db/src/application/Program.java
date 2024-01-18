package application;

import java.sql.Connection;

import db.DB;

/*
 * ABRINDO E FECHANDO A CONEXÇÃO
 */
public class Program {

	public static void main(String[] args) {
		Connection conn = DB.openConnection();
		DB.closeConnection();
	}

}
