package com.educandoweb.course.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.service.OrderService;

@RestController
@RequestMapping(value="/orders")//CONTROLADOR WEST QUE RESPONDE NO CAMINHO Order
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Order>> FindAll(){
		//Order u = new Order(1L, "Maria", "maria@gmail.com", "9999999", "123456");
		List<Order> list = service.findAll();
				
		return ResponseEntity.ok().body(list);
	}
	
	//ISTO INDICARA MINHA REQUISIÇÃO IRA ACEITAR UM ID DENTRO URL
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}

}
