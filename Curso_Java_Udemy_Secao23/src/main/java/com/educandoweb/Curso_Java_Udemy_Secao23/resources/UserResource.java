package com.educandoweb.Curso_Java_Udemy_Secao23.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.Curso_Java_Udemy_Secao23.entities.User;
import com.educandoweb.Curso_Java_Udemy_Secao23.services.UserService;

@RestController //DIZ QUE A CLASSE SERÁ UM CONTROLADOR DE REQUISIÇÕES DA APLICAÇÃO
@RequestMapping(value = "/users") //CAMINHO QUE DARÁ RESPOSTA A REQUISIÇÃO DO CLIENTE
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	/*
	 * FUNÇÃO: PEGAR TODOS OS ELEMENTOS DO BD
	 */
	@GetMapping //INFORMO QUE ESSE RESPONDERÁ A O TIPO DE RESPOSTA 'GET'
	//IRÁ ENVIAR UMA RESPOSTA DO TIPO "USER", OBJETO CRIADO
	public ResponseEntity<List<User>> findAll(){
		List<User> list = userService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	/*
	 * FUNÇÃO: PEGAR UM DETERMINADO ELEMENTO NO BD PELO SEU "ID"
	 * 
	 * INFORMA QUE NA REQUISIÇÃO VAI RECEBER UMA VARIÁVEL NA URL.
	 * 
	 * MAIS UMA VEZ USA COMO DEPENDÊNCIA A CAMADA "Service"
	 */
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = userService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
