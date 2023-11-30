package model.exceptions;

public class DomainException extends Exception{
	private static final long serialVersionUID = 1L;
	
	/*
	 * O QUE FAZ: ESSE CONSTRUTOR RECEBE UMA STRING E PASSA PARA A SUPER CLASSE
	 * OBJETIVO: PERMITIR QUE POSSA INSTANCIAR A CLASSE DE EXCEÇÃO PASSANDO UMA MENSAGEM PARA ELA
	 */
	public DomainException(String msg) {
		super(msg);
	}
	
}
