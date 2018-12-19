package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Courseinfo;
import com.example.demo.repository.RetrieveDAO;

@Component
public class RetrieveBO {

	@Autowired
	RetrieveDAO dao;

	public Courseinfo findCourseByCode(String s) {
		System.out.println("Retrieve BO : course code="+s);
		return dao.findByCode(s);
	}
}
