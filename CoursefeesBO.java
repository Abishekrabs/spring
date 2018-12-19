package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Coursefees;
import com.example.demo.repository.CoursefeesDAO;

@Component
public class CoursefeesBO {
	
	@Autowired
	CoursefeesDAO dao;
	
	public void saveCoursefees (Coursefees cf) {
		dao.save(cf);
		
		System.out.println("Course_fees saved =>");
	}

}
