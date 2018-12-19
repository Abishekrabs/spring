package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.AdminBO;
import com.example.demo.entity.admin;

@RestController
public class admindetails {

    @Autowired
    AdminBO bo = null;
   
    @RequestMapping(value = "/admindata", method = RequestMethod.POST)
	public @ResponseBody admin createStudent(@RequestBody admin ad) {
		System.out.println("Name:" + ad.getName());
		System.out.println("Password:" + ad.getPassword());
		bo.saveAdmin(ad);
		return ad;
	}
}
