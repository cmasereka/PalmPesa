package com.palmpesa.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.palmpesa.domain.Order;
import com.palmpesa.domain.Person;
import com.palmpesa.domain.Product;

public interface OrderRepository extends JpaRepository<Order, Integer>{
	
	List<Order> findDistinctOrderByOrderLines_Product(Product product);
	List<Order> findOrderByPerson(Person person);
	List<Order> findOrderByOrderDateBetween(Date minDate, Date maxDate);
	

}
