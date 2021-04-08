package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.service.CourseService;


@RestController
public class MyController {
	
	@Autowired
	CourseService courseService;
	

	@GetMapping("/home")
	public String home() {
		
		return "WELCOME TO COURSES APPLICATION ";
	}
	
	// Get the courses
	@GetMapping("/getcourses")
	public List<Course> getCourses(){
		
		return this.courseService.getCourses();
	} 

}


