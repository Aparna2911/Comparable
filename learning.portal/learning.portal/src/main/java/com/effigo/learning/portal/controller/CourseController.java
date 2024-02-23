package com.effigo.learning.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.effigo.learning.portal.dto.Coursedto;
import com.effigo.learning.portal.service.CourseService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/courses")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/findAll")
	public List<Coursedto> findAllCourses() {
		log.info("finding all users");
		return courseService.findAllCourses();
	}

	@GetMapping("/{courseId}")
	public Coursedto findCoursesById(@PathVariable("courseId") Long id) {
		log.info("finding through Id");
		return courseService.findCoursesById(id);
	}

	@DeleteMapping("/{courseId}")
	public void deleteCourse(@PathVariable("courseId") Long id) {
		log.info("course is deleted");
		courseService.deleteCourse(id);
	}

	@PostMapping
	public Coursedto saveCourse(@RequestBody Coursedto request) {
		log.info("course is created");
		return courseService.saveCourse(request);
	}

	@PutMapping("/update/{courseId}")
	public Coursedto updateCourse(@RequestBody Coursedto request, @PathVariable("courseId") Long id) {
		log.info("course is updated");
		return courseService.updateCourse(request, id);
	}
}