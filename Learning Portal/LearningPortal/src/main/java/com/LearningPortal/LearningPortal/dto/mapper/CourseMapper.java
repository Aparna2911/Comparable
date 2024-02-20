package com.LearningPortal.LearningPortal.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.LearningPortal.LearningPortal.dto.request.CourseRequest;
import com.LearningPortal.LearningPortal.dto.response.CourseResponse;
import com.LearningPortal.LearningPortal.entity.CourseEntity;

@Mapper
public interface CourseMapper {
	CourseMapper MAPPER = Mappers.getMapper(CourseMapper.class);
	CourseEntity fromRequestToEntity(CourseRequest courseRequest);
    CourseResponse fromEntityToResponse(CourseEntity courseEntity);
}
