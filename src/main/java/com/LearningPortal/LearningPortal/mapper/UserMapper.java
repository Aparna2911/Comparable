package com.LearningPortal.LearningPortal.mapper;

import java.util.List;
import java.util.Optional;

import org.mapstruct.Mapper;

import com.LearningPortal.LearningPortal.dto.Userdto;
import com.LearningPortal.LearningPortal.entity.UserEntity;

@Mapper(componentModel = "spring")
public interface UserMapper extends EntityMapper<Userdto, UserEntity> {
	Userdto toDto(Optional<UserEntity> user);

	Userdto toDto(UserEntity user);

	UserEntity toEntity(Userdto d);

	List<Userdto> toDto(List<UserEntity> elist);

	List<UserEntity> toEntity(List<Userdto> dlist);

}