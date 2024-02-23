package com.effigo.learning.portal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.effigo.learning.portal.dto.Userdto;
import com.effigo.learning.portal.entity.UserEntity;
import com.effigo.learning.portal.mapper.CourseMapper;
import com.effigo.learning.portal.mapper.UserMapper;
import com.effigo.learning.portal.repository.CourseRepository;
import com.effigo.learning.portal.repository.EnrollmentRepository;
import com.effigo.learning.portal.repository.FavoriteRepository;
import com.effigo.learning.portal.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private EnrollmentRepository enrollmentRepository;
	@Autowired
	private FavoriteRepository favouriteRepository;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private CourseMapper courseMapper;

	public Userdto saveUser(Userdto dto) {
		UserEntity entity = userMapper.toEntity(dto);
		userRepository.save(entity);
		return userMapper.toDto(entity);

	}

	public Userdto findUserById(Long userId) {
		Optional<UserEntity> userOptional = userRepository.findById(userId);
		UserEntity user = userOptional.get();
		return userMapper.toDto(user);

	}

	public List<Userdto> findAllUsers() {
		List<UserEntity> entitylist = userRepository.findAll();
		return userMapper.toDto(entitylist);
	}

	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}

	//	public Userdto updateUser(Userdto dto, Long id) {
	//		Optional<UserEntity> checkExistinguser = userRepository.findById(id);
	//		if (!checkExistinguser.isPresent())
	//			log.error("User Id " + id + " Not Found!");
	//
	//		UserEntity entity = userMapper.toEntity(dto);
	//		userRepository.save(entity);
	//		return userMapper.toDto(entity);
	//	}
	public Userdto updateUser(Userdto request, Long id) {
		// Find the user by ID
		UserEntity userEntity = userMapper.toEntity(request);

		Optional<UserEntity> existingUserOptional = userRepository.findById(userEntity.getUserId());
		if (existingUserOptional.isPresent()) {

			userEntity = userRepository.save(userEntity);
		} else {
			log.error("User with id {} not found", userEntity.getUserId());
			throw new RuntimeException("User with id " + userEntity.getUserId() + " not found");
		}
		return userMapper.toDto(userEntity);
	}
}
