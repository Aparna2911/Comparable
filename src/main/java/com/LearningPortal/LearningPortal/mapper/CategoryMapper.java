package com.LearningPortal.LearningPortal.mapper;

import java.util.List;
import java.util.Optional;

import org.mapstruct.Mapper;

import com.LearningPortal.LearningPortal.dto.Categorydto;
import com.LearningPortal.LearningPortal.entity.CategoryEntity;

@Mapper(componentModel = "spring")
public interface CategoryMapper extends EntityMapper<Categorydto, CategoryEntity> {
	Categorydto toDto(Optional<CategoryEntity> user);

	Categorydto toDto(CategoryEntity user);

	CategoryEntity toEntity(Categorydto d);

	List<Categorydto> toDto(List<CategoryEntity> elist);

	List<CategoryEntity> toEntity(List<Categorydto> dlist);
}
