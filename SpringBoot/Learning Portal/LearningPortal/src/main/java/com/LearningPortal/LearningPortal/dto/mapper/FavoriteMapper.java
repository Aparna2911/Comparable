package com.LearningPortal.LearningPortal.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.LearningPortal.LearningPortal.dto.request.FavoriteRequest;
import com.LearningPortal.LearningPortal.dto.response.FavoriteResponse;
import com.LearningPortal.LearningPortal.entity.FavoriteEntity;

@Mapper
public interface FavoriteMapper {
	FavoriteMapper MAPPER = Mappers.getMapper(FavoriteMapper.class);
	FavoriteEntity fromRequestToEntity(FavoriteRequest favoriteRequest);
    FavoriteResponse fromEntityToResponse(FavoriteEntity favoriteEntity);
    
}