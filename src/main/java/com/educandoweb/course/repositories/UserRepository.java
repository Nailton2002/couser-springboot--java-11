package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

//@Repository NAO PRECISA POIS A INTERFACE ESTA ERDANDO
public interface UserRepository extends JpaRepository<User, Long> {

}
