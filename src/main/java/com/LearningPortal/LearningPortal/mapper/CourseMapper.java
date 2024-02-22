package com.LearningPortal.LearningPortal.mapper;

import java.util.List;
import java.util.Optional;

import org.mapstruct.Mapper;

import com.LearningPortal.LearningPortal.dto.Coursedto;
import com.LearningPortal.LearningPortal.entity.CourseEntity;

@Mapper(componentModel = "spring")
public interface CourseMapper extends EntityMapper<Coursedto, CourseEntity> {
	Coursedto toDto(Optional<CourseEntity> user);

	Coursedto toDto(CourseEntity user);

	CourseEntity toEntity(Coursedto d);

	List<Coursedto> toDto(List<CourseEntity> elist);

	List<CourseEntity> toEntity(List<Coursedto> dlist);
}
