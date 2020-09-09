package com.educandoweb.course.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.service.UserService;

@RestController
@RequestMapping(value="/users")//CONTROLADOR WEST QUE RESPONDE NO CAMINHO USER
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> FindAll(){
		//User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "123456");
		List<User> list = service.findAll();
				
		return ResponseEntity.ok().body(list);
	}
	
	//ISTO INDICARA MINHA REQUISIÇÃO IRA ACEITAR UM ID DENTRO URL
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}

}
