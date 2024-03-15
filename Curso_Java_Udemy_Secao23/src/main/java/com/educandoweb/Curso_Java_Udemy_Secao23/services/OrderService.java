package com.educandoweb.Curso_Java_Udemy_Secao23.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.Curso_Java_Udemy_Secao23.entities.Order;
import com.educandoweb.Curso_Java_Udemy_Secao23.repositories.OrderRepository;


@Service 
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	public Order findById(Long id){
		Optional<Order> obj = orderRepository.findById(id);
		return obj.get();
	}
}
