package com.effigo.learning.portal.mapper;

import java.util.List;
import java.util.Optional;

import org.mapstruct.Mapper;

import com.effigo.learning.portal.dto.Favoritedto;
import com.effigo.learning.portal.entity.FavoriteEntity;

@Mapper(componentModel = "spring")
public interface FavoriteMapper extends EntityMapper<Favoritedto, FavoriteEntity> {
	Favoritedto toDto(Optional<FavoriteEntity> user);

	Favoritedto toDto(FavoriteEntity user);

	FavoriteEntity toEntity(Favoritedto d);

	List<Favoritedto> toDto(List<FavoriteEntity> elist);

	List<FavoriteEntity> toEntity(List<Favoritedto> dlist);
}