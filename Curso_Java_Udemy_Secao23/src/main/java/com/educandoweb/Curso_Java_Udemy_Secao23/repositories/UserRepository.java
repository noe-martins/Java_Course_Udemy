package com.educandoweb.Curso_Java_Udemy_Secao23.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.Curso_Java_Udemy_Secao23.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	/*
	 * POR DEBAIXO DOS PANOS O SPRING TEM UMA IMPLEMENTAÇÃO PADRÃO PARA ESSA INTERFACE
	 */
}
