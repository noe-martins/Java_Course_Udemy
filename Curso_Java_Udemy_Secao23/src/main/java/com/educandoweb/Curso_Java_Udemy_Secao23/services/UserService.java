package com.educandoweb.Curso_Java_Udemy_Secao23.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.Curso_Java_Udemy_Secao23.entities.User;
import com.educandoweb.Curso_Java_Udemy_Secao23.repositories.UserRepository;

/*
 * ESSA É A CAMADA QUE FAZ AS OPERAÇÕES COM O BD USANDO AS REGRAS DE NEGÓCIO
 */
@Service // REGISTRA ESSA CLASSE COMO UM COMPONENTE DO SPRING QUE PODE SER INJETADO NAS DEPENDÊNCIAS
public class UserService {
	// VAI USAR A CAMADA "Repository". (DEPENDÊNCIA)
	@Autowired
	private UserRepository userRepository;
	
	// FAZ UMA LIST COM TODOS OS ELEMENTOS DO BD
	/*
	 * SOLICITA A CAMADA "Repository" ESSA LISTA
	 */
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(Long id){
		/*
		 * Optional --> É UMA CLASSE CRIADA PELO JAVA 8 PARA DEIXAR MAIS ELEGANTE POSSÍVEIS
		 * ELEMENTOS QUE SEJAM "NULOS"
		 */
		Optional<User> obj = userRepository.findById(id);
		return obj.get();
	}
}
