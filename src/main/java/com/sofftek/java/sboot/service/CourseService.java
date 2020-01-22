package com.sofftek.java.sboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sofftek.java.sboot.entity.Course;
import com.sofftek.java.sboot.repository.CourseRepository;

@Service
public class CourseService {
	private CourseRepository courseRepository;
	
	@Autowired
	public CourseService(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}
	
	public List<Course> listCourses(){
		List<Course> courses = (List<Course>) courseRepository.findAll();
		return courses;
	}
}