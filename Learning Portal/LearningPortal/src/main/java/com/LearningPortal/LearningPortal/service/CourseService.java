package com.LearningPortal.LearningPortal.service;

import java.util.List;

import com.LearningPortal.LearningPortal.entity.CourseEntity;

public interface CourseService {
	
	 List<CourseEntity> findAllCourses();
	 CourseEntity findCourseById(Long id);
	 CourseEntity saveCourse(CourseEntity courseEntity);
	 CourseEntity updateCourse(CourseEntity courseEntity);
	 void deleteCourse(Long courseId);
}
