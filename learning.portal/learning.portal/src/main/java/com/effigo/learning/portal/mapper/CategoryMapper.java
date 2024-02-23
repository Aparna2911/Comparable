package com.effigo.learning.portal.mapper;

import java.util.List;
import java.util.Optional;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.effigo.learning.portal.dto.Categorydto;
import com.effigo.learning.portal.entity.CategoryEntity;

@Component
@Mapper(componentModel = "spring")
public interface CategoryMapper extends EntityMapper<Categorydto, CategoryEntity> {
	Categorydto toDto(Optional<CategoryEntity> user);

	Categorydto toDto(CategoryEntity user);

	CategoryEntity toEntity(Categorydto d);

	List<Categorydto> toDto(List<CategoryEntity> elist);

	List<CategoryEntity> toEntity(List<Categorydto> dlist);
}
