package db;
/*
 * FOI CRIADO UMA EXCEPTION PERSONALIZADA QUE EXTENDE DA RuntimeException, PARA QUE NÃO SEJA OBRIGADO A TRATAR A EXCEÇÃO.
 * ISSO VAI EVITAR COLOCAR "try...catch" CONSTANTEMENTE NO CÓDIGO.
 */
public class DbException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DbException(String msg) {
		super(msg);
	}

}