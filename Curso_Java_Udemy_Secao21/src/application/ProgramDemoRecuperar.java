package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class ProgramDemoRecuperar {

	public static void main(String[] args) {
		
		//INTERFACE DE CONEXÃO COM O BD
		Connection conn = null;
		//INTERFACE PARA INTERAGIR COM O BD
		Statement st = null;
		//INTERFACE QUE GERA UMA TABELA DE DADOS A PARTIR DE CONSULTAS A UM BD	
		ResultSet rs = null;
		
		/*
		 * COMO ESSES SÃO COMANDOS EXTERNOS DE SQL, PODEM GERAR ERROS NO PROCESSO. 
		 * POR ISSO O try...catch
		 */
		try {
			//ABRE CONEXÃO AO BD
			conn = DB.openConnection();
			//CRIA UM OBJETO Statement DO BD QUE FOI CONECTADO
			st = conn.createStatement();
			//EXECUTA A QUERY SQL E SALVA PARA FORMATO TABELA NA VARIÁVEL DO TIPO ResultSet
			rs = st.executeQuery("select * from department");
			
			/*
			 * -- next() --
			 * 1) FUNÇÃO: MOVE PARA O PRÓXIMO ELEMENTO DA TABELA
			 * 2) RETORNO: RETORNA UM boolean. (True -> CASO TENHA ALGUM ELEMENTO; False --> SE JÁ ESTIVER NO ÚLTIMO
			 */
			while(rs.next()) {
				/*
				 * --- getInt() e getString() ---
				 * PEGAM OS VALORES DOS CAMPOS DA TABELA DESCRITOS
				 */
				System.out.println(rs.getInt("Id") + " | " + rs.getString("Name"));
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			//FECHAR TODAS AS CONEXÕES
			DB.closeStatement(st);
			DB.closeResultSet(rs);
			DB.closeConnection();
			
		}
		
	}

}
