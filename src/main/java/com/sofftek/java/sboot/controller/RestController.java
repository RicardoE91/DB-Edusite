package com.sofftek.java.sboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.sofftek.java.sboot.entity.Course;
import com.sofftek.java.sboot.service.CourseService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/courses")
public class RestController {
	@Autowired
	CourseService courseService;
	
	@GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public List<Course> getCoursesList(){
		return courseService.listCourses();
	}

}
