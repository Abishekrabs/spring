package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.admin;


@Repository
public interface AdminDAO extends JpaRepository<admin, Long> {
	
	//@Query("select s from Student s where s.age > :age")
   // List<admin> findByAge(@Param("age") int age);

}
