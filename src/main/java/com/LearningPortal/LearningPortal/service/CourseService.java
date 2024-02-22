package com.LearningPortal.LearningPortal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LearningPortal.LearningPortal.dto.Coursedto;
import com.LearningPortal.LearningPortal.entity.CourseEntity;
import com.LearningPortal.LearningPortal.mapper.CourseMapper;
import com.LearningPortal.LearningPortal.repository.CourseRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CourseService {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CourseMapper courseMapper;

	public List<Coursedto> findAllCourses() {
		List<CourseEntity> user = courseRepository.findAll();
		return courseMapper.toDto(user);
	}

	public Coursedto findCoursesById(Long id) {
		Optional<CourseEntity> user = courseRepository.findById(id);
		if (user.isPresent()) {
			CourseEntity course = user.get();
			return courseMapper.toDto(course);
		}
		return null;
	}

	public void deleteCourse(Long id) {
		courseRepository.deleteById(id);
	}

	public Coursedto saveCourse(Coursedto courserequest) {
		CourseEntity courseEntity = courseMapper.toEntity(courserequest);
		courseRepository.save(courseEntity);
		return courseMapper.toDto(courseEntity);
	}

	public Coursedto updateCourse(Coursedto courserequest, Long id) {
		Optional<CourseEntity> checkExistinguser = courseRepository.findById(id);
		if (!checkExistinguser.isPresent())
			log.error("Course Id " + id + " Not Found!");
		CourseEntity courseEntity = courseMapper.toEntity(courserequest);
		courseRepository.save(courseEntity);
		return courseMapper.toDto(courseEntity);
	}

}
