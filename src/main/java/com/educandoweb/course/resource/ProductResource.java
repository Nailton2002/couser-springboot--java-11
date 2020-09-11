package com.educandoweb.course.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.service.ProductService;

@RestController
@RequestMapping(value="/products")//CONTROLADOR WEST QUE RESPONDE NO CAMINHO USER
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> FindAll(){
		//Product u = new Product(1L, "Maria", "maria@gmail.com", "9999999", "123456");
		List<Product> list = service.findAll();
				
		return ResponseEntity.ok().body(list);
	}
	
	//ISTO INDICARA MINHA REQUISIÇÃO IRA ACEITAR UM ID DENTRO URL
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}

}
