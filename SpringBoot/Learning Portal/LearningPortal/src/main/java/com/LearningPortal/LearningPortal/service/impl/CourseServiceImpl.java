package com.LearningPortal.LearningPortal.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.LearningPortal.LearningPortal.entity.CourseEntity;
import com.LearningPortal.LearningPortal.repository.CourseRepository;
import com.LearningPortal.LearningPortal.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{
	
private final CourseRepository courseRepository ;
	
	public CourseServiceImpl(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	@Override
	public List<CourseEntity> findAllCourses() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

	@Override
	public CourseEntity findCourseById(Long id) {
		// TODO Auto-generated method stub
		return courseRepository.findById(id).orElse(null);
	}

	@Override
	public CourseEntity saveCourse(CourseEntity courseEntity) {
		// TODO Auto-generated method stub
		return courseRepository.save(courseEntity);
	}

	@Override
	public CourseEntity updateCourse(CourseEntity courseEntity) {
		// TODO Auto-generated method stub
		return courseRepository.save(courseEntity);
	}

	@Override
	public void deleteCourse(Long courseId) {
		// TODO Auto-generated method stub
		courseRepository.deleteById(courseId);
	}

}
