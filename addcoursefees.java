package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.CoursefeesBO;
import com.example.demo.entity.Coursefees;

@RestController
public class addcoursefees {

	@Autowired
    CoursefeesBO bo = null;
   
	 @RequestMapping(value = "/coursefees", method = RequestMethod.POST)
		public @ResponseBody Coursefees createCoursefees(@RequestBody Coursefees cf) {
			System.out.println("Course_type:" + cf.getCourse_type());
			System.out.println("Course_Duration:" + cf.getCourse_duration());
			System.out.println("Course_Fees" + cf.getCourse_fees());
			//System.out.println("Info:" + cf.getCourseinfo());
			bo.saveCoursefees(cf);
			return cf;
		}
}
