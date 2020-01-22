package com.sofftek.java.sboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sofftek.java.sboot.entity.Course;
import com.sofftek.java.sboot.service.CourseService;

@Controller
public class WebController {
	@Autowired
	CourseService courseService;
	
	@Value("${runiversity.app.title}")
	private String appTitle;
	
	@Value("${runiversity.app.title2}")
	private String appTitle2;
	
	@Value("${runiversity.app.title3}")
	private String appTitle3;
	
	@Value("${runiversity.app.title4}")
	private String appTitle4;
	
	@GetMapping(value = {"", "/home", "index", "index.html"})
	public String goIndex(Model model) {
		model.addAttribute("ruTitle", appTitle);
		List<Course> courses = courseService.listCourses();
		model.addAttribute("courses", courses);
		return "index";
	}
	
	@GetMapping(value = {"contact", "/contact.html"})
	public String goContact(Model model) {
		model.addAttribute("ruTitle", appTitle2);
		return "contact";
	}
	
	@GetMapping(value = {"blog", "/blog.html"})
	public String goBlog(Model model) {
		model.addAttribute("ruTitle", appTitle3);
		return "blog";
	}
	
	@GetMapping(value = {"blog-post", "/blog-post.html"})
	public String goBlogPost(Model model) {
		model.addAttribute("ruTitle", appTitle4);
		return "blog-post";
	}

}
