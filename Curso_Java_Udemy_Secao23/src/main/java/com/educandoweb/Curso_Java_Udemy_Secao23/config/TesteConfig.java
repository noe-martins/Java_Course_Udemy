package com.educandoweb.Curso_Java_Udemy_Secao23.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.Curso_Java_Udemy_Secao23.entities.User;
import com.educandoweb.Curso_Java_Udemy_Secao23.repositories.UserRepository;

/*
 * ESSA É UMA CLASSE AUXILIAR PARA FAZER OPERAÇÕES TESTES NA APLICAÇÃO COM O BD
 */
@Configuration
@Profile("test") //ISSO IDENTIFICA PARA O SPRING QUE ESSA CLASSE SÓ VAI RODAR QUANDO ESTIVER NO PERFIL DE TESTE
public class TesteConfig implements CommandLineRunner {
	
	/*
	 * COMO ESSA CLASSE FARÁ OPERAÇÃO NO BD E AS CLASSES RESPONSÁVEIS POR ISSO
	 * SÃO AS DO PACOTE "repositories". ENTÃO, É FEITO UMA INJEÇÃO DE DEPENDÊNCIA.
	 * O SPRING JÁ FAZ ISSO POR DETRÁS DOS PANOS USANDO O "@Autowired"
	 */
	@Autowired
	private UserRepository userRepository;
	
	/*
	 * FAZ ESSE MÉTODO RODAR QUANDO A APLICAÇÃO SPRING FOR EXECUTADA
	 */
	@Override
	public void run(String... args) throws Exception {
		//null, PORQUE O PRÓPRIO BD IRÁ AUTO INCREMENTAR
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		//O MÉTODO saveAll() SALVA E CONVERTE NO BD UMA LISTA DE OBJETOS
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
	
}
