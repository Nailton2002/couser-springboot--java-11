package com.educandoweb.course.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.service.CategoryService;

@RestController
@RequestMapping(value="/categories")//CONTROLADOR WEST QUE RESPONDE NO CAMINHO USER
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> FindAll(){
		//Category u = new Category(1L, "Maria", "maria@gmail.com", "9999999", "123456");
		List<Category> list = service.findAll();
				
		return ResponseEntity.ok().body(list);
	}
	
	//ISTO INDICARA MINHA REQUISIÇÃO IRA ACEITAR UM ID DENTRO URL
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}

}
