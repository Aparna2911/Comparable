package com.LearningPortal.LearningPortal.mapper;

import java.util.List;
import java.util.Optional;

import org.mapstruct.Mapper;

import com.LearningPortal.LearningPortal.dto.Favoritedto;
import com.LearningPortal.LearningPortal.entity.FavoriteEntity;

@Mapper(componentModel = "spring")
public interface FavoriteMapper extends EntityMapper<Favoritedto, FavoriteEntity> {
	Favoritedto toDto(Optional<FavoriteEntity> user);

	Favoritedto toDto(FavoriteEntity user);

	FavoriteEntity toEntity(Favoritedto d);

	List<Favoritedto> toDto(List<FavoriteEntity> elist);

	List<FavoriteEntity> toEntity(List<Favoritedto> dlist);
}