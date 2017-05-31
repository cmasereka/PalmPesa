package com.palmpesa.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.palmpesa.domain.Order;
import com.palmpesa.domain.Person;
import com.palmpesa.domain.Product;
import com.palmpesa.repository.OrderRepository;

@Service
@Transactional
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;
	
	public Order save(Order order){
		return orderRepository.save(order);
	}
	
	public void delete(Order order){
		orderRepository.delete(order);
	}
	
	public List<Order> findByProduct(Product product) {
		return orderRepository.findDistinctOrderByOrderLines_Product(product);
	}
	
	public List<Order> findByPerson(Person person) {
		return orderRepository.findOrderByPerson(person);
	}

	public List<Order> findByDate(Date minDate, Date maxDate) {
		return orderRepository.findOrderByOrderDateBetween(minDate, maxDate);
	}

	public Order findById(int id){
		return orderRepository.findOne(id);
	}

	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	public void update(Order order) {
		List<Order> orders = orderRepository.findAll();
		for(Order p: orders){
			if(p.equals(order)){
				orderRepository.save(order);
				break;
			}
		}
	}

}
