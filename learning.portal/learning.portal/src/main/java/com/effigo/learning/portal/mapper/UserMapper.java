package com.effigo.learning.portal.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.effigo.learning.portal.dto.Userdto;
import com.effigo.learning.portal.entity.UserEntity;

@Mapper(componentModel = "spring")
public interface UserMapper extends EntityMapper<Userdto, UserEntity> {
	//	Userdto toDto(Optional<UserEntity> user);

	Userdto toDto(UserEntity user);

	UserEntity toEntity(Userdto d);

	List<Userdto> toDto(List<UserEntity> elist);

	List<UserEntity> toEntity(List<Userdto> dlist);

}