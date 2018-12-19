package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Courseinfo;

public interface CourseinfoDAO extends JpaRepository<Courseinfo, Long> {

}
