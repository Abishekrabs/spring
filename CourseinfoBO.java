package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Courseinfo;
import com.example.demo.repository.CourseinfoDAO;

@Component
public class CourseinfoBO {
	
	@Autowired
	CourseinfoDAO dao;
	
	public void saveCourseinfo (Courseinfo ci) {
		dao.save(ci);
		
		System.out.println("Course_info saved =>");
	}

}
