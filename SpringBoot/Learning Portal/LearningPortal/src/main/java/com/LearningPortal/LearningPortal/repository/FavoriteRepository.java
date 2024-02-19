package com.LearningPortal.LearningPortal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.LearningPortal.LearningPortal.entity.CourseEntity;
import com.LearningPortal.LearningPortal.entity.FavoriteEntity;

@Repository
public interface FavoriteRepository extends JpaRepository<FavoriteEntity, Long> {

	// Method to retrieve only active (not soft-deleted) favorites
    List<FavoriteEntity> findByDeletedFalse();
    
    // Override delete method to perform soft delete
    @Override
    default void delete(FavoriteEntity favoriteEntity) {
        favoriteEntity.setDeleted(true);
        save(favoriteEntity);
    }
    
    // Override deleteById method to perform soft delete
    @Override
    default void deleteById(Long id) {
        findById(id).ifPresent(favoriteEntity -> {
            favoriteEntity.setDeleted(true);
            save(favoriteEntity);
        });
    }

	List<FavoriteEntity> findByDeletedTrue();
	
	//native query for getting the list of favorites for a specific user
	@Query(value = "SELECT c.* FROM course c INNER JOIN favorite f ON c.id = f.course_id WHERE f.user_id = :userId", nativeQuery = true)
    List<CourseEntity> findFavoriteCoursesByUserId(Long userId);
}
