package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.RetrieveBO;
import com.example.demo.entity.Courseinfo;
import com.example.demo.entity.process;

@RestController
public class retrievecourse {

	@Autowired
	RetrieveBO bo =null;
	
	@RequestMapping(value = "/retrievecourse", method = RequestMethod.POST)
	public @ResponseBody process fetchCourse(@RequestBody String s) {
		System.out.println("course code:" + s);
		Courseinfo ci =bo.findCourseByCode(s);
		
		System.out.println("Courseinfo " +ci);
		System.out.println("Coursefees " +ci.getCoursefees());
		
		process pro =new process();
		pro.setCourse_code(ci.getCourse_code());
		pro.setCourse_name(ci.getCourse_name());
		pro.setParticipant_strength(ci.getParticipant_strength());
		pro.setCourse_description(ci.getCourse_description());
		pro.setCourse_type(ci.getCoursefees().getCourse_type());
		pro.setCourse_duration(ci.getCoursefees().getCourse_duration());
		pro.setCourse_fees(ci.getCoursefees().getCourse_fees());
		return pro;
	}
}
