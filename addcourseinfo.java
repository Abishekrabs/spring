package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.CourseinfoBO;
import com.example.demo.entity.Courseinfo;

@RestController
public class addcourseinfo {
	
	@Autowired
    CourseinfoBO bo = null;
   
	 @RequestMapping(value = "/courseinfo", method = RequestMethod.POST)
		public @ResponseBody Courseinfo createCourseinfo(@RequestBody Courseinfo ci) {
			System.out.println("Course_code:" + ci.getCourse_code());
			System.out.println("Course_Name:" + ci.getCourse_name());
			System.out.println("Participant_strength:" + ci.getParticipant_strength());
			System.out.println("Course_Desc:" + ci.getCourse_description());
			bo.saveCourseinfo(ci);
			return ci;
		}

}
