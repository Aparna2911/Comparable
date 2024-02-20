package com.LearningPortal.LearningPortal.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.LearningPortal.LearningPortal.dto.request.CategoryRequest;
import com.LearningPortal.LearningPortal.dto.response.CategoryResponse;
import com.LearningPortal.LearningPortal.entity.CategoryEntity;
@Mapper
public interface CategoryMapper {
	CategoryMapper MAPPER = Mappers.getMapper(CategoryMapper.class);
	CategoryEntity fromRequestToEntity(CategoryRequest categoryRequest);
	CategoryResponse fromEntityToResponse(CategoryEntity categoryEntity);
}