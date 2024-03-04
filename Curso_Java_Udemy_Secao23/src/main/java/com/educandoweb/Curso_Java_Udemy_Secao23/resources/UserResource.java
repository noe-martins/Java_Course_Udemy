package com.educandoweb.Curso_Java_Udemy_Secao23.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.Curso_Java_Udemy_Secao23.entities.User;

@RestController //DIZ QUE A CLASSE SERÁ UM CONTROLADOR DE REQUISIÇÕES DA APLICAÇÃO
@RequestMapping(value = "/users") //CAMINHO QUE DARÁ RESPOSTA A REQUISIÇÃO DO CLIENTE
public class UserResource {
	/*
	 * ResponseEntity<T>:
	 * ELA PERMITE QUE VOCÊ CONSTRUA UMA RESPOSTA HTTP COM UM STATUS, CABEÇALHOS E 
	 * CORPO PERSONALIZADOS PARA ENVIAR DE VOLTA AO CLIENTE QUE FEZ A REQUISIÇÃO.
	 * 
	 * COM RESPONSEENTITY<T>, VOCÊ TEM CONTROLE TOTAL SOBRE O QUE ESTÁ SENDO RETORNADO 
	 * PARA O CLIENTE. ISSO SIGNIFICA QUE VOCÊ PODE DEFINIR O STATUS DA RESPOSTA (COMO 200 OK, 404 NOT FOUND, ETC.), 
	 * ADICIONAR CABEÇALHOS PERSONALIZADOS E INCLUIR DADOS ESPECÍFICOS NO CORPO DA RESPOSTA.
	 */
	
	@GetMapping //INFORMO QUE ESSE RESPONDERÁ A O TIPO DE RESPOSTA 'GET'
	//IRÁ ENVIAR UMA RESPOSTA DO TIPO "USER", OBJETO CRIADO
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "123456");
		/*
		 * ok():
		 * O MÉTODO OK() É UM MÉTODO ESTÁTICO FORNECIDO PELA CLASSE RESPONSEENTITY<T> 
		 * QUE CRIA UMA INSTÂNCIA DE RESPONSEENTITY COM O STATUS HTTP "200 OK".
		 * 
		 * ELE É USADO QUANDO VOCÊ DESEJA CRIAR UMA RESPOSTA HTTP INDICANDO QUE A OPERAÇÃO FOI BEM-SUCEDIDA E, 
		 * POR PADRÃO, NÃO HÁ NECESSIDADE DE ESPECIFICAR UM CORPO DE RESPOSTA.
		 * 
		 * body():
		 * VAI ESCREVER NO CORPO DA PÁGINA UMA RESPOSTA
		 */
		return ResponseEntity.ok().body(u);
	}
	
}
