package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.admin;
import com.example.demo.repository.AdminDAO;

@Component
public class AdminBO {

	@Autowired
	AdminDAO dao;

	public void saveAdmin(admin ad) {
		dao.save(ad);
		
		System.out.println("student saved-->" +ad.getName());
	}

}
