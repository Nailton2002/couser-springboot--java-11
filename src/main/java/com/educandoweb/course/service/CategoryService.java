package com.educandoweb.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	// DECLARAÇÃO DE DEPENCIAS
	@Autowired
	private CategoryRepository repository;

	// OPERAÇÃO NA CAMADA DE SERVIÇO
	public List<Category> findAll() {
		return repository.findAll();

	}

	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
