package com.educandoweb.course.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value="/users")//CONTROLADOR WEST QUE RESPONDE NO CAMINHO USER
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> FindAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "123456");
		return ResponseEntity.ok().body(u);
		
	}

}
