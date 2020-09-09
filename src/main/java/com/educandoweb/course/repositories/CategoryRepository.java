package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;

//@Repository NAO PRECISA POIS A INTERFACE ESTA ERDANDO
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
