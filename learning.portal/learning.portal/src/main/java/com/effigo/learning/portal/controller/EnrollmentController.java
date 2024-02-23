package com.effigo.learning.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.effigo.learning.portal.dto.Enrollmentdto;
import com.effigo.learning.portal.service.EnrollmentService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/Enrollments")
public class EnrollmentController {
	@Autowired
	private EnrollmentService enrollmentService;

	@GetMapping
	public List<Enrollmentdto> findAllEnrollment() {
		log.info("Fetching all the Enrollments");
		return enrollmentService.findAllEnrollment();
	}

	@GetMapping("/{enrollmentId}")
	public Enrollmentdto findById(@PathVariable("enrollmentId") Long id) {
		log.info("Fetching enrollment details");
		return enrollmentService.findById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteEnrollment(@PathVariable("id") Long id) {
		log.info("enrollment details are deleted");
		enrollmentService.deleteUserCourseEnrollment(id);
	}

	@PostMapping
	public Enrollmentdto saveEnrollment(@RequestBody Enrollmentdto request) {
		log.info("Enrollment is created");
		return enrollmentService.saveUserCourseEnrollment(request);
	}
}
