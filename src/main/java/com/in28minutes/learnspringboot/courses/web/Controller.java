package com.in28minutes.learnspringboot.courses.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.learnspringboot.courses.business.BusinessService;
import com.in28minutes.learnspringboot.courses.bean.Course;

@RestController
public class Controller {
	
	@Autowired
	private BusinessService businessService;
	
	Controller(BusinessService businessService){
		this.businessService = businessService;
	}
	
	// http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		List<Course> courses = List.of(new Course(1, "Learn Microservices", "in28minutes"),
				new Course(2, "Learn Full Stack with Angular and React", "in28minutes"));
		return courses;
	}
	
	// http://localhost:8080/courses/1
	@GetMapping("/courses/1")
	public Course getCourse() {
		return new Course(1, "Learn Microservices", "in28minutes");
	}
}

