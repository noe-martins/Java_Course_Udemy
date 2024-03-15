package com.educandoweb.Curso_Java_Udemy_Secao23.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.Curso_Java_Udemy_Secao23.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
