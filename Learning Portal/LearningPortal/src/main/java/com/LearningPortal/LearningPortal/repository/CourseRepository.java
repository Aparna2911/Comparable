package com.LearningPortal.LearningPortal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LearningPortal.LearningPortal.entity.CategoryEntity;
import com.LearningPortal.LearningPortal.entity.CourseEntity;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Long> {

	
}
