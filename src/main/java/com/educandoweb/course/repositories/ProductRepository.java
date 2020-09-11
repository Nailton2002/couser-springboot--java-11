package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Product;

//@Repository NAO PRECISA POIS A INTERFACE ESTA ERDANDO
public interface ProductRepository extends JpaRepository<Product, Long> {

}
