package com.LearningPortal.LearningPortal.service;

import java.util.List;
import java.util.Optional;

import com.LearningPortal.LearningPortal.entity.UserEntity;

public interface UserService{
	List<UserEntity> findAllUser();
	Optional<UserEntity> findById(Long id);
	UserEntity saveUser(UserEntity userEntity);
	UserEntity updateUser(UserEntity userEntity);
	 void deleteUser(Long id);
	 
}