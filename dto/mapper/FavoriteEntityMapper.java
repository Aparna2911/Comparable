package com.LearningPortal.LearningPortal.dto.mapper;

import java.util.List;
import java.util.Optional;

import org.mapstruct.Mapper;

import com.LearningPortal.LearningPortal.dto.FavoriteEntitydto;
import com.LearningPortal.LearningPortal.entity.FavoriteEntity;

@Mapper(componentModel = "spring")
public interface FavoriteEntityMapper extends EntityMapper<FavoriteEntitydto, FavoriteEntity> {
	FavoriteEntitydto toDto(Optional<FavoriteEntity> user);

	FavoriteEntitydto toDto(FavoriteEntity user);

	FavoriteEntity toEntity(FavoriteEntitydto d);

	List<FavoriteEntitydto> toDto(List<FavoriteEntity> elist);

	List<FavoriteEntity> toEntity(List<FavoriteEntitydto> dlist);
}