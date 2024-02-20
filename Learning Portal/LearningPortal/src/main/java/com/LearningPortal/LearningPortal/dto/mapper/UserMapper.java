package com.LearningPortal.LearningPortal.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.LearningPortal.LearningPortal.dto.request.UserRequest;
import com.LearningPortal.LearningPortal.dto.response.UserResponse;
import com.LearningPortal.LearningPortal.entity.UserEntity;

@Mapper
public interface UserMapper {
	UserMapper MAPPER = Mappers.getMapper(UserMapper.class);
	UserEntity fromRequestToEntity(UserRequest userRequest);
    UserResponse fromEntityToResponse(UserEntity userEntity);
}