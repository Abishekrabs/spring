package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Courseinfo;


@Repository
public interface RetrieveDAO extends JpaRepository<Courseinfo, String> {

	@Query("select s,cf from Courseinfo s inner join s.coursefees cf where s.course_code = :code")
    Courseinfo findByCode(@Param("code") String s);

}
