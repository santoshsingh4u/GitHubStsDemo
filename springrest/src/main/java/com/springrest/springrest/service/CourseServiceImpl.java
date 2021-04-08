package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;


@Service
public class CourseServiceImpl implements CourseService {

	private List<Course> list;
		
	public CourseServiceImpl() {
		
		list = new ArrayList<>();
		
		list.add(new Course(123,"java cousrse","basic java courses"));
		list.add(new Course(1256,"c++ cousrse","basic c++ courses"));
		list.add(new Course(345,"Big data course","basic Big data courses"));
		list.add(new Course(347,"Big data course -3","ADVANCEDBig data courses"));
		
	}
	
	public List<Course> getCourses() {
		
		return list;
	}

}
