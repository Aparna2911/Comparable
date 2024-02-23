package com.effigo.learning.portal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.effigo.learning.portal.entity.CourseEntity;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Long> {

	@Query(value = "SELECT * FROM course c WHERE c.category_id = ?1", nativeQuery = true)
	List<CourseEntity> findByCategoryId(long categoryId);
}
