package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/*
 * Em resumo, a classe Properties é como uma pequena tabela onde você guarda informações 
 * importantes para o seu programa. Ela oferece uma maneira organizada 
 * de gerenciar configurações e propriedades usando o conceito de chave-valor.
 */

/*
 * A CLASSE 'getConnection' PEGA A VARIÁVEL 'conn' (QUE FICA RESPONSAVEL PELO STATUS DE CONEXÃO)
 * ACIONA O loadProperties() PARA LER OS DADOS DO ARQUIVO QUE CONTÉM AS CONFIGURAÇÕES
 * SALVA A 'URL' DO BD EM UMA VARIÁVEL DO TIPO String
 * ACIONA O MÉTODO DriveManager COM O MÉTODO getConncection, PASSANDO COMO PARÂMETROS A 'URL' E O Properties.
 * SE A VARIÁVEL 'conn' NÃO FOR 'NULL' RESTABELECE A CONEXÃO QUE JÁ TINHA.
 */
public class DB {
	private static Connection conn = null;
	
	//ABRIR CONEXÃO COM O BD
	public static Connection openConnection() {
		if (conn == null) {
			try {
				Properties props = loadProperties();
				String url = props.getProperty("dburl");
				conn = DriverManager.getConnection(url, props);
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
		return conn;
	}
	//FECHAR CONEXÃO COM O BD
	public static void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	//FECHA O STATEMENT
	public static void closeStatement(Statement st) {
		if(st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	//FECHA O RESULTSET
	public static void closeResultSet(ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	
	//LER AS CONFIGURAÇÕES DO BD
	private static Properties loadProperties() {
		try (FileInputStream fs = new FileInputStream("db.properties")){
			Properties props = new Properties();
			props.load(fs);
			return props;
		} catch (IOException e) {
			throw new DbException(e.getMessage());
		}
	}
	
}
